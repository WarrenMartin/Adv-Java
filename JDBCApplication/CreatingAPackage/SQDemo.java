// Using connection.java we have demonstrated SQ or sub query


package jdbc_demo;
import java.sql.*;


public class SQDemo {
    
    public static void main(String[] args) throws Exception {
        
        DBConnection dbcon=new DBConnection();
        Connection con=dbcon.getConnection();
        
        if(con != null){
            System.out.println("Connecton Established");
         }
        else{
            System.out.println("Connection failed");
        }
//         select * from student where id=(select min(id) from student);

         Statement st=con.createStatement();
         
         String q1= "select * from student where id=(select min(id) from student);";
         
         ResultSet rs=st.executeQuery(q1);
         
         if(rs.next()){
             System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+""+rs.getDouble(3));
         }
         
         rs.close();
         st.close();
         con.close();
         
        
        
        
    }
    
}
