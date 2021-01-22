
package Model;

import Kurtarici.DBConnection;
import Kurtarici.Yardimci;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hasta extends Kullanici{
    
    private int hasta_id;
    
    private String hasta_ad,doktor_ad,poliklinik_ad,tarih;
    
    Statement st = null;
    ResultSet rs = null;
    Connection con = conn.connDb();
    PreparedStatement pStatement = null;
    
    public Hasta(){
    }
    
    public Hasta(int id, String tcno, String isim, String sifre, String tip){
        super(id,tcno,isim,sifre,tip);
    }
    
         public boolean randevuAl(String hasta_ad,String doktor_ad,String poliklinik_ad, String tarih)throws SQLException{
        
        int sonuc =0;        
        String sorgu = "INSERT INTO hasta (hasta_ad,doktor_ad,poliklinik_ad,tarih) VALUES (?,?,?,?)";
        try {
            st = con.createStatement();
            pStatement=con.prepareStatement(sorgu);
            pStatement.setString(1, hasta_ad);
            pStatement.setString(2, doktor_ad);
            pStatement.setString(3, poliklinik_ad);
            pStatement.setString(4, tarih);
            pStatement.executeUpdate();
            sonuc =1;
    
        } catch (SQLException ex) {
            Logger.getLogger(Hasta.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(sonuc == 1){
            return true;
        }
        else
        return false;
    }
    
     public boolean kayit(String tcno,String sifre,String isim)throws SQLException{
        int once =0;
        int sonuc =0;        
        String sorgu = "INSERT INTO kullanici (tcno,sifre,isim,tip) VALUES (?,?,?,?)";
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT *FROM kullanici WHERE tcno='"+tcno+"'");
            while(rs.next()){
                once ++;
                Yardimci.mesaj("Bu TC Numarası Sistemde Kayıtlı");
                break;
            }
            if(once == 0){
                pStatement=con.prepareStatement(sorgu);
                pStatement.setString(1, tcno);
                pStatement.setString(2, sifre);
                pStatement.setString(3, isim);
                pStatement.setString(4, "hasta");
                pStatement.executeUpdate();
                sonuc =1;
            }

            
        } catch (SQLException ex) {
            Logger.getLogger(Hasta.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(sonuc == 1){
            return true;
        }
        else
        return false;
    }
    
     public ArrayList<Hasta> getHastaList() throws SQLException{
        ArrayList<Hasta> liste = new ArrayList<>();

        Hasta obj;
        try{
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM hasta");
        while(rs.next()){
            obj = new Hasta();
            obj.setHasta_id(rs.getInt("hasta_id"));
            obj.setHasta_ad(rs.getString("hasta_ad"));
            obj.setDoktor_ad(rs.getString("doktor_ad"));
            obj.setPoliklinik_ad(rs.getString("poliklinik_ad"));
            obj.setTarih(rs.getString("tarih"));            
            liste.add(obj);
        }
            }
        catch(SQLException ex){
            ex.printStackTrace();
        }

        return liste;
    }

    /**
     * @return the hasta_ad
     */
    public String getHasta_ad() {
        return hasta_ad;
    }

    /**
     * @param hasta_ad the hasta_ad to set
     */
    public void setHasta_ad(String hasta_ad) {
        this.hasta_ad = hasta_ad;
    }

    /**
     * @return the doktor_ad
     */
    public String getDoktor_ad() {
        return doktor_ad;
    }

    /**
     * @param doktor_ad the doktor_ad to set
     */
    public void setDoktor_ad(String doktor_ad) {
        this.doktor_ad = doktor_ad;
    }

    /**
     * @return the poliklinik_ad
     */
    public String getPoliklinik_ad() {
        return poliklinik_ad;
    }

    /**
     * @param poliklinik_ad the poliklinik_ad to set
     */
    public void setPoliklinik_ad(String poliklinik_ad) {
        this.poliklinik_ad = poliklinik_ad;
    }

    /**
     * @return the tarih
     */
    public String getTarih() {
        return tarih;
    }

    /**
     * @param tarih the tarih to set
     */
    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    /**
     * @return the hasta_id
     */
    public int getHasta_id() {
        return hasta_id;
    }

    /**
     * @param hasta_id the hasta_id to set
     */
    public void setHasta_id(int hasta_id) {
        this.hasta_id = hasta_id;
    }
     
}
