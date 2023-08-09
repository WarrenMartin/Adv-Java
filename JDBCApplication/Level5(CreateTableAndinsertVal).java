import java.sql.*;

public class JDBCDemo2 {

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
        
        
//        // 3. Create statement to isssue SQL commands
        
        Statement st=con.createStatement();
//        
//        
//       st.close();
//     //  rs.close();
//       con.close();
        
        
        

        String q1="Create table emp(eid int,ename varchar(20),eSal float)";
       int status = st.executeUpdate(q1);
       
       if(status>0){
           System.out.println("Table Created-emp");
       }
       else{
           System.out.println("Issue in Creating Table emp");
       } 
       
       // Lets Insert Some val
       String q2="Insert into emp values(1234,'Abi',25000);";
       int i=st.executeUpdate(q2);
       
       if(i>0){
           System.out.println("Val Inserted");
       }
       else{
           System.out.println("Val not inserted");
       }
       
        
    }
    
}
