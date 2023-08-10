package jdbc_demo;
import java.sql.*;

public class DBConnection {
    
    Connection con;
    // This will return a connection obj
    public Connection getConnection(){
        try{
           
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url="jdbc:mysql://localhost:3306/users";
            String user="root";
            String pwd="root";
            
           // @ Establish a connection
            con =DriverManager.getConnection(url,user,pwd);
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return con;
    }
    
}
