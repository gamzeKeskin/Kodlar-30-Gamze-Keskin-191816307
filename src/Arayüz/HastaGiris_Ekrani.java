
package Arayüz;

import Kurtarici.*;
import Model.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.String;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HastaGiris_Ekrani extends javax.swing.JFrame implements ICıkısYap {

    private static Hasta hasta = new Hasta();
    private Poliklinik poliklinik = new Poliklinik();
    private Dokpol dokpol = new Dokpol();
    
    private Mesai mesai = new Mesai();
    
    private DefaultTableModel saatModel;
    private Object[] saatData = null;
    
    private DefaultTableModel hastaModel;
    private Object[] hastaData = null;
    
    public HastaGiris_Ekrani(Hasta hasta) throws SQLException {
        
        hastaModel = new DefaultTableModel();
        Object[] colHasta = new Object[5];
        colHasta[0] = "ID";
        colHasta[1] = "Hasta Adı";
        colHasta[2] = "Doktor Adı";
        colHasta[3] = "Poliklinik Adı";
        colHasta[4] = "Tarih";
        hastaModel.setColumnIdentifiers(colHasta);
        hastaData = new Object[5];
        for(int i=0;i<hasta.getHastaList().size();i++){
            hastaData[0]=hasta.getHastaList().get(i).getHasta_id();
            hastaData[1]=hasta.getHastaList().get(i).getHasta_ad();
            hastaData[2]=hasta.getHastaList().get(i).getDoktor_ad();
            hastaData[3]=hasta.getHastaList().get(i).getPoliklinik_ad();
            hastaData[4]=hasta.getHastaList().get(i).getTarih();
            hastaModel.addRow(hastaData);
        }

        
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hasta_pnl = new javax.swing.JPanel();
        hoşgeldiniz = new javax.swing.JLabel();
        tab_pane = new javax.swing.JTabbedPane();
        randevu_pnl = new javax.swing.JPanel();
        doktor_list = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        secDoktor_bttn = new javax.swing.JButton();
        saat_scroll = new javax.swing.JScrollPane();
        saat_table = new javax.swing.JTable(hastaModel);
        jLabel3 = new javax.swing.JLabel();
        pad_txt = new javax.swing.JTextField();
        dad_txt = new javax.swing.JTextField();
        tarih_txt = new com.toedter.calendar.JDateChooser();
        saat_txt = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        had_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cıkıs_bttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hastane Yönetim Sistemi");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hasta_pnl.setBackground(new java.awt.Color(51, 153, 255));

        hoşgeldiniz.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        hoşgeldiniz.setText("Hoşgeldiniz");

        randevu_pnl.setBackground(new java.awt.Color(255, 255, 255));
        randevu_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doktor_list.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        doktor_list.setText("Doktor Adı:");
        randevu_pnl.add(doktor_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel1.setText("Poliklinik Adı:");
        randevu_pnl.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Saat:");
        randevu_pnl.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, 30));

        secDoktor_bttn.setBackground(java.awt.SystemColor.inactiveCaption);
        secDoktor_bttn.setText("EKLE");
        secDoktor_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        secDoktor_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secDoktor_bttnActionPerformed(evt);
            }
        });
        randevu_pnl.add(secDoktor_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 110, 30));

        saat_scroll.setBackground(new java.awt.Color(204, 255, 255));

        saat_table.getColumnModel().getColumn(0).setPreferredWidth(5);
        saat_table.setModel(hastaModel);
        saat_scroll.setViewportView(saat_table);

        randevu_pnl.add(saat_scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 550, 140));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Tarih:");
        randevu_pnl.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));
        randevu_pnl.add(pad_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 110, 30));
        randevu_pnl.add(dad_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 150, 30));
        randevu_pnl.add(tarih_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 150, 30));

        saat_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00" }));
        saat_txt.setSelectedIndex(-1);
        randevu_pnl.add(saat_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 110, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel4.setText("Ad Soyad:");
        randevu_pnl.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));
        randevu_pnl.add(had_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 150, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Hastane\\src\\Arayüz\\date.png")); // NOI18N
        randevu_pnl.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        tab_pane.addTab("Randevu İşlemleri", randevu_pnl);

        cıkıs_bttn.setText("ÇIKIŞ YAP");
        cıkıs_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cıkıs_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cıkıs_bttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hasta_pnlLayout = new javax.swing.GroupLayout(hasta_pnl);
        hasta_pnl.setLayout(hasta_pnlLayout);
        hasta_pnlLayout.setHorizontalGroup(
            hasta_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hasta_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab_pane, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hasta_pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hoşgeldiniz)
                .addGap(143, 143, 143)
                .addComponent(cıkıs_bttn)
                .addGap(21, 21, 21))
        );
        hasta_pnlLayout.setVerticalGroup(
            hasta_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hasta_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hasta_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoşgeldiniz)
                    .addComponent(cıkıs_bttn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab_pane)
                .addContainerGap())
        );

        getContentPane().add(hasta_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void secDoktor_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secDoktor_bttnActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String date = "";
        try{
            date = sdf.format(tarih_txt.getDate());
        }
        catch(Exception e){
            //TODO
        }
        if(dad_txt.getText().length() == 0 || pad_txt.getText().length() == 0 || had_txt.getText().length() == 0 || date.length()==0){
            Yardimci.mesaj("doldur");
        }
        else{
        String time = " "+saat_txt.getSelectedItem().toString()+ ":00";
        String seciliTarih = date + time;
            try {
                boolean kontrol = hasta.randevuAl(had_txt.getText(), dad_txt.getText(),pad_txt.getText(),seciliTarih);
                if(kontrol){
                    Yardimci.mesaj("İşlem Gerçekleştirildi");
                    had_txt.setText(null);
                    pad_txt.setText(null);
                    dad_txt.setText(null);
                    hastaModelGuncelle(hasta);
                    
                }
                else{
                    Yardimci.mesaj("Başarısız İşlem");
                }
                        
                        } catch (SQLException ex) {
                Logger.getLogger(HastaGiris_Ekrani.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }//GEN-LAST:event_secDoktor_bttnActionPerformed

    private void cıkıs_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cıkıs_bttnActionPerformed
        cıkısYap_mesaj();
        Giriş_Ekranı giris = new Giriş_Ekranı();
        giris.setVisible(true);
        dispose();
    }//GEN-LAST:event_cıkıs_bttnActionPerformed

            public void hastaModelGuncelle(Hasta hasta) throws SQLException{
        DefaultTableModel temizleModel = (DefaultTableModel)saat_table.getModel();
        temizleModel.setRowCount(0);
         for(int i=0;i<hasta.getHastaList().size();i++){
            hastaData[0]=hasta.getHastaList().get(i).getHasta_id();
            hastaData[1]=hasta.getHastaList().get(i).getHasta_ad();
            hastaData[2]=hasta.getHastaList().get(i).getDoktor_ad();
            hastaData[3]=hasta.getHastaList().get(i).getPoliklinik_ad();
            hastaData[4]=hasta.getHastaList().get(i).getTarih();
            hastaModel.addRow(hastaData);
        }   
    }
        @Override
        public void cıkısYap_mesaj(){
        String mesaj="Hasta Randevu Sisteminden Çıkış Yapmak Üzeresiniz. İyi Günler Dileriz!!!";
        JOptionPane.showMessageDialog(null,mesaj,"Mesaj",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HastaGiris_Ekrani(hasta).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(HastaGiris_Ekrani.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cıkıs_bttn;
    private javax.swing.JTextField dad_txt;
    private javax.swing.JLabel doktor_list;
    private javax.swing.JTextField had_txt;
    private javax.swing.JPanel hasta_pnl;
    private javax.swing.JLabel hoşgeldiniz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField pad_txt;
    private javax.swing.JPanel randevu_pnl;
    private javax.swing.JScrollPane saat_scroll;
    private javax.swing.JTable saat_table;
    private javax.swing.JComboBox<String> saat_txt;
    private javax.swing.JButton secDoktor_bttn;
    private javax.swing.JTabbedPane tab_pane;
    private com.toedter.calendar.JDateChooser tarih_txt;
    // End of variables declaration//GEN-END:variables
}
