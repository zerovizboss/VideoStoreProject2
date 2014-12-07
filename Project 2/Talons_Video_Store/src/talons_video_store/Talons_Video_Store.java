/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talons_video_store;
import java.sql.*;
//import java.io.*;

        
/**
 *
 * @author Donald Dedman n00816280
 */
public class Talons_Video_Store {
    
    /**
     * @param args the command line arguments
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Controller ctlControl = new Controller();
        ctlControl.SQLConnection();
        //ctlControl.Excecute();
    }
    

}
