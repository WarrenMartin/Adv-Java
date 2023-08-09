+------+------+
| id   | name |
+------+------+
|    1 | ABC  |
|    1 | ABC  |
|    2 | AB   |
|    3 | AcB  |
|    4 | sdx  |
+------+------+

This is the table in the output and the code is 

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
        
        
        // 3. Create statement to isssue SQL commands
        
        var st=con.createStatement();
        
        // 4. Execute the Query and process the result
        
       ResultSet rs= st.executeQuery("Select * from user");
       
       while(rs.next()){
           System.out.println(rs.getInt(1)+" "+rs.getString(2));
       }
       
       st.close();
       rs.close();
       con.close();
        
        
        
        
    }
    
}
