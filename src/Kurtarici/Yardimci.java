package Kurtarici;

import javax.swing.JOptionPane;

public class Yardimci /*extends Abstract*/{
    
    /*@Override
    void abs_metot(){
        System.out.println("Abstract Metot Kullanımı");
    }*/
    
    
    public static void mesaj(String str){
        String donus;
        
        switch (str){
            case "doldur":
                donus="Gerekli Alanları Doldurunuz...";
                break;
            case "dolu":
                donus="İşlem Gerçekleştirildi";
                break;
            default:
                donus=str;
        }
        JOptionPane.showMessageDialog(null, donus, "Mesaj", JOptionPane.INFORMATION_MESSAGE);
    }
}
