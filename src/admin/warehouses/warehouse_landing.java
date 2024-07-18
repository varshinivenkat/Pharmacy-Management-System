/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin.warehouses;
import admin.*;
import admin.warehouses.warehouse_view;
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
public class warehouse_landing extends javax.swing.JFrame {

    /**
     * Creates new form welcome_page
     */
    public warehouse_landing() {
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

        title = new javax.swing.JLabel();
        admin_button1 = new javax.swing.JButton();
        username_dis2 = new javax.swing.JTextField();
        main_panel = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        back_button = new javax.swing.JButton();
        search_button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        capacity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        view_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        clear_button = new javax.swing.JButton();
        insert_button = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_panel.setBackground(new java.awt.Color(255, 255, 255));

        title1.setFont(new java.awt.Font("Segoe UI Black", 1, 32)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 204, 204));
        title1.setText("WAREHOUSE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("City");

        city.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
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

        search_button.setBackground(new java.awt.Color(0, 204, 204));
        search_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        search_button.setForeground(new java.awt.Color(255, 255, 255));
        search_button.setText("SEARCH");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));

        id.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        capacity.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        capacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacityActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("Capacity");

        view_button.setBackground(new java.awt.Color(0, 204, 204));
        view_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        view_button.setForeground(new java.awt.Color(255, 255, 255));
        view_button.setText("VIEW WAREHOUSE DETAILS ");
        view_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_buttonActionPerformed(evt);
            }
        });

        delete_button.setBackground(new java.awt.Color(0, 204, 204));
        delete_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        delete_button.setForeground(new java.awt.Color(255, 255, 255));
        delete_button.setText("DELETE");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        update_button.setBackground(new java.awt.Color(0, 204, 204));
        update_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        update_button.setForeground(new java.awt.Color(255, 255, 255));
        update_button.setText("UPDATE");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        clear_button.setBackground(new java.awt.Color(0, 204, 204));
        clear_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clear_button.setForeground(new java.awt.Color(255, 255, 255));
        clear_button.setText("CLEAR");
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });

        insert_button.setBackground(new java.awt.Color(0, 204, 204));
        insert_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        insert_button.setForeground(new java.awt.Color(255, 255, 255));
        insert_button.setText("INSERT");
        insert_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_buttonActionPerformed(evt);
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
                        .addGap(204, 204, 204)
                        .addComponent(capacity, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addGap(101, 101, 101)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(city)
                            .addComponent(id))))
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(insert_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(update_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(view_button)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addComponent(search_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clear_button)))
                .addGap(24, 24, 24))
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
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(city, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_button)
                    .addComponent(search_button)
                    .addComponent(delete_button)
                    .addComponent(clear_button)
                    .addComponent(insert_button))
                .addGap(47, 47, 47)
                .addComponent(view_button, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 670, 450));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -16, 800, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void admin_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admin_button1ActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        admin_landing a = new admin_landing();
        dispose();
        a.setVisible(true);
        
    }//GEN-LAST:event_back_buttonActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
    // Get the values from the input fields
    String warehouseIdToSearch = id.getText();

    // Check if the warehouseIdToSearch is empty
    if (warehouseIdToSearch.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a warehouse ID to search.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if warehouseIdToSearch is empty
    }

    Connection connection = null;
    try {
        // Establish a connection to your database
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        // Create the SQL select command
        String sql = "SELECT * FROM warehouse WHERE warehouse_id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, warehouseIdToSearch);

        // Execute the select command
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            // Retrieve the values from the result set
            String w_city = resultSet.getString("city");
            int w_capacity = resultSet.getInt("capacity");

            // Display the retrieved values in your Swing UI (e.g., in text fields)
            city.setText(w_city);
            capacity.setText(String.valueOf(w_capacity));
        } else {
            JOptionPane.showMessageDialog(null, "No data found for the given warehouse ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error searching data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        if (connection != null) {
            try {
                connection.close(); // Close the connection
            } catch (SQLException closeException) {
                JOptionPane.showMessageDialog(null, "Error closing connection: " + closeException.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    }//GEN-LAST:event_search_buttonActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void capacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacityActionPerformed

    private void view_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_buttonActionPerformed
   // Get the warehouse_id to search from the text field
    String warehouseIdToSearch = id.getText().trim();

    // Check if the warehouseIdToSearch is empty
    if (warehouseIdToSearch.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a warehouse ID to search.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if warehouseIdToSearch is empty
    }

    // Create an instance of warehouse_view with the warehouse ID and display it
    warehouse_view warehouseView = new warehouse_view(warehouseIdToSearch);
    warehouseView.setVisible(true);
    }//GEN-LAST:event_view_buttonActionPerformed
   

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
      Connection connection = null;
    String warehouseIdToDelete = id.getText();
    
    try {
        // Establish a connection to your database
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
        connection.setAutoCommit(false);

        // Create the SQL delete command
        String sql = "DELETE FROM warehouse WHERE warehouse_id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, warehouseIdToDelete);

        // Execute the delete command
        int rowsDeleted = statement.executeUpdate();
        if (rowsDeleted > 0) {
            connection.commit(); // Commit the transaction
            JOptionPane.showMessageDialog(null, "Data deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No data found for deletion.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error deleting data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        if (connection != null) {
            try {
                connection.close(); // Close the connection
            } catch (SQLException closeException) {
                JOptionPane.showMessageDialog(null, "Error closing connection: " + closeException.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
     String warehouseIdToUpdate = id.getText();

    // Check if the warehouseIdToUpdate is empty
    if (warehouseIdToUpdate.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a warehouse ID to update.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if warehouseIdToUpdate is empty
    }

    Connection connection = null;
    try {
        // Establish a connection to your database
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

        // Disable auto-commit mode
        connection.setAutoCommit(false);

        // Check if a row with the given warehouse_id exists before update
        PreparedStatement checkStatement = connection.prepareStatement("SELECT * FROM warehouse WHERE warehouse_id = ?");
        checkStatement.setString(1, warehouseIdToUpdate);
        ResultSet resultSet = checkStatement.executeQuery();
        if (!resultSet.next()) {
            JOptionPane.showMessageDialog(null, "No data found for update.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if no matching row is found
        }

        // Create the SQL update command based on non-empty fields
        StringBuilder updateSql = new StringBuilder("UPDATE warehouse SET");
        boolean hasUpdates = false;

        String newCity = city.getText();
        if (!newCity.isEmpty()) {
            updateSql.append(" city = ?,");
            hasUpdates = true;
        }

        String newCapacityStr = capacity.getText();
        if (!newCapacityStr.isEmpty()) {
            try {
                int newCapacity = Integer.parseInt(newCapacityStr);
                updateSql.append(" capacity = ?,");
                hasUpdates = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Capacity must be a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit the method if capacity is not a valid integer
            }
        }

        // Remove the last comma if there are updates
        if (hasUpdates) {
            updateSql.deleteCharAt(updateSql.length() - 1); // Remove the last comma
            updateSql.append(" WHERE warehouse_id = ?");
        } else {
            JOptionPane.showMessageDialog(null, "No fields to update.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if there are no fields to update
        }

        // Prepare the update statement
        PreparedStatement updateStatement = connection.prepareStatement(updateSql.toString());

        // Set parameter values for the update statement
        int parameterIndex = 1;
        if (!newCity.isEmpty()) {
            updateStatement.setString(parameterIndex++, newCity);
        }
        if (!newCapacityStr.isEmpty()) {
            updateStatement.setInt(parameterIndex++, Integer.parseInt(newCapacityStr));
        }

        updateStatement.setString(parameterIndex, warehouseIdToUpdate); // Set the warehouse_id for WHERE clause

        // Execute the update command
        int rowsUpdated = updateStatement.executeUpdate();
        if (rowsUpdated > 0) {
            connection.commit(); // Commit the transaction
            JOptionPane.showMessageDialog(null, "Data updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No data found for update.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error updating data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        if (connection != null) {
            try {
                connection.close(); // Close the connection
            } catch (SQLException closeException) {
                JOptionPane.showMessageDialog(null, "Error closing connection: " + closeException.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
}
    }//GEN-LAST:event_update_buttonActionPerformed

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        id.setText("");
        city.setText("");
        capacity.setText("");
    }//GEN-LAST:event_clear_buttonActionPerformed

    private void insert_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_buttonActionPerformed
        // TODO add your handling code here:
        // Get the data from the text fields
    String warehouseId = id.getText();
    String warehouseCity = city.getText();
    int warehouseCapacity;

    try {
        warehouseCapacity = Integer.parseInt(capacity.getText()); // Convert capacity to integer
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid capacity value. Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Connection connection = null;
    try {
        // Establish a connection to your database
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
        connection.setAutoCommit(false);

        // Create the SQL insert command
        String sql = "INSERT INTO warehouse (warehouse_id, city, capacity) VALUES (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, warehouseId);
        statement.setString(2, warehouseCity);
        statement.setInt(3, warehouseCapacity);

        // Execute the insert command
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            connection.commit(); // Commit the transaction
            JOptionPane.showMessageDialog(null, "Data inserted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error inserting data: No rows affected.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLIntegrityConstraintViolationException e) {
        JOptionPane.showMessageDialog(null, "Error inserting data: Constraint violation.", "Error", JOptionPane.ERROR_MESSAGE);
        if (connection != null) {
            try {
                connection.rollback(); // Rollback the transaction on error
            } catch (SQLException rollbackException) {
                JOptionPane.showMessageDialog(null, "Error rolling back transaction: " + rollbackException.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error inserting data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        if (connection != null) {
            try {
                connection.rollback(); // Rollback the transaction on error
            } catch (SQLException rollbackException) {
                JOptionPane.showMessageDialog(null, "Error rolling back transaction: " + rollbackException.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } finally {
        if (connection != null) {
            try {
                connection.close(); // Close the connection
            } catch (SQLException closeException) {
                JOptionPane.showMessageDialog(null, "Error closing connection: " + closeException.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    }//GEN-LAST:event_insert_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin_button1;
    private javax.swing.JButton back_button;
    private javax.swing.JTextField capacity;
    private javax.swing.JTextField city;
    private javax.swing.JButton clear_button;
    private javax.swing.JButton delete_button;
    private javax.swing.JTextField id;
    private javax.swing.JButton insert_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel main_panel;
    private javax.swing.JButton search_button;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JButton update_button;
    private javax.swing.JTextField username_dis2;
    private javax.swing.JButton view_button;
    // End of variables declaration//GEN-END:variables
}
