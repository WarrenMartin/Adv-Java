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
       
//        // For insertiton
//        String iquery="insert into student values(111,'PQR',7.8)";
//        
//        int i=st.executeUpdate(iquery);
//        
        // For updation
        String uquery="update student set cgpa=9.57 where id=1";
        
       int j= st.executeUpdate(uquery);
       
       if(j<0){System.out.println("Update Success");}
       else{System.out.println("Update Failed");}
       
       
       
        // Now this i will tell how many rows got updated 
        
//        so if i is greater thn 0 than atleast one row gott udated so it is insersesion success

//        if(i>0){
//            System.out.println("Insertion success");
//        }
//        else{
//            System.out.println("Insertion failer");
//        }
//        
        
        
       
       st.close();
     //  rs.close();
       con.close();
        
        
        
        
    }
    
}
