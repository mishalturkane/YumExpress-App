/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projtopics.guibuilder.apps;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Date;

/**
 *
 * @author misha
 */
public class MyFrame extends javax.swing.JFrame {

    /**
     * Creates new form MyFrame
     */
    public MyFrame() {
        super("Mishal's frame");
        initComponents();
        setLocationRelativeTo(null);  
        Toolkit t=Toolkit.getDefaultToolkit();
        Image img=t.getImage("E:\\Recorded Lec\\java.png");
        setIconImage(img);
       // ImageIcon icon=new ImageIcon("D:\\Chrome Downloads\\press-button.png");
       // jButton1.setIcon(icon);
        btnChangeColor.setToolTipText("click me for changing color");
       
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
        btnChangeColor = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        btnShowTimeStamp = new javax.swing.JButton();
        lblShowTimeStamp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnChangeColor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnChangeColor.setText("Change Color");
        btnChangeColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeColorActionPerformed(evt);
            }
        });

        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        btnShowTimeStamp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnShowTimeStamp.setText("Show TimeStamp");
        btnShowTimeStamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowTimeStampActionPerformed(evt);
            }
        });

        lblShowTimeStamp.setBackground(new java.awt.Color(255, 153, 255));
        lblShowTimeStamp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblShowTimeStamp.setForeground(new java.awt.Color(255, 153, 153));
        lblShowTimeStamp.setOpaque(true);

        javax.swing.GroupLayout myPanelLayout = new javax.swing.GroupLayout(myPanel);
        myPanel.setLayout(myPanelLayout);
        myPanelLayout.setHorizontalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnChangeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnShowTimeStamp, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblShowTimeStamp, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        myPanelLayout.setVerticalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lblShowTimeStamp, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangeColor)
                    .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowTimeStamp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(384, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(myPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(myPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeColorActionPerformed
       myPanel.setBackground(Color.cyan);
    }//GEN-LAST:event_btnChangeColorActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnShowTimeStampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTimeStampActionPerformed
        Date d=new Date();
        lblShowTimeStamp.setText(d+"");
            
         
    }//GEN-LAST:event_btnShowTimeStampActionPerformed

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
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeColor;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnShowTimeStamp;
    private javax.swing.JLabel lblShowTimeStamp;
    private javax.swing.JPanel myPanel;
    // End of variables declaration//GEN-END:variables
}
