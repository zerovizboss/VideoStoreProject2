/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package talons_video_store;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement
import java.sql.*;

/**
 *
 * @author Donny Dedman, Tim Folds and Ashley Barr
 */
public class Controller 
{
    
    Connection mySQLconn;
    Statement stmt;
    ResultSet rs;
    public Controller()
    {
        //Connection mySQLconn;
    }
    
    public void Excecute()
    {
       
    }
    
    public void SQLConnection()
    {
        try {
            //SQL connection declarations
            String driver = "com.mysql.jdbc.Driver";
            String connection = "jdbc:mysql://23.229.180.72:3306/VideoStore";
            String user = "Video";
            String password = "unfproject2";

            //Load mySQL JDBC driver and connect
            Class.forName(driver);
            mySQLconn = DriverManager.getConnection(connection,user,password);
            if(!mySQLconn.isClosed()){
                mySQLconn.close();
            }
            stmt = mySQLconn.createStatement();
            rs = stmt.executeQuery("select * from customer");
            System.out.println(rs);
        }
        catch (SQLException sqlExc){   
            System.out.println("SQLException Error" + sqlExc);
        }
        catch (ClassNotFoundException cnfeExc){
            System.out.println("Class Not Found Exception Error" + cnfeExc);
        }
    }
}
