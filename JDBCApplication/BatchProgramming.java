
package jdbc_demo;

import java.sql.*;
  
public class BatchDemo {
    
    public static void main(String[] args) throws Exception {
        DBConnection dbcon=new DBConnection();
        Connection con =dbcon.getConnection();
    
        if(con != null){
                System.out.println("Connection established");
        }
        else{
            System.out.println("Connection failed");
        }
        
        
        Statement st =con.createStatement();
        
        String s1="insert into student values(399,'DP',8.9)";
        String s2=" update student set name='ASDF' where id=200";
        String s3="insert into student values(39,'DPdd',9)";
        
        
        st.addBatch(s1);
        st.addBatch(s2);
        st.addBatch(s3);
        
        int[] res= st.executeBatch();
        
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
        
        con.close(); 
        
        
    }
    
}
