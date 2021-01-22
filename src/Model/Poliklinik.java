package Model;

import Kurtarici.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Poliklinik {
   private int id;
   private String isim;
   
    DBConnection conn = new DBConnection();
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pStatement = null;
    
    public Poliklinik(){}
    
    public Poliklinik(int id, String isim) {
        super();
        this.id = id;
        this.isim = isim;
    }

     public ArrayList<Poliklinik> getList() throws SQLException{
        ArrayList<Poliklinik> liste = new ArrayList<>();
        Poliklinik obj;
        Connection con = conn.connDb();
        try{
        
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM poliklinik");
        while(rs.next()){
            obj = new Poliklinik();
            obj.setId(rs.getInt("id"));
            obj.setIsim(rs.getString("isim"));
            liste.add(obj);
        }
            }
        catch(SQLException e){
            e.printStackTrace();
        }

        return liste;
    }
    
     public boolean klinikEkle(String isim) throws SQLException {
        String sorgu = "INSERT INTO poliklinik" + "(isim) VALUES (?)";
        boolean sonuc=false;
        Connection con = conn.connDb();
        try {
            st = con.createStatement();
            pStatement=con.prepareStatement(sorgu);
            pStatement.setString(1, isim);
            pStatement.executeUpdate();
            sonuc=true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(sonuc)
            return true;
        else
            return false;
    }
     
      public boolean klinikSil(String isim) throws SQLException {
    String sorgu = "DELETE FROM poliklinik WHERE isim = ?";
            boolean sonuc=false;
            Connection con = conn.connDb();
        try {
            st = con.createStatement();
            pStatement=con.prepareStatement(sorgu);
            pStatement.setString(1, isim);
            pStatement.executeUpdate();
            sonuc=true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(sonuc)
            return true;
        else
            return false;
    } 
     
      public boolean klinikGuncelle(int id, String isim) throws SQLException {
    String sorgu = "UPDATE  poliklinik SET isim = ? WHERE id = ?";
            boolean sonuc=false;
            Connection con = conn.connDb();
        try {
            st = con.createStatement();
            pStatement=con.prepareStatement(sorgu);
            pStatement.setString(1, isim);
            pStatement.setInt(2, id);
            pStatement.executeUpdate();
            sonuc=true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(sonuc)
            return true;
        else
            return false;
    }
      
    public int getId() {
        return id;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    
}
