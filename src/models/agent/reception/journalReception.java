/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package models.agent.reception;

/**
 *
 * @author Alfec Informatique 2
 */
public class journalReception extends javax.swing.JFrame {

    /**
     * Creates new form journalReception
     */
    public journalReception() {
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
        date = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_reception = new javax.swing.JTable();
        type_prod = new javax.swing.JLabel();
        typeProd_box = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Journal de reception");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel1.setText("Date");
        jLabel1.setPreferredSize(new java.awt.Dimension(32, 30));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        date.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        date.setModel(new javax.swing.SpinnerDateModel());
        date.setEditor(new javax.swing.JSpinner.DateEditor(date, "yyyy-MM-dd"));
        date.setPreferredSize(new java.awt.Dimension(124, 30));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        table_reception.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        table_reception.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fourniseur", "Acheteur", "Produit", "Poids", "Pièces", "Date", "Heure", "Type de bon", "Agent de réception"
            }
        ));
        jScrollPane1.setViewportView(table_reception);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 119, 856, 370));

        type_prod.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        type_prod.setText("Type de produit");
        type_prod.setPreferredSize(new java.awt.Dimension(32, 30));
        jPanel1.add(type_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 120, -1));

        typeProd_box.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        typeProd_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Poulet", "Légume", "Autres" }));
        typeProd_box.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(typeProd_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(journalReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(journalReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(journalReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(journalReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new journalReception().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_reception;
    private javax.swing.JComboBox<String> typeProd_box;
    private javax.swing.JLabel type_prod;
    // End of variables declaration//GEN-END:variables
}
