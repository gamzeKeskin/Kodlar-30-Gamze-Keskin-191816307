package Model;

import Kurtarici.Yardimci;
import java.sql.*;
import java.util.ArrayList;

public class Bashekim extends Kullanici{
    Statement st = null;
    ResultSet rs = null;
    Connection con = conn.connDb();
    PreparedStatement pStatement = null;
    
    public Bashekim(int id, String tcno, String isim, String sifre, String tip) {
        super(id, tcno, isim, sifre, tip);
    }
    
    public Bashekim(){}
    
    @Override
    public String metodPolymorphism(){        
        return "Override edilmeş başhekim class'ındaki polymorphism metodu";
    }
    
    public ArrayList<Kullanici> getDoktorList() throws SQLException{
        ArrayList<Kullanici> liste = new ArrayList<>();

        Kullanici obj;
        try{
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM kullanici WHERE tip = 'doktor'");
        while(rs.next()){
            obj = new Kullanici(rs.getInt("id"), rs.getString("tcno"), rs.getString("isim"), rs.getString("sifre"), rs.getString("tip"));
            liste.add(obj);
        }
            }
        catch(SQLException ex){
            ex.printStackTrace();
        }

        return liste;
    }
    
            public ArrayList<Kullanici> ara(String ismi) throws SQLException{
        ArrayList<Kullanici> liste = new ArrayList<>();

        Kullanici obj;
        try{
        st = con.createStatement();
        String sorgu = "SELECT  * FROM kullanici WHERE isim='"+ismi+"'";
        rs = st.executeQuery(sorgu);
        while(rs.next()){
            int id = rs.getInt("id");
            String tcno = rs.getString("tcno");
            String sifre = rs.getString("sifre");
            String isim = rs.getString("isim");
            liste.add(new Kullanici(id,tcno,sifre,isim));
            
        }
            return liste;
            }
        catch(SQLException ex){
            ex.printStackTrace();
        }

        return liste;
    }
    
    public boolean doktorEkle(String tcno, String sifre, String isim) throws SQLException {
    String sorgu = "INSERT INTO kullanici" + "(tcno,sifre,isim,tip) VALUES (?,?,?,?)";
            boolean sonuc=false;
        try {
            st = con.createStatement();
            pStatement=con.prepareStatement(sorgu);
            pStatement.setString(1, tcno);
            pStatement.setString(2, sifre);
            pStatement.setString(3, isim);
            pStatement.setString(4, "doktor");
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
    
    
    
       public boolean doktorSil(String isim) throws SQLException {
    String sorgu = "DELETE FROM kullanici WHERE isim = ?";
            boolean sonuc=false;
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
       
        public boolean doktorGuncelle(int id, String tcno, String sifre, String isim) throws SQLException {
    String sorgu = "UPDATE  kullanici SET isim = ?, tcno = ?, sifre = ? WHERE id = ?";
            boolean sonuc=false;
        try {
            st = con.createStatement();
            pStatement=con.prepareStatement(sorgu);
            pStatement.setString(1, isim);
            pStatement.setString(2, tcno);
            pStatement.setString(3, sifre);
            pStatement.setInt(4, id);
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

}
