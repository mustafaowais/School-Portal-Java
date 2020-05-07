/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import GUI.*;
import com.sun.glass.ui.Cursor;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
public class Connect 
{
    static Connection con=null;
    ResultSet rs=null;
    Statement st=null;
    PreparedStatement pstmt=null;
    public static Connection setConnection() throws ClassNotFoundException, IOException  {
           
        try {
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-C2VVH4T:1433;databaseName=School","sa","awais123");
              System.out.println("Connection Established 1 ");
        }
        catch(Exception sqlEx){
                    System.out.println(sqlEx);
        } 
        return con;
    }
}