/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Franco
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public MainGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFooter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonGithub1 = new javax.swing.JButton();
        jButtonGithub2 = new javax.swing.JButton();
        jButtonGithub3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanelSideMenu = new javax.swing.JPanel();
        jPanelAppTitle = new javax.swing.JPanel();
        appTitle = new java.awt.Label();
        jPanelAppTitle1 = new javax.swing.JPanel();
        jButtonVolver = new javax.swing.JButton();
        jButtonOpBasicas = new javax.swing.JButton();
        jButtonOpAvanzadas = new javax.swing.JButton();
        jButtonFasores = new javax.swing.JButton();
        jCardOpBasicas = new javax.swing.JButton();
        jCardFasores = new javax.swing.JButton();
        jCardOpAvanzadas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setBackground(new java.awt.Color(225, 232, 240));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));

        jPanelFooter.setBackground(new java.awt.Color(31, 103, 166));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(225, 232, 240));
        jLabel1.setText("CREADO POR:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/logo utn.png"))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(225, 232, 240));
        jLabel4.setText("Santiago Chejolan");

        jLabel5.setForeground(new java.awt.Color(225, 232, 240));
        jLabel5.setText("Santiago Aspres");

        jButtonGithub1.setForeground(new java.awt.Color(31, 103, 166));
        jButtonGithub1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Github Icon.png"))); // NOI18N
        jButtonGithub1.setBorder(null);
        jButtonGithub1.setContentAreaFilled(false);
        jButtonGithub1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGithub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGithub1ActionPerformed(evt);
            }
        });

        jButtonGithub2.setForeground(new java.awt.Color(31, 103, 166));
        jButtonGithub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Github Icon.png"))); // NOI18N
        jButtonGithub2.setBorder(null);
        jButtonGithub2.setContentAreaFilled(false);
        jButtonGithub2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGithub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGithub2ActionPerformed(evt);
            }
        });

        jButtonGithub3.setForeground(new java.awt.Color(31, 103, 166));
        jButtonGithub3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Github Icon.png"))); // NOI18N
        jButtonGithub3.setBorder(null);
        jButtonGithub3.setContentAreaFilled(false);
        jButtonGithub3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGithub3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGithub3ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(225, 232, 240));
        jLabel6.setText("Franco Fresno");

        javax.swing.GroupLayout jPanelFooterLayout = new javax.swing.GroupLayout(jPanelFooter);
        jPanelFooter.setLayout(jPanelFooterLayout);
        jPanelFooterLayout.setHorizontalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelFooterLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGithub1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFooterLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGithub3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFooterLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGithub2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanelFooterLayout.setVerticalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFooterLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelFooterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelFooterLayout.createSequentialGroup()
                                .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonGithub1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addComponent(jButtonGithub2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jButtonGithub3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))))
        );

        jPanelSideMenu.setBackground(new java.awt.Color(25, 33, 43));
        jPanelSideMenu.setToolTipText("");

        jPanelAppTitle.setBackground(new java.awt.Color(38, 47, 61));
        jPanelAppTitle.setToolTipText("");

        appTitle.setAlignment(java.awt.Label.CENTER);
        appTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        appTitle.setForeground(new java.awt.Color(225, 232, 240));
        appTitle.setText("NCOM APP");

        javax.swing.GroupLayout jPanelAppTitleLayout = new javax.swing.GroupLayout(jPanelAppTitle);
        jPanelAppTitle.setLayout(jPanelAppTitleLayout);
        jPanelAppTitleLayout.setHorizontalGroup(
            jPanelAppTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelAppTitleLayout.setVerticalGroup(
            jPanelAppTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAppTitleLayout.createSequentialGroup()
                .addComponent(appTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        appTitle.getAccessibleContext().setAccessibleDescription("Titulo de la app");

        jPanelAppTitle1.setBackground(new java.awt.Color(38, 47, 61));
        jPanelAppTitle1.setToolTipText("");

        jButtonVolver.setBackground(new java.awt.Color(38, 47, 61));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonVolver.setForeground(new java.awt.Color(225, 232, 240));
        jButtonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Back Icon.png"))); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.setBorder(null);
        jButtonVolver.setBorderPainted(false);
        jButtonVolver.setContentAreaFilled(false);
        jButtonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAppTitle1Layout = new javax.swing.GroupLayout(jPanelAppTitle1);
        jPanelAppTitle1.setLayout(jPanelAppTitle1Layout);
        jPanelAppTitle1Layout.setHorizontalGroup(
            jPanelAppTitle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAppTitle1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelAppTitle1Layout.setVerticalGroup(
            jPanelAppTitle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAppTitle1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonOpBasicas.setBackground(new java.awt.Color(25, 33, 43));
        jButtonOpBasicas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonOpBasicas.setForeground(new java.awt.Color(225, 232, 240));
        jButtonOpBasicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Plus Icon.png"))); // NOI18N
        jButtonOpBasicas.setText("   Operaciones Básicas");
        jButtonOpBasicas.setBorder(null);
        jButtonOpBasicas.setBorderPainted(false);
        jButtonOpBasicas.setContentAreaFilled(false);
        jButtonOpBasicas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOpBasicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpBasicasActionPerformed(evt);
            }
        });

        jButtonOpAvanzadas.setBackground(new java.awt.Color(25, 33, 43));
        jButtonOpAvanzadas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonOpAvanzadas.setForeground(new java.awt.Color(225, 232, 240));
        jButtonOpAvanzadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Square Root Icon.png"))); // NOI18N
        jButtonOpAvanzadas.setText(" Operaciones Avanzadas");
        jButtonOpAvanzadas.setBorder(null);
        jButtonOpAvanzadas.setBorderPainted(false);
        jButtonOpAvanzadas.setContentAreaFilled(false);
        jButtonOpAvanzadas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOpAvanzadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpAvanzadasActionPerformed(evt);
            }
        });

        jButtonFasores.setBackground(new java.awt.Color(25, 33, 43));
        jButtonFasores.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonFasores.setForeground(new java.awt.Color(225, 232, 240));
        jButtonFasores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Fasores Icon.png"))); // NOI18N
        jButtonFasores.setText("   Sumatoria de Fasores");
        jButtonFasores.setBorder(null);
        jButtonFasores.setBorderPainted(false);
        jButtonFasores.setContentAreaFilled(false);
        jButtonFasores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFasores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFasoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSideMenuLayout = new javax.swing.GroupLayout(jPanelSideMenu);
        jPanelSideMenu.setLayout(jPanelSideMenuLayout);
        jPanelSideMenuLayout.setHorizontalGroup(
            jPanelSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAppTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelAppTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSideMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonOpAvanzadas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonFasores))
                .addContainerGap())
            .addGroup(jPanelSideMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonOpBasicas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSideMenuLayout.setVerticalGroup(
            jPanelSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSideMenuLayout.createSequentialGroup()
                .addComponent(jPanelAppTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButtonOpBasicas)
                .addGap(18, 18, 18)
                .addComponent(jButtonOpAvanzadas)
                .addGap(18, 18, 18)
                .addComponent(jButtonFasores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelAppTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelAppTitle.getAccessibleContext().setAccessibleName("titleApp");
        jPanelAppTitle.getAccessibleContext().setAccessibleDescription("Titulo de la App en menu");

        jCardOpBasicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Op Básicas.png"))); // NOI18N
        jCardOpBasicas.setBorder(null);
        jCardOpBasicas.setContentAreaFilled(false);
        jCardOpBasicas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCardOpBasicas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCardOpBasicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCardOpBasicasActionPerformed(evt);
            }
        });

        jCardFasores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Fasores.png"))); // NOI18N
        jCardFasores.setBorder(null);
        jCardFasores.setContentAreaFilled(false);
        jCardFasores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCardFasores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCardFasores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCardFasoresActionPerformed(evt);
            }
        });

        jCardOpAvanzadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Op Avanzadas.png"))); // NOI18N
        jCardOpAvanzadas.setBorder(null);
        jCardOpAvanzadas.setContentAreaFilled(false);
        jCardOpAvanzadas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCardOpAvanzadas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCardOpAvanzadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCardOpAvanzadasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelSideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCardOpBasicas, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                        .addGap(33, 33, 33)
                        .addComponent(jCardOpAvanzadas, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addGap(33, 33, 33)
                        .addComponent(jCardFasores, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                    .addComponent(jPanelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCardFasores, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(jCardOpAvanzadas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jCardOpBasicas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(jPanelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(714, 442));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonOpBasicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpBasicasActionPerformed
        this.dispose();
        new OpBasicasGUI().setVisible(true);
    }//GEN-LAST:event_jButtonOpBasicasActionPerformed

    private void jCardOpBasicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCardOpBasicasActionPerformed
        this.dispose();
        new OpBasicasGUI().setVisible(true);
    }//GEN-LAST:event_jCardOpBasicasActionPerformed

    private void jButtonOpAvanzadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpAvanzadasActionPerformed
        this.dispose();
        new OpAvanzadasGUI().setVisible(true);
    }//GEN-LAST:event_jButtonOpAvanzadasActionPerformed

    private void jCardOpAvanzadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCardOpAvanzadasActionPerformed
        this.dispose();
        new OpAvanzadasGUI().setVisible(true);
    }//GEN-LAST:event_jCardOpAvanzadasActionPerformed

    private void jButtonFasoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFasoresActionPerformed
        this.dispose();
        new FasoresGUI().setVisible(true);
    }//GEN-LAST:event_jButtonFasoresActionPerformed

    private void jCardFasoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCardFasoresActionPerformed
        this.dispose();
        new FasoresGUI().setVisible(true);
    }//GEN-LAST:event_jCardFasoresActionPerformed

    private void jButtonGithub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGithub1ActionPerformed
       try { 
         String url = "https://github.com/francofresno";
         java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
       }
       catch (java.io.IOException e) {
           System.out.println(e.getMessage());
       }
    }//GEN-LAST:event_jButtonGithub1ActionPerformed

    private void jButtonGithub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGithub2ActionPerformed
       try { 
         String url = "https://github.com/smchejolan";
         java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
       }
       catch (java.io.IOException e) {
           System.out.println(e.getMessage());
       }
    }//GEN-LAST:event_jButtonGithub2ActionPerformed

    private void jButtonGithub3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGithub3ActionPerformed
       try { 
         String url = "https://github.com/SantiagoAspres";
         java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
       }
       catch (java.io.IOException e) {
           System.out.println(e.getMessage());
       }
    }//GEN-LAST:event_jButtonGithub3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label appTitle;
    private javax.swing.JButton jButtonFasores;
    private javax.swing.JButton jButtonGithub1;
    private javax.swing.JButton jButtonGithub2;
    private javax.swing.JButton jButtonGithub3;
    private javax.swing.JButton jButtonOpAvanzadas;
    private javax.swing.JButton jButtonOpBasicas;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JButton jCardFasores;
    private javax.swing.JButton jCardOpAvanzadas;
    private javax.swing.JButton jCardOpBasicas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelAppTitle;
    private javax.swing.JPanel jPanelAppTitle1;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelSideMenu;
    // End of variables declaration//GEN-END:variables
}
