package Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Doktor extends Kullanici{
    
    Statement st = null;
    ResultSet rs = null;
    Connection con = conn.connDb();
    PreparedStatement pStatement = null;

    public Doktor(){super();}
    
    public Doktor(int id, String tcno, String isim, String sifre, String tip) {
        super(id, tcno, isim, sifre, tip);
    }
    
    public boolean saatEkle(String doktorid,String doktora,String wdate)throws SQLException{
        
        int sonuc =0;        
        String sorgu = "INSERT INTO saat (doktorid,doktora,wdate) VALUES (?,?,?)";
        try {
            st = con.createStatement();
            pStatement=con.prepareStatement(sorgu);
            pStatement.setString(1, doktorid);
            pStatement.setString(2, doktora);
            pStatement.setString(3, wdate);
            pStatement.executeUpdate();
            sonuc =1;
        } catch (SQLException ex) {
            Logger.getLogger(Doktor.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(sonuc == 1){
            return true;
        }
        else
        return false;
    }
    
        public boolean saatSil(int id) throws SQLException {
    String sorgu = "DELETE FROM saat WHERE id = ?";
            boolean sonuc=false;
        try {
            st = con.createStatement();
            pStatement=con.prepareStatement(sorgu);
            pStatement.setInt(1, id);
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
           

    public ArrayList<Mesai> getSaatList() throws SQLException{
        ArrayList<Mesai> liste = new ArrayList<>();

        Mesai obj;
        try{
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM saat WHERE hal = 'a'");
        while(rs.next()){
            obj = new Mesai();
            obj.setId(rs.getInt("id"));
            obj.setDoktorid(rs.getString("doktorid"));
            obj.setDoktora(rs.getString("doktora"));
            obj.setHal(rs.getString("hal"));
            obj.setWdate(rs.getString("wdate"));
            liste.add(obj);
        }
            }
        catch(SQLException ex){
            ex.printStackTrace();
        }

        return liste;
    }
    

}
