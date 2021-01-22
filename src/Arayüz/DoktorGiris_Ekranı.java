package Arayüz;

import static Arayüz.BashekimGiris_Ekranı.bashekim;
import Kurtarici.DoktorIslem;
import Kurtarici.ICıkısYap;
import Kurtarici.Yardimci;
import Model.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DoktorGiris_Ekranı extends javax.swing.JFrame implements ICıkısYap {

    static Doktor doktor = new Doktor();
    private DefaultTableModel saatModel;
    private Object[] saatData = null;
    
    
    
    public DoktorGiris_Ekranı(Doktor doktor) throws SQLException {
        saatModel = new DefaultTableModel();
        Object[] colSaat = new Object[2];
        colSaat[0]="ID";
        colSaat[1]="Tarih";
        saatModel.setColumnIdentifiers(colSaat);
        saatData = new Object[2];
        
        for(int i=0;i<doktor.getSaatList().size();i++){
            saatData[0]=doktor.getSaatList().get(i).getId();
            saatData[1]=doktor.getSaatList().get(i).getWdate();
            saatModel.addRow(saatData);
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        doktorGiriş_pnl = new javax.swing.JPanel();
        hosgeldiniz = new javax.swing.JLabel();
        cıkıs = new javax.swing.JButton();
        calisma_saat = new javax.swing.JTabbedPane();
        çalışmaSaatleri = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        doktorid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        doktora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        secTarih = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        secSaat = new javax.swing.JComboBox<>();
        saatEkle_bttn = new javax.swing.JButton();
        saat_scroll = new javax.swing.JScrollPane();
        saat_table = new javax.swing.JTable(saatModel);
        saatSil_bttn = new javax.swing.JButton();
        islemGöster_bttn = new javax.swing.JButton();
        islekGöster_ikon = new javax.swing.JLabel();
        yapIslem_lbl = new javax.swing.JLabel();
        doktor_ikon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setPreferredSize(new java.awt.Dimension(570, 420));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Doktor Yönetim Sistemi"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        doktorGiriş_pnl.setBackground(new java.awt.Color(51, 153, 255));
        doktorGiriş_pnl.setPreferredSize(new java.awt.Dimension(500, 400));

        hosgeldiniz.setBackground(new java.awt.Color(255, 255, 255));
        hosgeldiniz.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        hosgeldiniz.setText("Hoşgeldiniz");

        cıkıs.setBackground(new java.awt.Color(204, 204, 204));
        cıkıs.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cıkıs.setText("Çıkış Yap");
        cıkıs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cıkıs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cıkısActionPerformed(evt);
            }
        });

        calisma_saat.setBackground(new java.awt.Color(255, 255, 255));
        calisma_saat.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        çalışmaSaatleri.setBackground(new java.awt.Color(255, 255, 255));
        çalışmaSaatleri.setPreferredSize(new java.awt.Dimension(500, 295));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("ID Numaranızı Giriniz:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Adınızı Giriniz:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel4.setText("Tarih Seçiniz:");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel5.setText("Saat Seçiniz:");

        secSaat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30" }));
        secSaat.setSelectedIndex(-1);

        saatEkle_bttn.setBackground(java.awt.SystemColor.inactiveCaption);
        saatEkle_bttn.setText("EKLE");
        saatEkle_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saatEkle_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saatEkle_bttnActionPerformed(evt);
            }
        });

        saat_table.getColumnModel().getColumn(0).setPreferredWidth(5);
        saat_table.setModel(saatModel);
        saat_scroll.setViewportView(saat_table);

        saatSil_bttn.setBackground(java.awt.SystemColor.inactiveCaption);
        saatSil_bttn.setText("SİL");
        saatSil_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saatSil_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saatSil_bttnActionPerformed(evt);
            }
        });

        islemGöster_bttn.setBackground(java.awt.SystemColor.inactiveCaption);
        islemGöster_bttn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        islemGöster_bttn.setText("GÖSTER");
        islemGöster_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        islemGöster_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                islemGöster_bttnActionPerformed(evt);
            }
        });

        islekGöster_ikon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Hastane\\src\\Arayüz\\show.png")); // NOI18N

        yapIslem_lbl.setBackground(new java.awt.Color(255, 255, 255));
        yapIslem_lbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        yapIslem_lbl.setText("Yapabileceğim İşlemler:");

        javax.swing.GroupLayout çalışmaSaatleriLayout = new javax.swing.GroupLayout(çalışmaSaatleri);
        çalışmaSaatleri.setLayout(çalışmaSaatleriLayout);
        çalışmaSaatleriLayout.setHorizontalGroup(
            çalışmaSaatleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(çalışmaSaatleriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(çalışmaSaatleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(çalışmaSaatleriLayout.createSequentialGroup()
                        .addGroup(çalışmaSaatleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(çalışmaSaatleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(çalışmaSaatleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(saatEkle_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(çalışmaSaatleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(çalışmaSaatleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(doktora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(doktorid, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(saatSil_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secSaat, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, çalışmaSaatleriLayout.createSequentialGroup()
                        .addComponent(yapIslem_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(islemGöster_bttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(islekGöster_ikon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saat_scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );
        çalışmaSaatleriLayout.setVerticalGroup(
            çalışmaSaatleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(çalışmaSaatleriLayout.createSequentialGroup()
                .addGroup(çalışmaSaatleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(çalışmaSaatleriLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(çalışmaSaatleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(doktorid)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(çalışmaSaatleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doktora, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(çalışmaSaatleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(secTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(çalışmaSaatleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secSaat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(çalışmaSaatleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saatSil_bttn)
                            .addComponent(saatEkle_bttn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(çalışmaSaatleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(çalışmaSaatleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(islemGöster_bttn)
                                .addComponent(yapIslem_lbl))
                            .addComponent(islekGöster_ikon)))
                    .addGroup(çalışmaSaatleriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(saat_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        çalışmaSaatleriLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel4});

        calisma_saat.addTab("Çalışma Saatlerim", çalışmaSaatleri);

        doktor_ikon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Hastane\\src\\Arayüz\\assistant.png")); // NOI18N

        javax.swing.GroupLayout doktorGiriş_pnlLayout = new javax.swing.GroupLayout(doktorGiriş_pnl);
        doktorGiriş_pnl.setLayout(doktorGiriş_pnlLayout);
        doktorGiriş_pnlLayout.setHorizontalGroup(
            doktorGiriş_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doktorGiriş_pnlLayout.createSequentialGroup()
                .addGroup(doktorGiriş_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doktorGiriş_pnlLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(doktor_ikon)
                        .addGap(47, 47, 47)
                        .addComponent(hosgeldiniz)
                        .addGap(89, 89, 89)
                        .addComponent(cıkıs))
                    .addGroup(doktorGiriş_pnlLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(calisma_saat, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        doktorGiriş_pnlLayout.setVerticalGroup(
            doktorGiriş_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doktorGiriş_pnlLayout.createSequentialGroup()
                .addGroup(doktorGiriş_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doktorGiriş_pnlLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(doktorGiriş_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cıkıs)
                            .addComponent(hosgeldiniz)))
                    .addComponent(doktor_ikon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calisma_saat, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doktorGiriş_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doktorGiriş_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saatEkle_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saatEkle_bttnActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String date = "";
        try{
            date = sdf.format(secTarih.getDate());
        }
        catch(Exception e){
            //TODO
        }
        if(date.length()==0){
            Yardimci.mesaj("Tarih Seçiniz");
        }
        else{
        String time = " "+secSaat.getSelectedItem().toString()+ ":00";
        String seciliTarih = date + time; 
            try {
                boolean kontrol = doktor.saatEkle(doktorid.getText(), doktora.getText(), seciliTarih);
                if(kontrol){
                    Yardimci.mesaj("Başarılı");
                    saatModelGuncelle(doktor);
                }
                else{
                    Yardimci.mesaj("Hata");
                }
            } catch (SQLException ex) {
                Logger.getLogger(DoktorGiris_Ekranı.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }//GEN-LAST:event_saatEkle_bttnActionPerformed

    private void saatSil_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saatSil_bttnActionPerformed
        int seciliRow = saat_table.getSelectedRow();
        if(seciliRow >=0){
            String secRow = saat_table.getModel().getValueAt(seciliRow, 0).toString();
            int secId = Integer.parseInt(secRow);
            try {
                boolean kontrol = doktor.saatSil(secId);
                if(kontrol){
                    Yardimci.mesaj("Silme İşlemi Gerçekleştirildi");
                    saatModelGuncelle(doktor);
                }
                else{
                    Yardimci.mesaj("İşlem Başarısız");
                }
            } catch (SQLException ex) {
                Logger.getLogger(DoktorGiris_Ekranı.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            Yardimci.mesaj("Silmek İstediğiniz Tarihi Seçiniz!!!");
        }
    }//GEN-LAST:event_saatSil_bttnActionPerformed

    private void cıkısActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cıkısActionPerformed
        cıkısYap_mesaj();
        Giriş_Ekranı giris = new Giriş_Ekranı();
        giris.setVisible(true);
        dispose();
    }//GEN-LAST:event_cıkısActionPerformed

    private void islemGöster_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_islemGöster_bttnActionPerformed
        DoktorIslem d_islem = new DoktorIslem();
        String göster_dk =d_islem.bilgi();
        JOptionPane.showMessageDialog(null, göster_dk, "*** İŞLEMLERİNİZ ***", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_islemGöster_bttnActionPerformed

        public void saatModelGuncelle(Doktor doktor) throws SQLException{
        DefaultTableModel temizleModel = (DefaultTableModel)saat_table.getModel();
        temizleModel.setRowCount(0);
                for(int i=0;i<doktor.getSaatList().size();i++){
            saatData[0]=doktor.getSaatList().get(i).getId();
            saatData[1]=doktor.getSaatList().get(i).getWdate();
            saatModel.addRow(saatData);
        }   
    }
    @Override
    public void cıkısYap_mesaj(){
        String mesaj="Doktor Yönetim Sisteminden Çıkış Yapmak Üzeresiniz. İyi Günler Dileriz!!!";
        JOptionPane.showMessageDialog(null,mesaj,"Mesaj",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DoktorGiris_Ekranı(doktor).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DoktorGiris_Ekranı.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane calisma_saat;
    private javax.swing.JButton cıkıs;
    private javax.swing.JPanel doktorGiriş_pnl;
    private javax.swing.JLabel doktor_ikon;
    private javax.swing.JTextField doktora;
    private javax.swing.JTextField doktorid;
    private javax.swing.JLabel hosgeldiniz;
    private javax.swing.JLabel islekGöster_ikon;
    private javax.swing.JButton islemGöster_bttn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton saatEkle_bttn;
    private javax.swing.JButton saatSil_bttn;
    private javax.swing.JScrollPane saat_scroll;
    private javax.swing.JTable saat_table;
    private javax.swing.JComboBox<String> secSaat;
    private com.toedter.calendar.JDateChooser secTarih;
    private javax.swing.JLabel yapIslem_lbl;
    private javax.swing.JPanel çalışmaSaatleri;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
