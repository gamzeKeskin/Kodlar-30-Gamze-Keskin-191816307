package Arayüz;

    
import Kurtarici.*;
import Model.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
    
public class Giriş_Ekranı extends javax.swing.JFrame {
    private Hasta hasta = new Hasta();
    private DBConnection conn = new DBConnection();
    
    public Giriş_Ekranı() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        girisEkranı_pnl = new javax.swing.JPanel();
        hastane_icon = new javax.swing.JLabel();
        hosgeldiniz_lbl = new javax.swing.JLabel();
        giriş_tab = new javax.swing.JTabbedPane();
        hastaGirisi_pnl = new javax.swing.JPanel();
        hastaSifre_lbl = new javax.swing.JLabel();
        hasta_icon1 = new javax.swing.JLabel();
        hastaTc_lbl = new javax.swing.JLabel();
        hasta_icon2 = new javax.swing.JLabel();
        hastaTc_txt = new javax.swing.JTextField();
        hastaSifre_txt = new javax.swing.JPasswordField();
        girisYap_bttn = new javax.swing.JButton();
        doktorgiris_pnl = new javax.swing.JPanel();
        doktorTc_lbl = new javax.swing.JLabel();
        doktorTc_txt = new javax.swing.JTextField();
        doktorSifre_lbl = new javax.swing.JLabel();
        doktorSifre_txt = new javax.swing.JPasswordField();
        doktorGiris_bttn = new javax.swing.JButton();
        doktor_icon = new javax.swing.JLabel();
        doktor_icon1 = new javax.swing.JLabel();
        hastaKayıt_pnl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        isim_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tcno_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sifre_txt = new javax.swing.JPasswordField();
        hastaKayıt_bttn = new javax.swing.JButton();
        hastaGeri_bttn = new javax.swing.JButton();
        ikon1 = new javax.swing.JLabel();
        ikon2 = new javax.swing.JLabel();
        ikon3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Hastane Randevu Otomasyonu"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        girisEkranı_pnl.setBackground(new java.awt.Color(51, 153, 255));
        girisEkranı_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hastane_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Hastane\\src\\Arayüz\\hospital (1).png")); // NOI18N
        girisEkranı_pnl.add(hastane_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        hosgeldiniz_lbl.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        hosgeldiniz_lbl.setText("GAZİ HASTANESİ YÖNETİM SİSTEMİ");
        girisEkranı_pnl.add(hosgeldiniz_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 30));

        giriş_tab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        giriş_tab.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        hastaGirisi_pnl.setBackground(new java.awt.Color(255, 255, 255));

        hastaSifre_lbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        hastaSifre_lbl.setText("Şifre:");

        hasta_icon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Hastane\\src\\Arayüz\\login.png")); // NOI18N

        hastaTc_lbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        hastaTc_lbl.setText("T.C Numarası:");

        hasta_icon2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Hastane\\src\\Arayüz\\password.png")); // NOI18N

