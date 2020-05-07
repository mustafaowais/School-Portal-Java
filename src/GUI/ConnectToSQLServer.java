package GUI;
  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class ConnectToSQLServer {
  
  public static void main(String[] args) {
 
    Connection connection = null;
    try {
 
  // Load the NetDirect JDBC driver
 
  String driverName = "com.jnetdirect.jsql.JSQLDriver";
 
  Class.forName(driverName);
 
 
  // Create a connection to the database
 
  String serverName = "localhost";
 
  String serverPort = "1433";
 
  String database = serverName + ":" + serverPort;
 
  String url = "jdbc:JSQLConnect://" + database;
 
  String username = "username";
 
  String password = "password";
 
  connection = DriverManager.getConnection(url, username, password);
 
   
 
  System.out.println("Successfully Connected to the database!");
 
   
    } catch (ClassNotFoundException e) {
 
  System.out.println("Could not find the database driver " + e.getMessage());
    } catch (SQLException e) {
 
  System.out.println("Could not connect to the database " + e.getMessage());
    }
 
 }
 
}