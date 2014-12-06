/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talons_video_store;
import java.sql.*;
import java.io.*;

        
/**
 *
 * @author Donald
 */
public class Talons_Video_Store {

    /**
     * @param args the command line arguments
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String connection = "jdbc:mysql://23.229.180.72:3306/Video Store";
        String user = "root";
        String password = "root";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(connection,user,password);
        if(!con.isClosed()){
            con.close();
        }
    }    
}
