
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
        
        
        String query="{?= call add_ab(?,?}";
        CallableStatement cst=con.prepareCall(query);

        cst.setInt(2, 123);
        cst.setInt(3, 321);
        
        
        cst.registerOutParameter(1, Types.INTEGER);       
        cst.execute();      
        int result=cst.getInt(1);
        System.out.println(result);
        
    }
    
    
}

// create function add_ab(a int, b int)
//    -> returns int deterministic
//    -> begin
//    -> declare c int;
//    -> set c=(a+b);
//    -> return c
//    -> ;
//    -> end
//    -> $$
