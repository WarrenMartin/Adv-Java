


package jdbc_demo;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementDemo {
    
    public static void main(String[] args) throws Exception {
        DBConnection dbcon =new DBConnection();
        Connection con=dbcon.getConnection();
        
        if (con!=null) {
            System.out.println("Connection established");          
        }
        else{
            System.out.println("Connection failed");
        }
        
        Scanner in=new Scanner(System.in);
        
        String q1="insert into student values(?,?,?);";
        System.out.println("Enter sid,sname and cgpa");
        int id=in.nextInt();
        String sname=in.next();
        double cgpa=in.nextDouble();
        
        
        
        
        PreparedStatement pst=con.prepareStatement(q1);
        
        pst.setInt(1,id);
        pst.setString(2, sname);
        pst.setDouble(3, cgpa);
        
        int x=pst.executeUpdate(); // returns int of how many record inserted
        
        if(x>0){
            System.out.println("No of recorss inserted:"+x);
           }
        
        else
            System.out.println("Insertition failed");
        
        
        // NOw Let Do Prepared Statement to retrive a data
        
        String q2="select * from student";
        PreparedStatement pst1=con.prepareStatement(q2);
        ResultSet rs= pst1.executeQuery();
        
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
        }
        
        
        
    }
    
}
