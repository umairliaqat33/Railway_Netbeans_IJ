import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class seats3DWay{

    public seats3DWay(){}

    private void initialComponents() {
        sFrame=new JFrame("Book Seats 3D Way");
        sFrame.setLayout(new GridLayout(1,2));
        sFrame.setVisible(true);
        sFrame.setBounds(300,100,600,400);
        jPanel4 = new  JPanel();
        jLabel5 = new  JLabel();
        jLabel6 = new  JLabel();
        seatsPanel = new  JPanel();
        seatsPanel=new JPanel();
        seats=new JButton[32];
        seatsPanel.setLayout(new GridLayout(8,4,10,10));
        for(int i=0;i<32;i++){
            seats[i]=new JButton(""+i);
            seats[i].setBounds(100,100,100,100);
            seats[i].addActionListener(new seatsAction(i));
            seatsPanel.add(seats[i]);
        }

        sFrame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        sFrame.setTitle("Tickets Cancel Page");
        sFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));
//        jPanel4.setLayout(new GridLayout(1,2));
        ImageIcon imageIcon=new ImageIcon( new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Railway_Netbeans_IJ\\src\\images\\img_1.png").getImage().getScaledInstance(180,180,Image.SCALE_DEFAULT));
        jLabel5.setIcon(imageIcon); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Book Seats 3D Way");
        jPanel4.add(jLabel5);
        jPanel4.add(jLabel6);

        seatsPanel.setBackground(new java.awt.Color(255, 255, 255));

        sFrame.add(jPanel4);
        sFrame.add(seatsPanel);




    }// </editor-fold>//GEN-END:initComponents



    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "");
            Statement st = con.createStatement();
//            String a = "select ticket_no from ticket;";
//            ResultSet rs = st.executeQuery(a);
//
//            while (rs.next()) {
//
//
//            }

//            rs.close();

        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "ERROR IN CONNECTIVITY");
        }
    }//GEN-LAST:event_formWindowActivated


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
//        try {
//            for ( UIManager.LookAndFeelInfo info :  UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                     UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(seats3DWay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(seats3DWay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(seats3DWay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch ( UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(seats3DWay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seats3DWay().initialComponents();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private  JLabel jLabel5;
    JFrame sFrame;
    private  JLabel jLabel6;
    private  JPanel seatsPanel;
    private  JPanel jPanel4;
    JButton[] seats;

    public class seatsAction implements ActionListener{
        int index;
        public seatsAction(int i){
            index=i;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            seats[index].setEnabled(false);
        }
    }
    // End of variables declaration//GEN-END:variables
}