        hastaTc_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hastaTc_txtActionPerformed(evt);
            }
        });

        girisYap_bttn.setBackground(java.awt.SystemColor.inactiveCaption);
        girisYap_bttn.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        girisYap_bttn.setText("Giriş Yap");
        girisYap_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        girisYap_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisYap_bttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hastaGirisi_pnlLayout = new javax.swing.GroupLayout(hastaGirisi_pnl);
        hastaGirisi_pnl.setLayout(hastaGirisi_pnlLayout);
        hastaGirisi_pnlLayout.setHorizontalGroup(
            hastaGirisi_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hastaGirisi_pnlLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(hastaGirisi_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hasta_icon1)
                    .addComponent(hasta_icon2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hastaGirisi_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hastaSifre_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hastaTc_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hastaGirisi_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(girisYap_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hastaSifre_txt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hastaTc_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
        );
        hastaGirisi_pnlLayout.setVerticalGroup(
            hastaGirisi_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hastaGirisi_pnlLayout.createSequentialGroup()
                .addGroup(hastaGirisi_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hastaGirisi_pnlLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(hasta_icon1)
                        .addGap(19, 19, 19)
                        .addComponent(hasta_icon2))
                    .addGroup(hastaGirisi_pnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(hastaGirisi_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hastaGirisi_pnlLayout.createSequentialGroup()
                                .addComponent(hastaTc_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hastaSifre_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(hastaGirisi_pnlLayout.createSequentialGroup()
                                .addComponent(hastaTc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hastaSifre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(girisYap_bttn)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        hastaGirisi_pnlLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {hastaTc_lbl, hastaTc_txt});

        giriş_tab.addTab("Hasta Girişi", hastaGirisi_pnl);

        doktorgiris_pnl.setBackground(new java.awt.Color(255, 255, 255));

        doktorTc_lbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        doktorTc_lbl.setText("T.C Numarası:");

        doktorTc_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doktorTc_txtActionPerformed(evt);
            }
        });

        doktorSifre_lbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        doktorSifre_lbl.setText("Şifre:");

        doktorGiris_bttn.setBackground(java.awt.SystemColor.inactiveCaption);
        doktorGiris_bttn.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        doktorGiris_bttn.setText("Giriş Yap");
        doktorGiris_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doktorGiris_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doktorGiris_bttnActionPerformed(evt);
            }
        });

        doktor_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Hastane\\src\\Arayüz\\medical-doctor.png")); // NOI18N

        doktor_icon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Hastane\\src\\Arayüz\\password.png")); // NOI18N

        javax.swing.GroupLayout doktorgiris_pnlLayout = new javax.swing.GroupLayout(doktorgiris_pnl);
        doktorgiris_pnl.setLayout(doktorgiris_pnlLayout);
        doktorgiris_pnlLayout.setHorizontalGroup(
            doktorgiris_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doktorgiris_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(doktorgiris_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(doktor_icon)
                    .addComponent(doktor_icon1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(doktorgiris_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(doktorTc_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doktorSifre_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(doktorgiris_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doktorGiris_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doktorTc_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(doktorSifre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        doktorgiris_pnlLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {doktorGiris_bttn, doktorSifre_txt, doktorTc_txt});

        doktorgiris_pnlLayout.setVerticalGroup(
            doktorgiris_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doktorgiris_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(doktorgiris_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doktorgiris_pnlLayout.createSequentialGroup()
                        .addGroup(doktorgiris_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(doktorgiris_pnlLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(doktorSifre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(doktorTc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(doktorGiris_bttn))
                    .addGroup(doktorgiris_pnlLayout.createSequentialGroup()
                        .addComponent(doktorTc_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(doktorSifre_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(doktorgiris_pnlLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(doktor_icon)
                        .addGap(33, 33, 33)
                        .addComponent(doktor_icon1)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        doktorgiris_pnlLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {doktorGiris_bttn, doktorSifre_txt, doktorTc_txt});

        giriş_tab.addTab("Doktor Giriş", doktorgiris_pnl);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Ad Soyad:");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel1.setText("TC No:");

        tcno_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcno_txtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Şifre:");

        hastaKayıt_bttn.setBackground(java.awt.SystemColor.inactiveCaption);
        hastaKayıt_bttn.setText("Kayıt Ol");
        hastaKayıt_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hastaKayıt_bttnActionPerformed(evt);
            }
        });

        hastaGeri_bttn.setBackground(java.awt.SystemColor.inactiveCaption);
        hastaGeri_bttn.setText("Geri Dön");
        hastaGeri_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hastaGeri_bttnActionPerformed(evt);
            }
        });

        ikon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Hastane\\src\\Arayüz\\folder.png")); // NOI18N

        ikon2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Hastane\\src\\Arayüz\\password.png")); // NOI18N

        ikon3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\Hastane\\src\\Arayüz\\medical-records.png")); // NOI18N

        javax.swing.GroupLayout hastaKayıt_pnlLayout = new javax.swing.GroupLayout(hastaKayıt_pnl);
        hastaKayıt_pnl.setLayout(hastaKayıt_pnlLayout);
        hastaKayıt_pnlLayout.setHorizontalGroup(
            hastaKayıt_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hastaKayıt_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hastaKayıt_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(hastaKayıt_pnlLayout.createSequentialGroup()
                        .addComponent(ikon2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hastaKayıt_pnlLayout.createSequentialGroup()
                        .addGroup(hastaKayıt_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ikon1)
                            .addComponent(ikon3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(hastaKayıt_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2))))
                .addGap(8, 8, 8)
                .addGroup(hastaKayıt_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(hastaKayıt_pnlLayout.createSequentialGroup()
                        .addComponent(hastaKayıt_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hastaGeri_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(hastaKayıt_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(sifre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hastaKayıt_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tcno_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isim_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        hastaKayıt_pnlLayout.setVerticalGroup(
            hastaKayıt_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hastaKayıt_pnlLayout.createSequentialGroup()
                .addGroup(hastaKayıt_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hastaKayıt_pnlLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(hastaKayıt_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isim_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hastaKayıt_pnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ikon3)
                        .addGap(18, 18, 18)))
                .addGroup(hastaKayıt_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hastaKayıt_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tcno_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ikon1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hastaKayıt_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hastaKayıt_pnlLayout.createSequentialGroup()
                        .addGroup(hastaKayıt_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sifre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(hastaKayıt_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hastaKayıt_bttn)
                            .addComponent(hastaGeri_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(hastaKayıt_pnlLayout.createSequentialGroup()
                        .addComponent(ikon2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        giriş_tab.addTab("Hasta Kayıt", hastaKayıt_pnl);

        girisEkranı_pnl.add(giriş_tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 320, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkranı_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkranı_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hastaTc_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hastaTc_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hastaTc_txtActionPerformed

    private void doktorTc_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doktorTc_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doktorTc_txtActionPerformed

    private void doktorGiris_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doktorGiris_bttnActionPerformed
        if(doktorTc_txt.getText().length() == 0 || doktorSifre_txt.getText().length() == 0){
            Yardimci.mesaj("doldur");
        }
        else{
            try {   
                Connection con = conn.connDb();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM kullanici");
                while(rs.next()){
                    if(doktorTc_txt.getText().equals(rs.getString("tcno")) && doktorSifre_txt.getText().equals(rs.getString("sifre"))){
                        if(rs.getString("tip").equals("bashekim")){
                            Bashekim bhekim = new Bashekim();
                            bhekim.setId(rs.getInt("id"));
                            bhekim.setSifre("sifre");
                            bhekim.setTcno(rs.getString("tcno"));
                            bhekim.setIsim(rs.getString("isim"));
                            bhekim.setTip(rs.getString("tip"));
                            BashekimGiris_Ekranı basGiris = new BashekimGiris_Ekranı(bhekim);
                            basGiris.setVisible(true);
                            dispose();
                        }
                        if(rs.getString("tip").equals("doktor")){
                            Doktor doktorum = new Doktor();
                            doktorum.setId(rs.getInt("id"));
                            doktorum.setSifre("sifre");
                            doktorum.setTcno(rs.getString("tcno"));
                            doktorum.setIsim(rs.getString("isim"));
                            doktorum.setTip(rs.getString("tip"));
                            DoktorGiris_Ekranı dGiris = new DoktorGiris_Ekranı(doktorum);
                            dGiris.setVisible(true);
                            dispose();                   
                        }
                    }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Giriş_Ekranı.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_doktorGiris_bttnActionPerformed

    private void tcno_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcno_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcno_txtActionPerformed

    private void hastaKayıt_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hastaKayıt_bttnActionPerformed
        if(tcno_txt.getText().length() == 0 || sifre_txt.getText().length() == 0 || isim_txt.getText().length() == 0){
            Yardimci.mesaj("doldur");
        }
        else{
            try {
                boolean kontrol = hasta.kayit(tcno_txt.getText(), sifre_txt.getText(), isim_txt.getText());
                if(kontrol){
                    Yardimci.mesaj("İşlem Başarılı");
                    Giriş_Ekranı giris = new Giriş_Ekranı();
                    giris.setVisible(true);
                    dispose();
                }
                else{
                    Yardimci.mesaj("İşlem Gerçekleştirilmedi");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_hastaKayıt_bttnActionPerformed

    private void hastaGeri_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hastaGeri_bttnActionPerformed
        Giriş_Ekranı giris = new Giriş_Ekranı();
        giris.setVisible(true);
        dispose();
    }//GEN-LAST:event_hastaGeri_bttnActionPerformed

    private void girisYap_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisYap_bttnActionPerformed
        if(hastaTc_txt.getText().length()==0||hastaSifre_txt.getText().length()==0){
            Yardimci.mesaj("doldur");
        }
        else{
            boolean sonuc = true;
                try {   
                Connection con = conn.connDb();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM kullanici");
                
                while(rs.next()){
                    if(hastaTc_txt.getText().equals(rs.getString("tcno")) && hastaSifre_txt.getText().equals(rs.getString("sifre"))){

                        if(rs.getString("tip").equals("hasta")){
                            Hasta hasta = new Hasta();
                            hasta.setId(rs.getInt("id"));
                            hasta.setSifre("sifre");
                            hasta.setTcno(rs.getString("tcno"));
                            hasta.setIsim(rs.getString("isim"));
                            hasta.setTip(rs.getString("tip"));
                            HastaGiris_Ekrani hastaGiris = new HastaGiris_Ekrani(hasta);
                            hastaGiris.setVisible(true);
                            dispose();
                            sonuc = false;
                        }
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Giriş_Ekranı.class.getName()).log(Level.SEVERE, null, ex);
            }
                if(sonuc){
                    Yardimci.mesaj("Hasta sistemde kayıtlı değil!!!");
                }
        }
    }//GEN-LAST:event_girisYap_bttnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giriş_Ekranı().setVisible(true);
            }
        });
        Kullanici kullanici = new Kullanici();
        Bashekim bashekim = new Bashekim();
                   
        main_metot(kullanici);
        main_metot(bashekim);
    }
    
            public static void main_metot(Kullanici kullanici){
        kullanici.metodPolymorphism();
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doktorGiris_bttn;
    private javax.swing.JLabel doktorSifre_lbl;
    private javax.swing.JPasswordField doktorSifre_txt;
    private javax.swing.JLabel doktorTc_lbl;
    private javax.swing.JTextField doktorTc_txt;
    private javax.swing.JLabel doktor_icon;
    private javax.swing.JLabel doktor_icon1;
    private javax.swing.JPanel doktorgiris_pnl;
    private javax.swing.JPanel girisEkranı_pnl;
    private javax.swing.JButton girisYap_bttn;
    private javax.swing.JTabbedPane giriş_tab;
    private javax.swing.JButton hastaGeri_bttn;
    private javax.swing.JPanel hastaGirisi_pnl;
    private javax.swing.JButton hastaKayıt_bttn;
    private javax.swing.JPanel hastaKayıt_pnl;
    private javax.swing.JLabel hastaSifre_lbl;
    private javax.swing.JPasswordField hastaSifre_txt;
    private javax.swing.JLabel hastaTc_lbl;
    private javax.swing.JTextField hastaTc_txt;
    private javax.swing.JLabel hasta_icon1;
    private javax.swing.JLabel hasta_icon2;
    private javax.swing.JLabel hastane_icon;
    private javax.swing.JLabel hosgeldiniz_lbl;
    private javax.swing.JLabel ikon1;
    private javax.swing.JLabel ikon2;
    private javax.swing.JLabel ikon3;
    private javax.swing.JTextField isim_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField sifre_txt;
    private javax.swing.JTextField tcno_txt;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
