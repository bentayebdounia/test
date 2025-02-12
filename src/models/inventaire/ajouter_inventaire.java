/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package models.inventaire;

import models.ClasseVerification;

/**
 *
 * @author Alfec Informatique 2
 */
public class ajouter_inventaire extends javax.swing.JFrame {

    
    public ajouter_inventaire() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        motifText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        stockBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        idStock = new javax.swing.JTextField();
        annulerBtn = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        validerBtn = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        date = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajouter un inventaire");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel1.setText("Motif");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 70, 40, 37));

        motifText.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        motifText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motifTextActionPerformed(evt);
            }
        });
        jPanel1.add(motifText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 570, 37));

        jLabel2.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel2.setText("Stock");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, 37));

        stockBox.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        stockBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chambre froide", "Dépot" }));
        jPanel1.add(stockBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 570, 37));

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel3.setText("Id stock");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, 37));

        idStock.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jPanel1.add(idStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 570, 37));

        annulerBtn.setBackground(new java.awt.Color(223, 66, 53));
        annulerBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(223, 66, 53), 25, true));
        annulerBtn.setOpaque(false);
        annulerBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Annuler");
        annulerBtn.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 70, 30));

        jPanel1.add(annulerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 140, 29));

        validerBtn.setBackground(new java.awt.Color(79, 139, 42));
        validerBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 139, 42), 25, true));
        validerBtn.setOpaque(false);
        validerBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Valider");
        validerBtn.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 60, 30));

        jPanel1.add(validerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 140, 29));

        date.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        date.setModel(new javax.swing.SpinnerDateModel());
        date.setEditor(new javax.swing.JSpinner.DateEditor(date, "yyyy-MM-dd"));
        date.setPreferredSize(new java.awt.Dimension(124, 30));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 570, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel4.setText("Date");
        jLabel4.setPreferredSize(new java.awt.Dimension(32, 30));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void motifTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motifTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motifTextActionPerformed

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
            java.util.logging.Logger.getLogger(ajouter_inventaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajouter_inventaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajouter_inventaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajouter_inventaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ajouter_inventaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel annulerBtn;
    private javax.swing.JSpinner date;
    private javax.swing.JTextField idStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField motifText;
    private javax.swing.JComboBox<String> stockBox;
    private javax.swing.JPanel validerBtn;
    // End of variables declaration//GEN-END:variables
}
