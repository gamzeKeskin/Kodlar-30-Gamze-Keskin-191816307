
package Arayüz;

import static Arayüz.DoktorGiris_Ekranı.doktor;
import Model.*;
import Kurtarici.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;


public class BashekimGiris_Ekranı extends javax.swing.JFrame {

    static Bashekim bashekim = new Bashekim();
    
    Poliklinik poliklinik = new Poliklinik();
    
    Dokpol dokpol = new Dokpol();
    
    ResultSet rs = null;
    
    private DefaultTableModel doktorModel = null;
    private Object[] doktorData = null;
    
    private DefaultTableModel klinikModel = null;
    private Object[] klinikData = null;
    
    private DefaultTableModel dokpolModel = null;
    private Object[] dokpolData = null;
    
    /*
    *@throws SQLException
    */
    public BashekimGiris_Ekranı(Bashekim bashekim) throws SQLException {
        
        doktorModel = new DefaultTableModel();
        Object[] colDoktorIsim = new Object[4];
        colDoktorIsim[0] = "ID";
        colDoktorIsim[1] = "Ad Soyad";
        colDoktorIsim[2] = "Tc No";
        colDoktorIsim[3] = "Sifre";
        doktorModel.setColumnIdentifiers(colDoktorIsim);
        doktorData = new Object[4];
        
        klinikModel = new DefaultTableModel();
        Object[] colKlinikIsim = new Object[2];
        colKlinikIsim[0] = "ID";
        colKlinikIsim[1] = "Poliklinik Adı";

        klinikModel.setColumnIdentifiers(colKlinikIsim);
        klinikData = new Object[2];
        for(int i=0; i < poliklinik.getList().size(); i++){
            klinikData[0] = poliklinik.getList().get(i).getId();
            klinikData[1] = poliklinik.getList().get(i).getIsim();
            klinikModel.addRow(klinikData);  
        }
        
        dokpolModel = new DefaultTableModel();
        Object[] colDokpolIsim = new Object[3];
        colDokpolIsim[0] = "Id";
        colDokpolIsim[1] = "Poliklinik Ad";
        colDokpolIsim[2] = "Doktor Ad";

        dokpolModel.setColumnIdentifiers(colDokpolIsim);
        dokpolData = new Object[3];
        for(int i=0; i < dokpol.getDokpolList().size(); i++){
            dokpolData[0] = dokpol.getDokpolList().get(i).getId();
            dokpolData[1] = dokpol.getDokpolList().get(i).getPoliklinik_ad();
            dokpolData[2] = dokpol.getDokpolList().get(i).getDoktor_ad();
            dokpolModel.addRow(dokpolData);  
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        bashekimGiris_lbl = new javax.swing.JPanel();
        hosgeldiniz_lbl = new javax.swing.JLabel();
        cıkıs_bttn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        doktor_yönetimi = new javax.swing.JPanel();
        adSoyad = new javax.swing.JLabel();
        dAd_txt = new javax.swing.JTextField();
        tcNo = new javax.swing.JLabel();
        dTcno_txt = new javax.swing.JTextField();
        sifre = new javax.swing.JLabel();
        dSifre_txt = new javax.swing.JPasswordField();
        ekleDoktor_bttn = new javax.swing.JButton();
        doktorAd = new javax.swing.JLabel();
        doktorAd_txt = new javax.swing.JTextField();
        silDoktor_bttn = new javax.swing.JButton();
        doktor_scroll = new javax.swing.JScrollPane();
        doktor_table = new javax.swing.JTable(doktorModel);
        ikon = new javax.swing.JLabel();
        ikon1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        doktorAra_txt = new javax.swing.JTextField();
        ikon2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ara_ikon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        göster_bttn = new javax.swing.JButton();
        göster_ikon = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        poliklinik_yönetimi = new javax.swing.JPanel();
        poliklinik_scroll = new javax.swing.JScrollPane();
        poliklinik_table = new javax.swing.JTable(klinikModel);
        poliklinikAd = new javax.swing.JLabel();
        klinikAd_txt = new javax.swing.JTextField();
        pSecme_table = new javax.swing.JScrollPane();
        dokpol_table = new javax.swing.JTable(dokpolModel);
        klinikEkle_bttn = new javax.swing.JButton();
        doktor_ekleme = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dokpolPolAd_txt = new javax.swing.JTextField();
        secimDoktor_lbl = new javax.swing.JLabel();
        dokpolDokAd_txt = new javax.swing.JTextField();
        dokpolEkle_bttn = new javax.swing.JButton();
        ıkon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Hastane Randevu Sistemi"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        bashekimGiris_lbl.setBackground(new java.awt.Color(51, 153, 255));
        bashekimGiris_lbl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hosgeldiniz_lbl.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        hosgeldiniz_lbl.setText("Hoşgeldiniz");
        bashekimGiris_lbl.add(hosgeldiniz_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        cıkıs_bttn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cıkıs_bttn.setText("ÇIKIŞ");
        cıkıs_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cıkıs_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cıkıs_bttnActionPerformed(evt);
            }
        });
        bashekimGiris_lbl.add(cıkıs_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        doktor_yönetimi.setBackground(new java.awt.Color(255, 255, 255));

        adSoyad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        adSoyad.setText("AD-SOYAD:");

        tcNo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        tcNo.setText("T.C Numarası:");

        sifre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        sifre.setText("ŞİFRE:");

        ekleDoktor_bttn.setBackground(java.awt.SystemColor.inactiveCaption);
        ekleDoktor_bttn.setText("EKLE");
        ekleDoktor_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ekleDoktor_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleDoktor_bttnActionPerformed(evt);
            }
        });

        doktorAd.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        doktorAd.setText("Doktor İsmi:");

        silDoktor_bttn.setBackground(java.awt.SystemColor.inactiveCaption);
        silDoktor_bttn.setText("SİL");
        silDoktor_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        silDoktor_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silDoktor_bttnActionPerformed(evt);
            }
        });

        doktor_scroll.setBackground(new java.awt.Color(255, 255, 255));

        doktor_table.getColumnModel().getColumn(0).setPreferredWidth(3);
        doktor_table.getColumnModel().getColumn(3).setPreferredWidth(3);
        doktor_table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                try{
                    doktorAd_txt.setText(doktor_table.getValueAt(doktor_table.getSelectedRow(),1).toString());
                }
                catch(Exception ex){

                }
            }
        });
        doktor_table.getModel().addTableModelListener(new TableModelListener(){
            @Override
            public void tableChanged(TableModelEvent e){
                if(e.getType() == TableModelEvent.UPDATE){
                    int seciliId = Integer.parseInt(doktor_table.getValueAt(doktor_table.getSelectedRow(), 0).toString());
                    String seciliIsim = doktor_table.getValueAt(doktor_table.getSelectedRow(), 1).toString();
                    String seciliTcno = doktor_table.getValueAt(doktor_table.getSelectedRow(), 2).toString();
                    String seciliSifre = doktor_table.getValueAt(doktor_table.getSelectedRow(), 3).toString();
                    try{
                        boolean kontrol =  bashekim.doktorGuncelle(seciliId, seciliTcno, seciliSifre, seciliIsim);
                    }
                    catch(SQLException e1){
                        e1.printStackTrace();
                    }

                }
            }
        });
        doktor_table.setModel(doktorModel);
        doktor_scroll.setViewportView(doktor_table);

        ikon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Hastane\\src\\Arayüz\\doctor.png")); // NOI18N

        ikon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Hastane\\src\\Arayüz\\password.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Aramak İstediğiniz Doktor Adını Giriniz:");

        doktorAra_txt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N

        ikon2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Hastane\\src\\Arayüz\\medical-doctor.png")); // NOI18N

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 51));
        jButton1.setText("ARA");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ara_ikon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Hastane\\src\\Arayüz\\loupe.png")); // NOI18N

        jLabel4.setBackground(new java.awt.Color(0, 153, 255));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Yapabileceğim İşlemler:");

        göster_bttn.setBackground(java.awt.SystemColor.inactiveCaption);
        göster_bttn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        göster_bttn.setForeground(new java.awt.Color(255, 102, 51));
        göster_bttn.setText("GÖSTER");
        göster_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        göster_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                göster_bttnActionPerformed(evt);
            }
        });

        göster_ikon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Hastane\\src\\Arayüz\\show.png")); // NOI18N

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jButton2.setText("Doktor Listele");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout doktor_yönetimiLayout = new javax.swing.GroupLayout(doktor_yönetimi);
        doktor_yönetimi.setLayout(doktor_yönetimiLayout);
        doktor_yönetimiLayout.setHorizontalGroup(
            doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doktor_yönetimiLayout.createSequentialGroup()
                .addGroup(doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doktor_yönetimiLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(doktor_yönetimiLayout.createSequentialGroup()
                                .addComponent(adSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dAd_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(doktor_yönetimiLayout.createSequentialGroup()
                                .addComponent(tcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dTcno_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(doktor_yönetimiLayout.createSequentialGroup()
                                .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(ikon1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dSifre_txt)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(doktor_yönetimiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ikon)
                            .addComponent(doktorAd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doktorAd_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(silDoktor_bttn, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doktor_yönetimiLayout.createSequentialGroup()
                        .addContainerGap(136, Short.MAX_VALUE)
                        .addGroup(doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ekleDoktor_bttn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(doktor_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(doktor_yönetimiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ikon2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(doktor_yönetimiLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(doktorAra_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ara_ikon)
                        .addGap(19, 19, 19))
                    .addGroup(doktor_yönetimiLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(41, 41, 41)
                        .addComponent(göster_bttn)
                        .addGap(18, 18, 18)
                        .addComponent(göster_ikon)
                        .addGap(105, 105, 105))))
        );

        doktor_yönetimiLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dSifre_txt, dTcno_txt});

        doktor_yönetimiLayout.setVerticalGroup(
            doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doktor_yönetimiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doktor_yönetimiLayout.createSequentialGroup()
                        .addGroup(doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dAd_txt)
                            .addComponent(adSoyad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(doktor_yönetimiLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(dTcno_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tcNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ikon1)
                            .addComponent(dSifre_txt)
                            .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ekleDoktor_bttn)
                        .addGap(7, 7, 7)
                        .addGroup(doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(doktorAd_txt)
                            .addComponent(doktorAd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(silDoktor_bttn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ikon, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(23, 23, 23)
                        .addComponent(jButton2))
                    .addComponent(doktor_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ara_ikon, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doktorAra_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addComponent(ikon2))
                .addGap(18, 18, 18)
                .addGroup(doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doktor_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(göster_bttn)
                        .addComponent(jLabel4))
                    .addComponent(göster_ikon))
                .addGap(52, 52, 52))
        );

        jTabbedPane1.addTab("Doktor Yönetimi", doktor_yönetimi);

        poliklinik_yönetimi.setBackground(new java.awt.Color(255, 255, 255));
        poliklinik_yönetimi.setPreferredSize(new java.awt.Dimension(555, 280));

        poliklinik_table.setForeground(new java.awt.Color(0, 0, 153));
        poliklinik_table.setModel(klinikModel);
        poliklinik_scroll.setViewportView(poliklinik_table);

        poliklinikAd.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        poliklinikAd.setText("Poliklinik Adı:");

        pSecme_table.setBackground(new java.awt.Color(255, 255, 255));

        dokpol_table.getColumnModel().getColumn(0).setPreferredWidth(3);
        dokpol_table.setForeground(new java.awt.Color(0, 0, 102));
        dokpol_table.setModel(dokpolModel);
        pSecme_table.setViewportView(dokpol_table);

        klinikEkle_bttn.setBackground(java.awt.SystemColor.inactiveCaption);
        klinikEkle_bttn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        klinikEkle_bttn.setText("EKLE");
        klinikEkle_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        klinikEkle_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klinikEkle_bttnActionPerformed(evt);
            }
        });

        doktor_ekleme.setBackground(new java.awt.Color(255, 255, 255));
        doktor_ekleme.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        doktor_ekleme.setForeground(new java.awt.Color(0, 153, 255));
        doktor_ekleme.setText("Polikliniğe Doktor Ekleme Alanı");

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        jLabel1.setText("Seçmek İstediğiniz Poliklinik Adı");

        secimDoktor_lbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        secimDoktor_lbl.setText("Seçmek İstediğiniz Doktor");

        dokpolEkle_bttn.setBackground(java.awt.SystemColor.inactiveCaption);
        dokpolEkle_bttn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        dokpolEkle_bttn.setText("EKLE");
        dokpolEkle_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dokpolEkle_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokpolEkle_bttnActionPerformed(evt);
            }
        });

        ıkon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Hastane\\src\\Arayüz\\clinic (2).png")); // NOI18N

        javax.swing.GroupLayout poliklinik_yönetimiLayout = new javax.swing.GroupLayout(poliklinik_yönetimi);
        poliklinik_yönetimi.setLayout(poliklinik_yönetimiLayout);
        poliklinik_yönetimiLayout.setHorizontalGroup(
            poliklinik_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(poliklinik_yönetimiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(poliklinik_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(poliklinik_yönetimiLayout.createSequentialGroup()
                        .addGroup(poliklinik_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(poliklinik_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dokpolPolAd_txt)
                                .addComponent(secimDoktor_lbl)
                                .addComponent(dokpolDokAd_txt))
                            .addComponent(dokpolEkle_bttn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pSecme_table, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(poliklinik_yönetimiLayout.createSequentialGroup()
                        .addGroup(poliklinik_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(klinikAd_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addGroup(poliklinik_yönetimiLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(klinikEkle_bttn))
                            .addGroup(poliklinik_yönetimiLayout.createSequentialGroup()
                                .addComponent(poliklinikAd, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(poliklinik_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
            .addGroup(poliklinik_yönetimiLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(ıkon)
                .addGap(18, 18, 18)
                .addComponent(doktor_ekleme)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        poliklinik_yönetimiLayout.setVerticalGroup(
            poliklinik_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(poliklinik_yönetimiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(poliklinik_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(poliklinik_yönetimiLayout.createSequentialGroup()
                        .addComponent(poliklinikAd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(klinikAd_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(klinikEkle_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(poliklinik_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(poliklinik_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(poliklinik_yönetimiLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(doktor_ekleme, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addComponent(ıkon, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGroup(poliklinik_yönetimiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(poliklinik_yönetimiLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dokpolPolAd_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(secimDoktor_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dokpolDokAd_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dokpolEkle_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, poliklinik_yönetimiLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(pSecme_table, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        poliklinik_yönetimiLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {klinikAd_txt, poliklinikAd});

        poliklinik_yönetimiLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dokpolDokAd_txt, dokpolPolAd_txt, doktor_ekleme, jLabel1, secimDoktor_lbl});

        jTabbedPane1.addTab("Poliklinik Yönetimi", poliklinik_yönetimi);

        bashekimGiris_lbl.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 570, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bashekimGiris_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bashekimGiris_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cıkıs_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cıkıs_bttnActionPerformed
        Giriş_Ekranı giris = new Giriş_Ekranı();
        giris.setVisible(true);
        dispose();
    }//GEN-LAST:event_cıkıs_bttnActionPerformed

    private void ekleDoktor_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleDoktor_bttnActionPerformed
        if(dAd_txt.getText().length() == 0 || dSifre_txt.getText().length() == 0 || dTcno_txt.getText().length() == 0){
            Yardimci.mesaj("doldur");
        }
        else{
            try {
                boolean kontrol = bashekim.doktorEkle(dTcno_txt.getText(), dSifre_txt.getText(),dAd_txt.getText());
                if(kontrol){
                    Yardimci.mesaj("dolu");
                    dTcno_txt.setText(null);
                    dSifre_txt.setText(null);
                    dAd_txt.setText(null);
                    doktorModelGuncelle();
                }
            } catch (SQLException ex) {
                Logger.getLogger(BashekimGiris_Ekranı.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ekleDoktor_bttnActionPerformed

    private void silDoktor_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silDoktor_bttnActionPerformed
        if(doktorAd_txt.getText().length() == 0){
            Yardimci.mesaj("Doktor İsmi Giriniz !!!");
        }
        else{
            String seciliAd = doktorAd_txt.getText();
            try {
                boolean kontrol = bashekim.doktorSil(seciliAd);
                if(kontrol){
                    Yardimci.mesaj("dolu");
                    doktorAd_txt.setText(null);
                    doktorModelGuncelle();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_silDoktor_bttnActionPerformed

    private void klinikEkle_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klinikEkle_bttnActionPerformed
        if(klinikAd_txt.getText().length() == 0){
            Yardimci.mesaj("doldur");
        }
        else{
            try {
                if(poliklinik.klinikEkle(klinikAd_txt.getText())){
                    Yardimci.mesaj("dolu");
                    klinikAd_txt.setText(null);
                    klinikModelGuncelle();
                }
            } catch (SQLException ex) {
                Logger.getLogger(BashekimGiris_Ekranı.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_klinikEkle_bttnActionPerformed

    private void dokpolEkle_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokpolEkle_bttnActionPerformed
        if(dokpolPolAd_txt.getText().length() == 0 || secimDoktor_lbl.getText().length() == 0){
            Yardimci.mesaj("doldur");
        }
        else{
            try {
                boolean kontrol = dokpol.dokpolEkle(dokpolPolAd_txt.getText(), dokpolDokAd_txt.getText());
                if(kontrol){
                    Yardimci.mesaj("İşlem Gerçekleştirildi !!!");
                            dokpolPolAd_txt.setText(null);
                            dokpolDokAd_txt.setText(null);    
                            dokpolModelGuncelle();
                }
            } catch (SQLException ex) {
                Logger.getLogger(BashekimGiris_Ekranı.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_dokpolEkle_bttnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String isim = doktorAra_txt.getText();
        doktorModel.setRowCount(0);
        ArrayList<Kullanici> kullanici = new ArrayList<Kullanici>();
        try {
            kullanici=bashekim.ara(isim);
                    if(kullanici != null){
            for(Kullanici kullan:kullanici){
                Object doktorData[]={kullan.getId(),kullan.getIsim(),kullan.getTcno(),kullan.getSifre()};
                doktorModel.addRow(doktorData);
            }
        }
                   
        } catch (SQLException ex) {
            Logger.getLogger(BashekimGiris_Ekranı.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void göster_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_göster_bttnActionPerformed
        BashekimIslem islem = new BashekimIslem();
        String göster = islem.bilgi();
        JOptionPane.showMessageDialog(null, göster, "*** İŞLEMLERİNİZ ***", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_göster_bttnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        try {
            for(int i=0; i < bashekim.getDoktorList().size(); i++){
                doktorData[0] = bashekim.getDoktorList().get(i).getId();
                doktorData[1] = bashekim.getDoktorList().get(i).getIsim();
                doktorData[2] = bashekim.getDoktorList().get(i).getTcno();
                doktorData[3] = bashekim.getDoktorList().get(i).getSifre();
                doktorModel.addRow(doktorData);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(BashekimGiris_Ekranı.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void doktorModelGuncelle() throws SQLException{
        DefaultTableModel temizleModel = (DefaultTableModel)doktor_table.getModel();
        temizleModel.setRowCount(0);
                for(int i=0; i < bashekim.getDoktorList().size(); i++){
            doktorData[0] = bashekim.getDoktorList().get(i).getId();
            doktorData[1] = bashekim.getDoktorList().get(i).getIsim();
            doktorData[2] = bashekim.getDoktorList().get(i).getTcno();
            doktorData[3] = bashekim.getDoktorList().get(i).getSifre();
            doktorModel.addRow(doktorData);  
        }       
    }
    
    public void klinikModelGuncelle() throws SQLException {
        DefaultTableModel temizleModel = (DefaultTableModel)poliklinik_table.getModel();
        temizleModel.setRowCount(0);
                 for(int i=0; i < poliklinik.getList().size(); i++){
            klinikData[0] = poliklinik.getList().get(i).getId();
            klinikData[1] = poliklinik.getList().get(i).getIsim();
            klinikModel.addRow(klinikData);  
        }
    }
    
        public void dokpolModelGuncelle() throws SQLException{
        DefaultTableModel temizleModel = (DefaultTableModel)dokpol_table.getModel();
        temizleModel.setRowCount(0);
                for(int i=0; i < dokpol.getDokpolList().size(); i++){
            dokpolData[0] = dokpol.getDokpolList().get(i).getId();      
            dokpolData[1] = dokpol.getDokpolList().get(i).getPoliklinik_ad();
            dokpolData[2] = dokpol.getDokpolList().get(i).getDoktor_ad();
            dokpolModel.addRow(dokpolData);  
        }       
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BashekimGiris_Ekranı(bashekim).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BashekimGiris_Ekranı.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adSoyad;
    private javax.swing.JLabel ara_ikon;
    private javax.swing.JPanel bashekimGiris_lbl;
    private javax.swing.JButton cıkıs_bttn;
    private javax.swing.JTextField dAd_txt;
    private javax.swing.JPasswordField dSifre_txt;
    private javax.swing.JTextField dTcno_txt;
    private javax.swing.JTextField dokpolDokAd_txt;
    private javax.swing.JButton dokpolEkle_bttn;
    private javax.swing.JTextField dokpolPolAd_txt;
    private javax.swing.JTable dokpol_table;
    private javax.swing.JLabel doktorAd;
    private javax.swing.JTextField doktorAd_txt;
    private javax.swing.JTextField doktorAra_txt;
    private javax.swing.JLabel doktor_ekleme;
    private javax.swing.JScrollPane doktor_scroll;
    private javax.swing.JTable doktor_table;
    private javax.swing.JPanel doktor_yönetimi;
    public javax.swing.JButton ekleDoktor_bttn;
    private javax.swing.JButton göster_bttn;
    private javax.swing.JLabel göster_ikon;
    private javax.swing.JLabel hosgeldiniz_lbl;
    private javax.swing.JLabel ikon;
    private javax.swing.JLabel ikon1;
    private javax.swing.JLabel ikon2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField klinikAd_txt;
    private javax.swing.JButton klinikEkle_bttn;
    private javax.swing.JScrollPane pSecme_table;
    private javax.swing.JLabel poliklinikAd;
    private javax.swing.JScrollPane poliklinik_scroll;
    private javax.swing.JTable poliklinik_table;
    private javax.swing.JPanel poliklinik_yönetimi;
    private javax.swing.JLabel secimDoktor_lbl;
    private javax.swing.JLabel sifre;
    private javax.swing.JButton silDoktor_bttn;
    private javax.swing.JLabel tcNo;
    private javax.swing.JLabel ıkon;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
