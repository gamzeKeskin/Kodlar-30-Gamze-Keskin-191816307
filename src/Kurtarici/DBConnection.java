package Kurtarici;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 
abstract class Abstract {
    abstract void abs_metot();
}

public class DBConnection {
    
    public static String kullanici_adi = "root";
    public static String parola = "";
    
    public DBConnection(){}
    
    Connection con = null;
    
    public Connection connDb(){
        
        try{
            this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hastanedb", kullanici_adi, parola);
            
            return con;
        } 
        catch(SQLException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        return con;
    }
}
