/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projtopics.guibuilder.apps;

import java.awt.Color;

/**
 *
 * @author misha
 */
public class ColorChangingApp extends javax.swing.JFrame {

    /**
     * Creates new form ColorChnagingApp
     */
   
    public ColorChangingApp() {
        super("color changing app");
        initComponents();
        setLocationRelativeTo(null);
        myPanel.setBackground(Color.black);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnQuit = new javax.swing.JButton();
        jcbRed = new javax.swing.JCheckBox();
        jcbGreen = new javax.swing.JCheckBox();
        jcbBlue = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Color Changing App");

        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 255, 255));
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        jcbRed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbRed.setForeground(new java.awt.Color(255, 255, 255));
        jcbRed.setText("Red");
        jcbRed.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbRedItemStateChanged(evt);
            }
        });

        jcbGreen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbGreen.setForeground(new java.awt.Color(255, 255, 255));
        jcbGreen.setText("Green");
        jcbGreen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbGreenItemStateChanged(evt);
            }
        });

        jcbBlue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbBlue.setForeground(new java.awt.Color(255, 255, 255));
        jcbBlue.setText("Blue");
        jcbBlue.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbBlueItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout myPanelLayout = new javax.swing.GroupLayout(myPanel);
        myPanel.setLayout(myPanelLayout);
        myPanelLayout.setHorizontalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btnQuit))
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jcbRed)
                        .addGap(33, 33, 33)
                        .addComponent(jcbGreen)
                        .addGap(27, 27, 27)
                        .addComponent(jcbBlue)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        myPanelLayout.setVerticalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbRed)
                    .addComponent(jcbGreen)
                    .addComponent(jcbBlue))
                .addGap(40, 40, 40)
                .addComponent(btnQuit)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void jcbRedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbRedItemStateChanged
         if(jcbRed.isSelected()){
             myPanel.setBackground(Color.red);
         }
         if(jcbGreen.isSelected()){
              myPanel.setBackground(Color.green);
         }
         if(jcbBlue.isSelected()){
              myPanel.setBackground(Color.blue);
         }
         if(jcbRed.isSelected()&&jcbGreen.isSelected()&&jcbBlue.isSelected()){
              myPanel.setBackground(Color.white);
         }
          if(jcbRed.isSelected()==false&&jcbGreen.isSelected()==false&&jcbBlue.isSelected()==false){
              myPanel.setBackground(Color.black);
         }
           if(jcbRed.isSelected()&&jcbGreen.isSelected()&&jcbBlue.isSelected()==false){
              myPanel.setBackground(Color.yellow);
         }
            if(jcbRed.isSelected()&&jcbGreen.isSelected()==false&&jcbBlue.isSelected()){
              myPanel.setBackground(Color.magenta);
         }
             if(jcbRed.isSelected()==false&&jcbGreen.isSelected()&&jcbBlue.isSelected()){
              myPanel.setBackground(Color.cyan);
         }
         
    }//GEN-LAST:event_jcbRedItemStateChanged

    private void jcbGreenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbGreenItemStateChanged
       if(jcbRed.isSelected()){
             myPanel.setBackground(Color.red);
         }
         if(jcbGreen.isSelected()){
              myPanel.setBackground(Color.green);
         }
         if(jcbBlue.isSelected()){
              myPanel.setBackground(Color.blue);
         }
         if(jcbRed.isSelected()&&jcbGreen.isSelected()&&jcbBlue.isSelected()){
              myPanel.setBackground(Color.white);
         }
          if(jcbRed.isSelected()==false&&jcbGreen.isSelected()==false&&jcbBlue.isSelected()==false){
              myPanel.setBackground(Color.black);
         }
           if(jcbRed.isSelected()&&jcbGreen.isSelected()&&jcbBlue.isSelected()==false){
              myPanel.setBackground(Color.yellow);
         }
            if(jcbRed.isSelected()&&jcbGreen.isSelected()==false&&jcbBlue.isSelected()){
              myPanel.setBackground(Color.magenta);
         }
             if(jcbRed.isSelected()==false&&jcbGreen.isSelected()&&jcbBlue.isSelected()){
              myPanel.setBackground(Color.cyan);
         }
    }//GEN-LAST:event_jcbGreenItemStateChanged

    private void jcbBlueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbBlueItemStateChanged
        if(jcbRed.isSelected()){
             myPanel.setBackground(Color.red);
         }
         if(jcbGreen.isSelected()){
              myPanel.setBackground(Color.green);
         }
         if(jcbBlue.isSelected()){
              myPanel.setBackground(Color.blue);
         }
         if(jcbRed.isSelected()&&jcbGreen.isSelected()&&jcbBlue.isSelected()){
              myPanel.setBackground(Color.white);
         }
          if(jcbRed.isSelected()==false&&jcbGreen.isSelected()==false&&jcbBlue.isSelected()==false){
              myPanel.setBackground(Color.black);
         }
           if(jcbRed.isSelected()&&jcbGreen.isSelected()&&jcbBlue.isSelected()==false){
              myPanel.setBackground(Color.yellow);
         }
            if(jcbRed.isSelected()&&jcbGreen.isSelected()==false&&jcbBlue.isSelected()){
              myPanel.setBackground(Color.magenta);
         }
             if(jcbRed.isSelected()==false&&jcbGreen.isSelected()&&jcbBlue.isSelected()){
              myPanel.setBackground(Color.cyan);
         }
    }//GEN-LAST:event_jcbBlueItemStateChanged

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
            java.util.logging.Logger.getLogger(ColorChangingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColorChangingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColorChangingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorChangingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColorChangingApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox jcbBlue;
    private javax.swing.JCheckBox jcbGreen;
    private javax.swing.JCheckBox jcbRed;
    private javax.swing.JPanel myPanel;
    // End of variables declaration//GEN-END:variables
}
