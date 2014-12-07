/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package talons_video_store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Donny Dedman...n00816280
 */
public class Controller 
{
    
    
    public Controller()
    {
        String statement = "CREATE TABLE test;";
        
    }
    
    public void Excecute()
    {
        //test creating database
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
            Connection mySQLconn = DriverManager.getConnection(connection,user,password);
            if(!mySQLconn.isClosed()){
                mySQLconn.close();
            }
        }
        catch (SQLException sqlExc){   
            System.out.println("SQLException Error" + sqlExc);
        }
        catch (ClassNotFoundException cnfeExc){
            System.out.println("Class Not Found Exception Error" + cnfeExc);
        }
    }
}
