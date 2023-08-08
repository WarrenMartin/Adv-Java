import java.sql.*;

public class JDBC_DEMO {

    public static void main(String[] args)throws Exception {
        
        // 1. Loading the driver
        
        Class.forName("com.mysql.cj.jdbc.Driver"); //loading a driver
        
        // 2. Establish the connection
        
        String url="jdbc:mysql://localhost:3306/user";
        String username="root";
        String password="root";
        Connection con=DriverManager.getConnection(url,username,password);
        
        if(con!=null){
            System.out.println("Connection Successful");
        }
        else{
            System.out.println("Connection failed");
        }
        
        
        
        
        
    }
    
}
