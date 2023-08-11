
// Note: ResultSet MetaData we will get from resultset object. But DataBase MetaData we will get from the connection object
// because only the connection object knows about the database.


package jdbc_demo;

import java.sql.*;

public class MetaDataDemo {
    
    public static void main(String[] args) throws Exception {
        
        DBConnection dbcon = new DBConnection();
        Connection con=dbcon.getConnection();
        
        if(con != null){
            System.out.println("Connection Success");
        }
        else{
            System.out.println("Connection Failed");
        }
        
        DatabaseMetaData dbmd = con.getMetaData(); // Frm Connection
        System.out.println(dbmd.getDriverName());
        System.out.println(dbmd.getConnection());
        System.out.println(dbmd.getDatabaseProductVersion());
        System.out.println(dbmd.getUserName());
        
        String[] tables={"Table"};
        ResultSet rs=dbmd.getTables(null, null, null, tables);
        
        while(rs.next()){
            System.out.println(rs.getString(3));
        }
        
        con.close();
        
        
                
        
    }
    
}
