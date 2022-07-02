import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Cancel_Tickets extends javax.swing.JFrame {

    /**
     * Creates new form ticket_cancel
     */
    public Cancel_Tickets() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label14 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        Cancel_button = new javax.swing.JButton();
        combo_box = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tickets Cancel Page");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));
        //Todo:1
//        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway/booking/icon cancel.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cancel Tickets");
//        jLabel6.setForeground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(37, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel6))
                                        .addComponent(jLabel5))
                                .addGap(52, 52, 52))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        label14.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        label14.setForeground(new java.awt.Color(51, 51, 51));
        label14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label14.setText("CANCEL TICKETS");
        label14.setForeground(new java.awt.Color(0, 153, 0));



        label10.setBackground(new java.awt.Color(255, 255, 255));
        label10.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        label10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label10.setText("Ticket Number:");
        label10.setForeground(new java.awt.Color(0, 153, 0));


        Cancel_button.setBackground(new java.awt.Color(192, 57, 43));
        Cancel_button.setForeground(new java.awt.Color(255, 255, 255));
        Cancel_button.setText("CANCEL");
        Cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_buttonActionPerformed(evt);
            }
        });

        combo_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_boxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label14)
                                .addGap(18, 18, 18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(94, 94, 94)
                                                .addComponent(Cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                        .addComponent(combo_box))
                                .addGap(18, 18, 18)
                                .addComponent(Cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_buttonActionPerformed
        String tno;
        tno = (String) combo_box.getSelectedItem();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "");
            Statement st = con.createStatement();
            String a = "Delete from ticket where ticket_no=" + tno + ";";
            st.executeUpdate(a);
            JOptionPane.showMessageDialog(null, "Ticket with ticket number " + tno + " .Successfully Deleted");
            combo_box.removeAllItems();
            String b = ("update traintimings set seats=seats+1 where trainNo=" + tno + ";");
            st.executeUpdate(b);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR IN CONNECTIVITY");
        }
    }//GEN-LAST:event_Cancel_buttonActionPerformed





    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        combo_box.removeAllItems();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "");
            Statement st = con.createStatement();
            String a = "select ticket_no from ticket;";
            ResultSet rs = st.executeQuery(a);

            while (rs.next()) {

                combo_box.addItem(rs.getString("ticket_no"));
                combo_box.setSelectedItem(rs.getString("ticket_no"));
            }

            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR IN CONNECTIVITY");
        }
    }//GEN-LAST:event_formWindowActivated

    private void combo_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_boxActionPerformed


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
//            java.util.logging.Logger.getLogger(Cancel_Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Cancel_Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Cancel_Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Cancel_Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Cancel_Tickets().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_button;
    private javax.swing.JComboBox<String> combo_box;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label14;
    // End of variables declaration//GEN-END:variables
}