/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.ComplejoBinomica;
import model.ComplejoPolar;
import model.FlagSyntax;

/**
 *
 * @author Franco
 */
public class OpAvanzadasGUI extends javax.swing.JFrame {

    /**
     * Creates new form opAvanzadas
     */
    public OpAvanzadasGUI() {
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

        jFrameRaicesEnesimas = new javax.swing.JFrame();
        jTextFieldIndiceREnesimas = new javax.swing.JTextField();
        jLabelResultadoREnesimas = new javax.swing.JLabel();
        jButtonREnesimasEnFrame = new javax.swing.JButton();
        jFrameRadicacion = new javax.swing.JFrame();
        jLabelResultadoRadicacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelSideMenu = new javax.swing.JPanel();
        jPanelAppTitle = new javax.swing.JPanel();
        appTitle = new java.awt.Label();
        jPanelAppTitle1 = new javax.swing.JPanel();
        jButtonVolver = new javax.swing.JButton();
        jButtonOpBasicas = new javax.swing.JButton();
        jButtonOpAvanzadas = new javax.swing.JButton();
        jButtonFasores = new javax.swing.JButton();
        jTextFieldComplejo = new javax.swing.JTextField();
        jLabelOperator = new javax.swing.JLabel();
        jLabelResultado = new javax.swing.JLabel();
        jButtonTransformarResultado = new javax.swing.JButton();
        jButtonRaicesNEsimas = new javax.swing.JButton();
        jButtonPotencia = new javax.swing.JButton();
        jButtonRadicacion = new javax.swing.JButton();
        jTextFieldIndice = new javax.swing.JTextField();

        jTextFieldIndiceREnesimas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextFieldIndiceREnesimas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldIndiceREnesimas.setToolTipText("");
        jTextFieldIndiceREnesimas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIndiceREnesimasActionPerformed(evt);
            }
        });

        jLabelResultadoREnesimas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelResultadoREnesimas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResultadoREnesimas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonREnesimasEnFrame.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonREnesimasEnFrame.setText("RADICACION");
        jButtonREnesimasEnFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonREnesimasEnFrameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrameRaicesEnesimasLayout = new javax.swing.GroupLayout(jFrameRaicesEnesimas.getContentPane());
        jFrameRaicesEnesimas.getContentPane().setLayout(jFrameRaicesEnesimasLayout);
        jFrameRaicesEnesimasLayout.setHorizontalGroup(
            jFrameRaicesEnesimasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameRaicesEnesimasLayout.createSequentialGroup()
                .addGroup(jFrameRaicesEnesimasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrameRaicesEnesimasLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jFrameRaicesEnesimasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelResultadoREnesimas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jFrameRaicesEnesimasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldIndiceREnesimas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jFrameRaicesEnesimasLayout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jButtonREnesimasEnFrame)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jFrameRaicesEnesimasLayout.setVerticalGroup(
            jFrameRaicesEnesimasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameRaicesEnesimasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldIndiceREnesimas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabelResultadoREnesimas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonREnesimasEnFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jFrameRadicacion.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrameRadicacion.setAlwaysOnTop(true);
        jFrameRadicacion.setMinimumSize(new java.awt.Dimension(622, 300));

        jLabelResultadoRadicacion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelResultadoRadicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResultadoRadicacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("RESULTADO");

        javax.swing.GroupLayout jFrameRadicacionLayout = new javax.swing.GroupLayout(jFrameRadicacion.getContentPane());
        jFrameRadicacion.getContentPane().setLayout(jFrameRadicacionLayout);
        jFrameRadicacionLayout.setHorizontalGroup(
            jFrameRadicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameRadicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelResultadoRadicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jFrameRadicacionLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrameRadicacionLayout.setVerticalGroup(
            jFrameRadicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameRadicacionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelResultadoRadicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addComponent(appTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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
                .addComponent(jButtonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(jPanelAppTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTextFieldComplejo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextFieldComplejo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldComplejo.setToolTipText("");
        jTextFieldComplejo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldComplejoActionPerformed(evt);
            }
        });

        jLabelOperator.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabelResultado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonTransformarResultado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonTransformarResultado.setText("Transformar resultado");
        jButtonTransformarResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransformarResultadoActionPerformed(evt);
            }
        });

        jButtonRaicesNEsimas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonRaicesNEsimas.setText("RAICES ENESIMAS");
        jButtonRaicesNEsimas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRaicesNEsimasActionPerformed(evt);
            }
        });

        jButtonPotencia.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonPotencia.setText("POTENCIA");
        jButtonPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPotenciaActionPerformed(evt);
            }
        });

        jButtonRadicacion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonRadicacion.setText("RADICACION");
        jButtonRadicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRadicacionActionPerformed(evt);
            }
        });

        jTextFieldIndice.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextFieldIndice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldIndice.setToolTipText("");
        jTextFieldIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIndiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelSideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(jButtonRaicesNEsimas)
                                .addGap(44, 44, 44)
                                .addComponent(jButtonRadicacion))
                            .addComponent(jButtonTransformarResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldComplejo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabelOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldComplejo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRadicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRaicesNEsimas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButtonTransformarResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        this.dispose();
        new MainGUI().setVisible(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonOpBasicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpBasicasActionPerformed
        this.dispose();
        new OpBasicasGUI().setVisible(true);
    }//GEN-LAST:event_jButtonOpBasicasActionPerformed

    private void jButtonOpAvanzadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpAvanzadasActionPerformed
        this.dispose();
        new OpAvanzadasGUI().setVisible(true);
    }//GEN-LAST:event_jButtonOpAvanzadasActionPerformed

    private void jButtonFasoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFasoresActionPerformed
        this.dispose();
        new FasoresGUI().setVisible(true);
    }//GEN-LAST:event_jButtonFasoresActionPerformed

    private void jTextFieldComplejoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldComplejoActionPerformed

    }//GEN-LAST:event_jTextFieldComplejoActionPerformed

    private void jButtonTransformarResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransformarResultadoActionPerformed
 
    }//GEN-LAST:event_jButtonTransformarResultadoActionPerformed

    private void jButtonRaicesNEsimasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRaicesNEsimasActionPerformed
        String numero, resultado;
        int indice;
        
        numero = jTextFieldComplejo.getText();
        indice = Integer.parseInt(jTextFieldIndice.getText());
        FlagSyntax flagSyntax = new FlagSyntax();
        
        
    }//GEN-LAST:event_jButtonRaicesNEsimasActionPerformed

    private void jButtonPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPotenciaActionPerformed
        String numero, resultado;
        int indice;
        
        numero = jTextFieldComplejo.getText();
        indice = Integer.parseInt(jTextFieldIndice.getText());
        FlagSyntax flagSyntax = new FlagSyntax();
        
        switch (numero.charAt(0)) {
            case '(' :
                ComplejoBinomica cb;
                cb = getNumeroBinomicoDeTexto(numero,flagSyntax);
                
                if (flagSyntax.flag==1){
                    ComplejoPolar cp = new ComplejoPolar();
                    cp.binomicaAPolar(cb);     
                    cp.potenciaNatural(indice);
                    jLabelResultado.setText(resultadoPolar(cp));
                } else {
                    jLabelResultado.setText("SYNTAX ERROR");
                }
                break;
            case '[' :
                ComplejoPolar cp;
                cp = getNumeroPolarDeTexto (numero,flagSyntax);
                
                if (flagSyntax.flag==1){   
                    cp.potenciaNatural(indice);
                    jLabelResultado.setText(resultadoPolar(cp));
                } else {
                    jLabelResultado.setText("SYNTAX ERROR");
                }
                break;
        }     
    }//GEN-LAST:event_jButtonPotenciaActionPerformed

    private void jButtonRadicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRadicacionActionPerformed
        String numero, resultado;
        int indice;
        
        numero = jTextFieldComplejo.getText();
        indice = Integer.parseInt(jTextFieldIndice.getText());
        FlagSyntax flagSyntax = new FlagSyntax();
        ArrayList<ComplejoPolar> listaResultados = new ArrayList<>();
        
        switch (numero.charAt(0)) {
            case '(' :
                ComplejoBinomica cb;
                cb = getNumeroBinomicoDeTexto(numero,flagSyntax);
                
                if (flagSyntax.flag==1){                   
                    for (int k=0; k<indice ; k++) {
                        ComplejoPolar cp = new ComplejoPolar();
                        cp.binomicaAPolar(cb);
                        cp.raizNEsima(indice,k);
                        listaResultados.add(cp);
                    }                
                } else {
                    jLabelResultado.setText("SYNTAX ERROR");
                }
                break;
            case '[' :
                ComplejoPolar cp, cpOriginal;
                cp = getNumeroPolarDeTexto (numero,flagSyntax);
                cpOriginal = cp;
                
                if (flagSyntax.flag==1){   
                    for (int k=0; k<indice ; k++) {
                        cp.raizNEsima(indice,k);
                        listaResultados.add(cp);
                        
                        cp = cpOriginal;
                    } 
                } else {
                    jLabelResultado.setText("SYNTAX ERROR");
                }
                break;
        }         
        
        String valueToBeInserted="";
        for (int i=0; listaResultados.size() >= i; i++) {
            
            valueToBeInserted = valueToBeInserted + " " + resultadoPolar(listaResultados.get(i));
     
        }
        jLabelResultadoRadicacion.setText(valueToBeInserted );
        jFrameRadicacion.setVisible(true);
        
    }//GEN-LAST:event_jButtonRadicacionActionPerformed

    private void jTextFieldIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIndiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIndiceActionPerformed

    private void jTextFieldIndiceREnesimasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIndiceREnesimasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIndiceREnesimasActionPerformed

    private void jButtonREnesimasEnFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonREnesimasEnFrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonREnesimasEnFrameActionPerformed

    private ComplejoPolar getNumeroPolarDeTexto (String textfield,FlagSyntax flagSyntax){
        ComplejoPolar numeroComplejo=new ComplejoPolar();
        String a="0",b="0";
        int comaPos=0;
        try{
            comaPos= textfield.indexOf(';');
            a=textfield.substring(1,comaPos);
            b=textfield.substring(comaPos+1, textfield.length()-1);
        }catch(StringIndexOutOfBoundsException  e){
            flagSyntax.flag=0;
        }        
        if (textfield.charAt(textfield.length()-1)!=']'){
            flagSyntax.flag=0;
        }
        try{
            numeroComplejo.modulo = Double.parseDouble(a);
            numeroComplejo.argumento = Double.parseDouble(b);
        }catch(NumberFormatException e){
            flagSyntax.flag=0;
        }
        return numeroComplejo;
    } 
    
    private ComplejoBinomica getNumeroBinomicoDeTexto (String textfield,FlagSyntax flagSyntax){
        ComplejoBinomica numeroComplejo=new ComplejoBinomica();
        String a="0",b="0";
        int comaPos=0;
        try{
            comaPos= textfield.indexOf(',');
            a=textfield.substring(1,comaPos);
            b=textfield.substring(comaPos+1, textfield.length()-1);
        }catch(StringIndexOutOfBoundsException  e){
            flagSyntax.flag=0;
        }        
        if (textfield.charAt(textfield.length()-1)!=')'){
           
        }
        try{
            numeroComplejo.componenteReal = Double.parseDouble(a);             
            numeroComplejo.componenteImaginaria = Double.parseDouble(b);
        }catch(NumberFormatException e){
             flagSyntax.flag=0;
        }
        return numeroComplejo;
    }
   
    private String resultadoBinomica (ComplejoBinomica resultado){
        String res="(",num;
        Double real = resultado.componenteReal,imaginaria=resultado.componenteImaginaria;
        num = real.toString();
        res=res.concat(num);
        res=res.concat(",");
        num=imaginaria.toString();
        res=res.concat(num);
        res=res.concat(")");
        return res;
    }
    
     private String resultadoPolar (ComplejoPolar resultado){
        String res="[",num;
        Double mod = resultado.modulo,arg=resultado.argumento;
        num = mod.toString();
        res=res.concat(num);
        res=res.concat(";");
        num=arg.toString();
        res=res.concat(num);
        res=res.concat("]");
        return res;
    }
    
    
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
            java.util.logging.Logger.getLogger(OpAvanzadasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpAvanzadasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpAvanzadasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpAvanzadasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpAvanzadasGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label appTitle;
    private javax.swing.JButton jButtonFasores;
    private javax.swing.JButton jButtonOpAvanzadas;
    private javax.swing.JButton jButtonOpBasicas;
    public javax.swing.JButton jButtonPotencia;
    public javax.swing.JButton jButtonREnesimasEnFrame;
    public javax.swing.JButton jButtonRadicacion;
    public javax.swing.JButton jButtonRaicesNEsimas;
    public javax.swing.JButton jButtonTransformarResultado;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JFrame jFrameRadicacion;
    private javax.swing.JFrame jFrameRaicesEnesimas;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabelOperator;
    public javax.swing.JLabel jLabelResultado;
    public javax.swing.JLabel jLabelResultadoREnesimas;
    public javax.swing.JLabel jLabelResultadoRadicacion;
    private javax.swing.JPanel jPanelAppTitle;
    private javax.swing.JPanel jPanelAppTitle1;
    private javax.swing.JPanel jPanelSideMenu;
    public javax.swing.JTextField jTextFieldComplejo;
    public javax.swing.JTextField jTextFieldIndice;
    public javax.swing.JTextField jTextFieldIndiceREnesimas;
    // End of variables declaration//GEN-END:variables


}
