package Model;

import Kurtarici.*;

public class Kullanici {
    private int id;
    private String tcno,isim,sifre,tip;
    DBConnection conn = new DBConnection();

    public Kullanici(int id, String tcno, String isim ,String sifre ,String tip){
        this.id=id;
        this.tcno=tcno;
        this.isim=isim;
        this.sifre=sifre; 
        this.tip=tip;
    }
    
    public Kullanici(){}

    Kullanici(int id, String tcno, String sifre, String isim) {
        this.id=id;
        this.tcno=tcno;
        this.isim=isim;
        this.sifre=sifre; 
        
    }
    public String metodPolymorphism(){
    
    return "Kullanicidaki Polymorphism metodu";
}

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTcno() {
        return tcno;
    }
    public void setTcno(String tcno) {
        this.tcno = tcno;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getSifre() {
        return sifre;
    }
    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    public String getTip() {
        return tip;
    }
    public void setTip(String tip) {
        this.tip = tip;
    }
    
}
