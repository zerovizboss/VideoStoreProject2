/* Example2.java
 * This sample shows how to list codes, descriptions, prices, and quantities on hand
 * of all products from the PRODUCT table, using prepared statement.
 *
 * It uses the JDBC THIN driver.
 */

// You need to import the java.sql package to use JDBC
import java.sql.*;
import java.io.*;  

class Example2
{
  public static void main (String args [])
       throws SQLException
  {

    System.out.print("userid: ");
    String uid = getString();

    System.out.print("password: ");
    String pword = getString();

    String url = "jdbc:oracle:thin:@cop4720.ccec.unf.edu:1521:orcl";

    // Load the Oracle JDBC driver

    DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

    // Connect to the database
    
    Connection conn =
      DriverManager.getConnection (url, uid, pword);

    // Create a prepared statement

    String q = "select P_CODE, P_DESCRIPT, P_PRICE, P_ONHAND " +
               "from PRODUCT " +
               "where V_CODE= ?";

    PreparedStatement pstmt =
      conn.prepareStatement (q);

    System.out.println("\nEnter vendor code, \nThen product code, " +
                       "description, price, and quantity on hand " +
                       "will be displayed\n");

    int v = 1;

    while (v != 0) {
      // read in vendor code
      System.out.print("Vendor Code (enter 0 for exit): ");
      v = getInt();
      pstmt.setInt(1, v);

      ResultSet rset = pstmt.executeQuery();

      System.out.println("\n");

      // Iterate through the result and print the employee names
      while (rset.next ()) {
        String pcode = rset.getString("P_CODE");
        String pdescript = rset.getString("P_DESCRIPT");
        float pprice = rset.getFloat("P_PRICE");
        int ponhand = rset.getInt("P_ONHAND");        
        System.out.println (pcode + ":" + pdescript + ":" + 
                            pprice + ":" + ponhand);
      } // while rset

      System.out.println("\n");
    } // while v

  } // main

 public static String getString() {
	try {
	    StringBuffer buffer = new StringBuffer();
        int c = System.in.read();
        while (c != '\n' && c != -1) {
    	  buffer.append((char)c);
          c = System.in.read();
          }
        return buffer.toString().trim();
        }
        catch (IOException e){return "";}
    }

  public static int getInt() 

  {
      String s= getString();
      return Integer.parseInt(s);
  }

} // ex2












