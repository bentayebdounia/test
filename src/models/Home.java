/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package models;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Alfec Informatique 2
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form FORME1
     */
    public Home() {
        initComponents();
    }
    
    public void hoven1(JLabel label, JPanel panel){
        label.setForeground(Color.WHITE);
        panel.setBackground(Color.decode("#7B170F"));
    }
    public void hoven2(JLabel label, JPanel panel){
        label.setForeground(Color.BLACK);
        panel.setBackground(Color.decode("#F0F0F0"));
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
        administrateurPanel = new javax.swing.JPanel();
        administrateur = new javax.swing.JLabel();
        iconAdmin = new javax.swing.JLabel();
        agentPanel = new javax.swing.JPanel();
        agent = new javax.swing.JLabel();
        iconAgent = new javax.swing.JLabel();
        ModulateurPanel = new javax.swing.JPanel();
        modulateur = new javax.swing.JLabel();
        iconModulateur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));

        administrateurPanel.setBackground(new java.awt.Color(240, 240, 240));
        administrateurPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                administrateurPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                administrateurPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                administrateurPanelMouseExited(evt);
            }
        });
        administrateurPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        administrateur.setFont(new java.awt.Font("Cambria Math", 0, 32)); // NOI18N
        administrateur.setText("Administrateur");
        administrateur.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        administrateurPanel.add(administrateur, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        iconAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/admin_settings_male_60px.png"))); // NOI18N
        administrateurPanel.add(iconAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        agentPanel.setBackground(new java.awt.Color(240, 240, 240));
        agentPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agentPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agentPanelMouseExited(evt);
            }
        });
        agentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agent.setFont(new java.awt.Font("Cambria Math", 0, 32)); // NOI18N
        agent.setText("Agent");
        agent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        agentPanel.add(agent, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, 30));

        iconAgent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agent_male_60px.png"))); // NOI18N
        agentPanel.add(iconAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        ModulateurPanel.setBackground(new java.awt.Color(240, 240, 240));
        ModulateurPanel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                ModulateurPanelMouseWheelMoved(evt);
            }
        });
        ModulateurPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModulateurPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ModulateurPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ModulateurPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ModulateurPanelMouseReleased(evt);
            }
        });
        ModulateurPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modulateur.setFont(new java.awt.Font("Cambria Math", 0, 32)); // NOI18N
        modulateur.setText("Modulateur");
        modulateur.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ModulateurPanel.add(modulateur, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, 30));

        iconModulateur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Services_60px.png"))); // NOI18N
        ModulateurPanel.add(iconModulateur, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ModulateurPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(administrateurPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(ModulateurPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(administrateurPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(agentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModulateurPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_ModulateurPanelMouseWheelMoved
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_ModulateurPanelMouseWheelMoved

    private void ModulateurPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModulateurPanelMousePressed
        
    }//GEN-LAST:event_ModulateurPanelMousePressed

    private void ModulateurPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModulateurPanelMouseReleased
      
    }//GEN-LAST:event_ModulateurPanelMouseReleased

    private void ModulateurPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModulateurPanelMouseEntered
        // TODO add your handling code here:
        hoven1(modulateur,ModulateurPanel);
        
        //iconModulateur.setIcon(new ImageIcon("/icons/Service_60pxW.png"));
        
    }//GEN-LAST:event_ModulateurPanelMouseEntered

    private void ModulateurPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModulateurPanelMouseExited
        // TODO add your handling code here:
        
         hoven2(modulateur,ModulateurPanel);
        //iconModulateur.setIcon(new ImageIcon("/icons/Service_60px.png"));
        
    }//GEN-LAST:event_ModulateurPanelMouseExited

    private void administrateurPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_administrateurPanelMouseEntered
        // TODO add your handling code here:
         hoven1(administrateur,administrateurPanel);
    }//GEN-LAST:event_administrateurPanelMouseEntered

    private void administrateurPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_administrateurPanelMouseExited
        // TODO add your handling code here:
        hoven2(administrateur,administrateurPanel);
    }//GEN-LAST:event_administrateurPanelMouseExited

    private void agentPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agentPanelMouseEntered
        // TODO add your handling code here:
        hoven1(agent,agentPanel);
    }//GEN-LAST:event_agentPanelMouseEntered

    private void agentPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agentPanelMouseExited
        // TODO add your handling code here:
        hoven2(agent,agentPanel);
    }//GEN-LAST:event_agentPanelMouseExited

    private void administrateurPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_administrateurPanelMouseClicked
        // TODO add your handling code here:
        Authentification auth = new Authentification();
        auth.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_administrateurPanelMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ModulateurPanel;
    private javax.swing.JLabel administrateur;
    private javax.swing.JPanel administrateurPanel;
    private javax.swing.JLabel agent;
    private javax.swing.JPanel agentPanel;
    private javax.swing.JLabel iconAdmin;
    private javax.swing.JLabel iconAgent;
    private javax.swing.JLabel iconModulateur;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel modulateur;
    // End of variables declaration//GEN-END:variables
}