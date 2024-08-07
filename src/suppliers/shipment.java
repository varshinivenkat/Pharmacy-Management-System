/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package suppliers;
import admin.admin_landing;
import login_register.*;
import login_register.distributor_landing;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;
/**
 *
 * @author varsh
 */
public class shipment extends javax.swing.JFrame {

    /**
     * Creates new form welcome_page
     */
    public shipment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        title = new javax.swing.JLabel();
        admin_button1 = new javax.swing.JButton();
        username_dis2 = new javax.swing.JTextField();
        ship_id = new javax.swing.JTextField();
        main_panel = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ship_date = new javax.swing.JTextField();
        back_button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Del_date = new javax.swing.JTextField();
        war_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        insert_button = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        title.setFont(new java.awt.Font("Segoe UI Black", 1, 32)); // NOI18N
        title.setForeground(new java.awt.Color(0, 204, 204));
        title.setText("PHARMACY SUPPLY CHAIN");

        admin_button1.setBackground(new java.awt.Color(0, 204, 204));
        admin_button1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        admin_button1.setForeground(new java.awt.Color(255, 255, 255));
        admin_button1.setText("ADMIN");
        admin_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_button1ActionPerformed(evt);
            }
        });

        username_dis2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        ship_id.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ship_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ship_idActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_panel.setBackground(new java.awt.Color(255, 255, 255));

        title1.setFont(new java.awt.Font("Segoe UI Black", 1, 32)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 204, 204));
        title1.setText("SHIPMENTS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Shipment Date");

        ship_date.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ship_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ship_dateActionPerformed(evt);
            }
        });

        back_button.setBackground(new java.awt.Color(0, 204, 204));
        back_button.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        back_button.setForeground(new java.awt.Color(255, 255, 255));
        back_button.setText("←");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Warehouse Id");

        Del_date.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Del_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Del_dateActionPerformed(evt);
            }
        });

        war_id.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        war_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                war_idActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("Delivery Date");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("Status");

        insert_button.setBackground(new java.awt.Color(0, 204, 204));
        insert_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        insert_button.setForeground(new java.awt.Color(255, 255, 255));
        insert_button.setText("INSERT");
        insert_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_buttonActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 204, 204));
        jRadioButton1.setText("SHIPPED");

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 204, 204));
        jRadioButton2.setText("DELIVERED");

        id.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title1)
                .addGap(24, 24, 24))
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addGap(61, 61, 61)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ship_date)
                            .addComponent(id)))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(74, 74, 74)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Del_date, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                            .addComponent(war_id)
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(insert_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(67, 67, 67))
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title1)
                    .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(ship_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Del_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(war_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jRadioButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(insert_button)
                .addGap(27, 27, 27))
        );

        getContentPane().add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 670, 450));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -16, 800, 480));

        pack();
    }// </editor-fold>                        

    private void ship_dateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                        

    private void admin_button1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                            

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        supplier_dashboard a = new supplier_dashboard();
        dispose();
        a.setVisible(true);
       
    }                                          

    private void ship_idActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                      

    private void Del_dateActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                        

    private void war_idActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                      

    private void insert_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                              
    // Get the values from the input fields
    String shipid = "sh012";
    String shipdate = ship_date.getText();
    String deldate = Del_date.getText();
    String status = jRadioButton1.isSelected() ? "SHIPPED" : (jRadioButton2.isSelected() ? "DELIVERED" : "");
    String warid = war_id.getText();

    // Validate input
    if (shipid.isEmpty() || shipdate.isEmpty() || deldate.isEmpty() || status.isEmpty() || warid.isEmpty()) {
        System.out.println("Debug: shipid: " + shipid + ", shipdate: " + shipdate + ", deldate: " + deldate + ", status: " + status + ", warid: " + warid);
        JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit method if any field is empty
    }

    // Connect to the database
    try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger")) {
        // Construct the SQL INSERT statement for shipment table
        String shipmentSQL = "INSERT INTO shipment(shipment_id, ship_date, del_date, status, warehouse_id) VALUES (?, TO_DATE(?,'YYYY-MM-DD'), TO_DATE(?,'YYYY-MM-DD'), ?, ?)";

        try (PreparedStatement shipmentStatement = connection.prepareStatement(shipmentSQL)) {
            // Set the values to be inserted into shipment table
            shipmentStatement.setString(1, shipid);
            shipmentStatement.setString(2, shipdate);
            shipmentStatement.setString(3, deldate);
            shipmentStatement.setString(4, status);
            shipmentStatement.setString(5, warid);

            // Execute the SQL statement for shipment table
            int rowsInsertedShipment = shipmentStatement.executeUpdate();

            if (rowsInsertedShipment > 0) {
                JOptionPane.showMessageDialog(this, "Shipment inserted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                SessionManager.setWarehouseid(warid);
                // Clear the input fields
                ship_id.setText("");
                ship_date.setText("");
                Del_date.setText("");
                war_id.setText("");

                // Optionally, set session data or navigate to the next screen
                SessionManager.setshipid(shipid);
                shipment_details sd = new shipment_details();
                sd.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Failed to insert shipment.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // Print the stack trace for debugging
    }

    }
                            

    private void idActionPerformed(java.awt.event.ActionEvent evt) {                                  
        // TODO add your handling code here:
    }                                  
    
    // Variables declaration - do not modify                    
    private javax.swing.JTextField Del_date;
    private javax.swing.JButton admin_button1;
    private javax.swing.JButton back_button;
    private javax.swing.JTextField id;
    private javax.swing.JButton insert_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JPanel main_panel;
    private javax.swing.JTextField ship_date;
    private javax.swing.JTextField ship_id;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JTextField username_dis2;
    private javax.swing.JTextField war_id;
    // End of variables declaration                  
}

