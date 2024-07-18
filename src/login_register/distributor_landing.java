/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login_register;

import main.welcome_page;

/**
 *
 * @author varsh
 */
public class distributor_landing extends javax.swing.JFrame {

    /**
     * Creates new form welcome_page
     */
    public distributor_landing() {
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

        main_panel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        register_button = new javax.swing.JButton();
        login_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_panel.setBackground(new java.awt.Color(255, 255, 255));
        main_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(0, 204, 204));
        title.setText("DISTRIBUTOR");
        main_panel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        register_button.setBackground(new java.awt.Color(0, 204, 204));
        register_button.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        register_button.setForeground(new java.awt.Color(255, 255, 255));
        register_button.setText("REGISTER");
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });
        main_panel.add(register_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        login_button.setBackground(new java.awt.Color(0, 204, 204));
        login_button.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        login_button.setForeground(new java.awt.Color(255, 255, 255));
        login_button.setText("LOGIN");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        main_panel.add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        back_button.setBackground(new java.awt.Color(0, 204, 204));
        back_button.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        back_button.setForeground(new java.awt.Color(255, 255, 255));
        back_button.setText("←");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        main_panel.add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        getContentPane().add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 510, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 800, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed
        distributor_register d = new distributor_register();
        dispose();
        d.setVisible(true);
    }//GEN-LAST:event_register_buttonActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        distributor_login d = new distributor_login();
        dispose();
        d.setVisible(true);
        
    }//GEN-LAST:event_login_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        welcome_page w = new welcome_page();
        dispose();
        w.setVisible(true);

    }//GEN-LAST:event_back_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login_button;
    private javax.swing.JPanel main_panel;
    private javax.swing.JButton register_button;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
