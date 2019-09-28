
package institute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class connection {
     public Connection con;
     public ResultSet rs;
     public Statement stmt;
     
    public connection()
    {


      PreparedStatement preparestatement;
      try{
                 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	//dirver relation
                    con=DriverManager.getConnection("jdbc:odbc:yash");
                    stmt=con.createStatement();
             }
                catch(Exception e)
            {
              System.out.println("class not found exception");
             }
    
}

    PreparedStatement prepareStatement(String select_useridpwd_from_signin_where_userid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
     
    
}
