package Model;

import Kurtarici.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Dokpol {
    DBConnection conn = new DBConnection();
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pStatement = null;
    
    private int id;
    private String poliklinik_ad;
    private String doktor_ad;
    
    public Dokpol(){}
    
    public Dokpol(int id, String poliklinik_ad, String doktor_ad){
        super();
        this.id=id;
        this.poliklinik_ad=poliklinik_ad;
        this.doktor_ad=doktor_ad;
    }
    public Dokpol(int id,String poliklinik_ad){
            super();
            this.id=id;
            this.poliklinik_ad=poliklinik_ad;
    }    

    public ArrayList<Dokpol> getDokpolList() throws SQLException{
        ArrayList<Dokpol> liste = new ArrayList<>();
        Dokpol obj;            
        Connection con = conn.connDb();
        try{
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM dokpol");
        while(rs.next()){
            obj = new Dokpol();
            obj.setId(rs.getInt("id"));
            obj.setPoliklinik_ad(rs.getString("poliklinik_ad"));
            obj.setDoktor_ad(rs.getString("doktor_ad"));
            liste.add(obj);
        }
            }
        catch(SQLException ex){
            ex.printStackTrace();
        }

        return liste;
    }
    
        public boolean dokpolEkle( String poliklinik_ad, String doktor_ad) throws SQLException {
            String sorgu = "INSERT INTO dokpol" + "(poliklinik_ad,doktor_ad) VALUES (?,?)";
            boolean sonuc=false;
            Connection con = conn.connDb();
        try {
            st = con.createStatement();
            pStatement=con.prepareStatement(sorgu);
            pStatement.setString(1, poliklinik_ad);
            pStatement.setString(2, doktor_ad);
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
    
    public String getPoliklinik_ad() {
        return poliklinik_ad;
    }

    public void setPoliklinik_ad(String poliklinik_ad) {
        this.poliklinik_ad = poliklinik_ad;
    }

    public String getDoktor_ad() {
        return doktor_ad;
    }

    public void setDoktor_ad(String doktor_ad) {
        this.doktor_ad = doktor_ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
