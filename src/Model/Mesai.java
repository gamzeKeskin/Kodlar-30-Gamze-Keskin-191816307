
package Model;

import Kurtarici.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Mesai {
    private int id;
    private String doktorid,doktora,wdate,hal;    
  
    public Mesai(){}   
    public Mesai(int id,String doktorid,String doktora,String wdate, String hal){
        this.id=id;
        this.doktorid=doktorid;
        this.doktora=doktora;
        this.wdate=wdate;
        this.hal=hal;
    }
    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getDoktorid() {return doktorid;}

    public void setDoktorid(String doktorid) {this.doktorid = doktorid;}

    public String getDoktora() {return doktora;}

    public void setDoktora(String doktora) {this.doktora = doktora;}

    public String getWdate() {return wdate;}

    public void setWdate(String wdate) {this.wdate = wdate;}

    public String getHal() {return hal;}

    public void setHal(String hal) {this.hal = hal;}
   
    DBConnection conn = new DBConnection();
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pStatement = null; 
        public ArrayList<Mesai> getSaatList() throws SQLException{
        ArrayList<Mesai> liste = new ArrayList<>();

        Mesai obj;
        try{
        Connection con = conn.connDb();
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
