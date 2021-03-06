/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

/**
 * @author umair
 */
public class Ticket_Book extends javax.swing.JFrame {

    /**
     * Creates new form ticket_book
     */
    public Ticket_Book() {
        initComponents();
    }

    public Ticket_Book(int n) {
        index = n;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label14 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        Book_button = new javax.swing.JButton();
        txtphone = new javax.swing.JTextField();
        cb_gender = new javax.swing.JComboBox<>();
        label11 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        combo_box = new javax.swing.JComboBox<>();
        txtage = new javax.swing.JTextField();
        label12 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        txtcharge = new javax.swing.JTextField();
        label16 = new javax.swing.JLabel();
        txtto = new javax.swing.JTextField();
        label17 = new javax.swing.JLabel();
        txtfrom = new javax.swing.JTextField();
        label18 = new javax.swing.JLabel();
        txtseats = new javax.swing.JTextField();
        Search_button = new javax.swing.JButton();
        label19 = new javax.swing.JLabel();
        txttname = new javax.swing.JTextField();
        label20 = new javax.swing.JLabel();
        txtrent = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ticket Booking Page");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));


        jLabel5.setIcon(new ImageIcon("C:\\Users\\umair\\OneDrive\\Documents\\Semester 4\\Java\\Railway_Netbeans_IJ\\src\\images\\railway2.jpg")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Book Tickets");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap(47, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(65, 65, 65))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addGap(42, 42, 42))))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });

        label14.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        label14.setForeground(new java.awt.Color(51, 51, 51));
        label14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label14.setText("BOOK TICKETS");
        label14.setForeground(new java.awt.Color(0, 153, 0));

        label10.setBackground(new java.awt.Color(255, 255, 255));
        label10.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        label10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label10.setText("Phone Number: ");
        label10.setForeground(new java.awt.Color(0, 153, 0));

        Book_button.setBackground(new java.awt.Color(255, 255, 255));
        Book_button.setText("BOOK");
        Book_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_buttonActionPerformed(evt);
            }
        });

        cb_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"MALE", "FEMALE"}));

        label11.setBackground(new java.awt.Color(255, 255, 255));
        label11.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        label11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label11.setText("Name:");
        label11.setForeground(new java.awt.Color(0, 153, 0));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        combo_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_boxActionPerformed(evt);
            }
        });

        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });

        label12.setBackground(new java.awt.Color(255, 255, 255));
        label12.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        label12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label12.setText("Age:");
        label12.setForeground(new java.awt.Color(0, 153, 0));


        label5.setBackground(new java.awt.Color(255, 255, 255));
        label5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label5.setText("Select Train No:");
        label5.setForeground(new java.awt.Color(0, 153, 0));

        label6.setBackground(new java.awt.Color(255, 255, 255));
        label6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label6.setText("Date:");
        label6.setForeground(new java.awt.Color(0, 153, 0));

        label9.setBackground(new java.awt.Color(255, 255, 255));
        label9.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        label9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label9.setText("Total Charges");
        label9.setForeground(new java.awt.Color(0, 153, 0));

        txtcharge.setEditable(false);
        txtcharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtchargeActionPerformed(evt);
            }
        });

        label16.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        label16.setForeground(new java.awt.Color(51, 51, 51));
        label16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label16.setText("From:");
        label16.setForeground(new java.awt.Color(0, 153, 0));

        txtto.setEditable(false);
        txtto.setForeground(new java.awt.Color(102, 102, 102));
        txtto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label17.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        label17.setForeground(new java.awt.Color(51, 51, 51));
        label17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label17.setText("To:");
        label17.setForeground(new java.awt.Color(0, 153, 0));

        txtfrom.setEditable(false);
        txtfrom.setForeground(new java.awt.Color(102, 102, 102));
        txtfrom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label18.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        label18.setForeground(new java.awt.Color(51, 51, 51));
        label18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label18.setText("Seats Available:");
        label18.setForeground(new java.awt.Color(0, 153, 0));

        txtseats.setEditable(false);
        txtseats.setForeground(new java.awt.Color(102, 102, 102));
        txtseats.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Search_button.setText("SEARCH");
        Search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_buttonActionPerformed(evt);
            }
        });

        label19.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        label19.setForeground(new java.awt.Color(51, 51, 51));
        label19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label19.setText("Train Name:");
        label19.setForeground(new java.awt.Color(0, 153, 0));

        txttname.setEditable(false);
        txttname.setForeground(new java.awt.Color(102, 102, 102));
        txttname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label20.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        label20.setForeground(new java.awt.Color(51, 51, 51));
        label20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label20.setText("Rent:");
        label20.setForeground(new java.awt.Color(0, 153, 0));

        txtrent.setEditable(false);
        txtrent.setForeground(new java.awt.Color(102, 102, 102));
        txtrent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 12, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(label14)
                                                                .addGap(18, 18, 18)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(label5)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(label20)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addGap(23, 23, 23)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addComponent(label16)
                                                                                                .addComponent(label19)))
                                                                                .addComponent(label18)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txtrent, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(txtseats, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(label17)))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(txttname))))
                                                .addGap(14, 14, 14))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(label9)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(label10)
                                                                .addComponent(label11, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(label12, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(label6, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(txtcharge, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Book_button, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(txtphone)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(cb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label5)
                                        .addComponent(combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txttname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtseats, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtrent, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label11)
                                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label9)
                                        .addComponent(txtcharge, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Book_button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
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


    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void Book_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_buttonActionPerformed
        try {
            String name, age, gender, charge, train_no, date, phoneno;
            name = txtname.getText();
            age = txtage.getText();
            phoneno = txtphone.getText();
            gender = (String) cb_gender.getSelectedItem();
            train_no = (String) combo_box.getSelectedItem();
            date = txtdate.getText();
            charge = txtrent.getText();
            txtcharge.setText("" + charge);

            Random random = new Random();
            int ticket_no;
            ticket_no = 1 + random.nextInt(31);

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "");
            Statement st = con.createStatement();
            String a = ("insert into ticket values('" + ticket_no + "','" + train_no + "','" + name + "','" + Integer.parseInt(phoneno) + "','" + age + "','" + date + "','" + gender + "','" + charge + "');");
            st.executeUpdate(a);
            combo_box.removeAllItems();
            JOptionPane.showMessageDialog(null, " Hello, " + name + "\n Your Ticket has been booked.\n Ticket Number: " + ticket_no);
            String b = ("update traintimings set seats=seats-1 where trainNo=" + train_no + ";");
            st.executeUpdate(b);
            txtname.setText("");
            txtage.setText("");
            txtcharge.setText("");
            txtdate.setText("");
            txtphone.setText("");
            txttname.setText("");
            txtfrom.setText("");
            txtto.setText("");
            txtseats.setText("");
            txtrent.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_Book_buttonActionPerformed

    public void bookSeatButton1() {
        Book_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_buttonActionPerformed1(evt);
            }
        });

    }

    private void Book_buttonActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_buttonActionPerformed
        try {
            String name, age, gender, charge, train_no, date, phoneno;
            name = txtname.getText();
            age = txtage.getText();
            phoneno = txtphone.getText();
            gender = (String) cb_gender.getSelectedItem();
            train_no = (String) combo_box.getSelectedItem();
            date = txtdate.getText();
            charge = txtrent.getText();
            txtcharge.setText("" + charge);

            int ticket_no;
            ticket_no = index;
//            ticket_no=ticket_no*index;

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "");
            Statement st = con.createStatement();
            String a = ("insert into ticket values('" + ticket_no + "','" + train_no + "','" + name + "','" + Integer.parseInt(phoneno) + "','" + age + "','" + date + "','" + gender + "','" + charge + "');");
            st.executeUpdate(a);
            combo_box.removeAllItems();
            JOptionPane.showMessageDialog(null, " Hello, " + name + "\n Your Ticket has been booked.\n Ticket Number: " + ticket_no);
            String b = ("update traintimings set seats=seats-1 where trainNo=" + train_no + ";");
            st.executeUpdate(b);
            txtname.setText("");
            txtage.setText("");
            txtcharge.setText("");
            txtdate.setText("");
            txtphone.setText("");
            txttname.setText("");
            txtfrom.setText("");
            txtto.setText("");
            txtseats.setText("");
            txtrent.setText("");
            dispose();
            seats3DWay seats3DWay = new seats3DWay();
            seats3DWay.initialComponents();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_Book_buttonActionPerformed

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained

    }//GEN-LAST:event_jPanel1FocusGained

    private void txtchargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtchargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtchargeActionPerformed

    private void combo_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_boxActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "");
            Statement st = con.createStatement();
            String a = "select trainNo from traintimings;";
            ResultSet rs = st.executeQuery(a);

            while (rs.next()) {

                combo_box.addItem(rs.getString("trainNo"));
                combo_box.setSelectedItem(rs.getString("trainNo"));
            }

            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR IN CONNECTIVITY");
        }
    }//GEN-LAST:event_formWindowActivated

    private void Search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_buttonActionPerformed
        String tno = (String) combo_box.getSelectedItem();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "");
            Statement st = con.createStatement();
            String a = "select trainName,StationFrom,StationTo,seats,rent from traintimings where trainNo='" + tno + "';";
            ResultSet rs = st.executeQuery(a);
            rs.next();
            String tname = rs.getString(1);
            String from = rs.getString(2);
            String to = rs.getString(3);
            String seats = rs.getString(4);
            String rent = rs.getString(5);

            txttname.setText(tname);
            txtfrom.setText(from);
            txtto.setText(to);
            txtrent.setText(rent);
            txtseats.setText(seats);
            txtcharge.setText(rent);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_Search_buttonActionPerformed

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
//            java.util.logging.Logger.getLogger(Ticket_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Ticket_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Ticket_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Ticket_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Ticket_Book().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Book_button;
    private javax.swing.JButton Search_button;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_gender;
    private javax.swing.JComboBox<String> combo_box;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label16;
    private javax.swing.JLabel label17;
    private javax.swing.JLabel label18;
    private javax.swing.JLabel label19;
    private javax.swing.JLabel label20;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label9;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcharge;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtfrom;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtrent;
    private javax.swing.JTextField txtseats;
    private javax.swing.JTextField txttname;
    private javax.swing.JTextField txtto;
    int index;
    // End of variables declaration//GEN-END:variables
}
