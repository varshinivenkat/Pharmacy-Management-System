/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package distributor;
/**
 *
 * @author Sweety
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class place_orders extends javax.swing.JFrame {

    /**
     * Creates new form Place_Orders
     */
    public place_orders() {
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

        jLabel1 = new javax.swing.JLabel();
        main_panel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        place = new javax.swing.JButton();
        back_button1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        m_id = new javax.swing.JTextField();
        qty = new javax.swing.JTextField();
        o_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.jpg"))); // NOI18N

        main_panel1.setBackground(new java.awt.Color(255, 255, 255));
        main_panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI Black", 1, 32)); // NOI18N
        title.setForeground(new java.awt.Color(0, 204, 204));
        title.setText("ORDERS");
        main_panel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 140, 60));

        place.setBackground(new java.awt.Color(0, 204, 204));
        place.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        place.setForeground(new java.awt.Color(255, 255, 255));
        place.setText("PLACE ORDER");
        place.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeActionPerformed(evt);
            }
        });
        main_panel1.add(place, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 250, 40));

        back_button1.setBackground(new java.awt.Color(0, 204, 204));
        back_button1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        back_button1.setForeground(new java.awt.Color(255, 255, 255));
        back_button1.setText("←");
        back_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_button1ActionPerformed(evt);
            }
        });
        main_panel1.add(back_button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Order Id:");
        main_panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 160, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Medicine Id:");
        main_panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 160, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Quantity:");
        main_panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 150, 40));
        main_panel1.add(m_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 140, 30));
        main_panel1.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 140, 30));

        o_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_idActionPerformed(evt);
            }
        });
        main_panel1.add(o_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(main_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(main_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

   private void placeActionPerformed(java.awt.event.ActionEvent evt) {                                                                                  
    String orderId = o_id.getText();
    String medicineId = m_id.getText();
    int quantity = Integer.parseInt(qty.getText());

    // Database connection variables
    String url = "jdbc:oracle:thin:@localhost:1521:orcl"; // Change this URL to match your DB settings
    String user = "scott";
    String password = "tiger";

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        // Establish the database connection
        conn = DriverManager.getConnection(url, user, password);
        conn.setAutoCommit(false); // Start a transaction

        // Check if the order_id already exists in Orders table
        String checkOrderQuery = "SELECT COUNT(*) AS count FROM Orders WHERE order_id = ?";
        pstmt = conn.prepareStatement(checkOrderQuery);
        pstmt.setString(1, orderId);
        rs = pstmt.executeQuery();

        int orderCount = 0;
        if (rs.next()) {
            orderCount = rs.getInt("count");
        }

        if (orderCount == 0) {
            // If order_id does not exist, insert into Orders table
            String insertOrderQuery = "INSERT INTO Orders (order_id, distributor_id, order_date) VALUES (?, ?, SYSDATE)";
            pstmt = conn.prepareStatement(insertOrderQuery);
            pstmt.setString(1, orderId);
            pstmt.setString(2, SessionManager.getDisid()); // Replace with the actual distributor ID

            int rowsInsertedOrders = pstmt.executeUpdate();

            if (rowsInsertedOrders > 0) {
                // Check if there's enough quantity in warehouse_details
                String checkQuantityQuery = "SELECT wd.quantity " +
                                            "FROM warehouse_details wd " +
                                            "JOIN warehouse w ON wd.warehouse_id = w.warehouse_id " +
                                            "JOIN distributors d ON w.city = d.region " +
                                            "WHERE wd.medicine_id = ? " +
                                            "AND d.distributor_id = ?";
                pstmt = conn.prepareStatement(checkQuantityQuery);
                pstmt.setString(1, medicineId);
                pstmt.setString(2, SessionManager.getDisid()); // Replace with the actual distributor ID
                rs = pstmt.executeQuery();

                int availableQuantity = 0;
                if (rs.next()) {
                    availableQuantity = rs.getInt("quantity");
                }

                if (availableQuantity >= quantity) {
                    // Proceed to insert into Order_details table
                    String insertOrderDetailsQuery = "INSERT INTO Order_details (order_id, medicine_id, quantity) VALUES (?, ?, ?)";
                    pstmt = conn.prepareStatement(insertOrderDetailsQuery);
                    pstmt.setString(1, orderId);
                    pstmt.setString(2, medicineId);
                    pstmt.setInt(3, quantity);

                    int rowsInsertedOrderDetails = pstmt.executeUpdate();

                    if (rowsInsertedOrderDetails > 0) {
                        // Reduce the quantity in warehouse_details
                        String updateWarehouseQuery = "UPDATE warehouse_details SET quantity = quantity - ? " +
                                                      "WHERE warehouse_id IN (SELECT w.warehouse_id FROM warehouse w " +
                                                                              "JOIN distributors d ON w.city = d.region " +
                                                                              "WHERE d.distributor_id = ?) " +
                                                      "AND medicine_id = ?";
                        pstmt = conn.prepareStatement(updateWarehouseQuery);
                        pstmt.setInt(1, quantity);
                        pstmt.setString(2, SessionManager.getDisid()); // Replace with the actual distributor ID
                        pstmt.setString(3, medicineId);

                        int rowsUpdated = pstmt.executeUpdate();

                        if (rowsUpdated > 0) {
                            JOptionPane.showMessageDialog(this, "Order placed successfully!");
                        } else {
                            JOptionPane.showMessageDialog(this, "Failed to update warehouse quantity.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to insert order details.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Not enough quantity available. Available quantity: " + availableQuantity);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Failed to place the order.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Order ID already exists: " + orderId);
        }

        conn.commit(); // Commit the transaction
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        try {
            if (conn != null) {
                conn.rollback(); // Rollback the transaction if there's an error
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Print stack trace for debugging
        }
    } finally {
        // Close resources
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Print the sta
        }
    }
    }


                                     

    private void back_button1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        distributor_dashboard w = new distributor_dashboard();
        dispose();
        w.setVisible(true);
    }                                            

    private void o_idActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                    

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Place_Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Place_Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Place_Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Place_Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Place_Orders().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify                    
    private javax.swing.JButton back_button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField m_id;
    private javax.swing.JPanel main_panel1;
    private javax.swing.JTextField o_id;
    private javax.swing.JButton place;
    private javax.swing.JTextField qty;
    private javax.swing.JLabel title;
    // End of variables declaration                  
}
