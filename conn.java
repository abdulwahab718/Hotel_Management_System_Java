
package hotel.management.system1;

import java.sql.*;

public class conn {
    
    Connection c;
    Statement s;
    
    public conn()
    {
      
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            c= DriverManager.getConnection("jdbc:mysql:///projecthms","root","0987@aw");
            
            s = c.createStatement();
            
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
    }
    
    
    
    
}
