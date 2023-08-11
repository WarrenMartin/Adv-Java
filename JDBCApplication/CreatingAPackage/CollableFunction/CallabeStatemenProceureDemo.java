
package jdbc_demo;

import java .sql.*;
public class CallabeStatementDemo {
    
    public static void main(String[] args) throws Exception{
        
        DBConnection dbcon=new DBConnection();
        Connection con=dbcon.getConnection();
        if(con!=null){
            System.out.println("Connection established");
        }
        else{
            System.out.println("Connection failed");
        }
        
        // Calling stored procedure (first_prop) 
        
        String query="{call first_pro(?,?)}";
        CallableStatement cst=con.prepareCall(query);
        cst.setInt(1,5);
        cst.registerOutParameter(2, Types.INTEGER);
        
        cst.execute();
        
        int result =cst.getInt(2);
        System.out.println(result);
        
        
        
        
        
        
        
    }
    
    
}
