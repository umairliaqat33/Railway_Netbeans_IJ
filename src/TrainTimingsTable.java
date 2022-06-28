import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;


public class TrainTimingsTable {
    JFrame f;


    //creating object of second JFrame
    DefaultTableModel defaultTableModel;//creating object of DefaultTableModel
    JTable table;//Creating object of JTable
    Connection connection;//Creating object of Connection class
    Statement statement;//Creating object of Statement class


    TrainTimingsTable(String sf, String st) {


        f = new JFrame("Database Results");

        f.setBounds(550, 140, 810, 380);
        f.setResizable(false);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);//Setting the visibility of second Frame
        f.validate();
        //Setting the properties of JTable and DefaultTableModel
        defaultTableModel = new DefaultTableModel();
        table = new JTable(defaultTableModel);
        table.setPreferredScrollableViewportSize(new Dimension(800, 100));
        table.setFillsViewportHeight(true);
        f.add(new JScrollPane(table));
        defaultTableModel.addColumn("From Station");
        defaultTableModel.addColumn("To Station");
        defaultTableModel.addColumn("Date");
        defaultTableModel.addColumn("Train No");
        defaultTableModel.addColumn("Train Name");
        defaultTableModel.addColumn("Rent");
        defaultTableModel.addColumn("Seats");
        defaultTableModel.addColumn("Arrival Time");
        defaultTableModel.addColumn("Departure Time");

        String from1 = sf;
        String to1 = st;

        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        int row = dm.getRowCount();
        if (row > 0) {
            for (int i = 0; i < row; i++) {
                dm.removeRow(0);
            }
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "");
            Statement sta = con.createStatement();
            String a = "select * from traintimings where StationFrom='" + from1 + "'and StationTo='" + to1 + "';";
            ResultSet rs = sta.executeQuery(a);
            while (rs.next()) {
                String stationFrom = rs.getString(1);
                String stationTo = rs.getString(2);
                String stationDate = rs.getString(3);
                int trainNo = rs.getInt(4);
                String trainName = rs.getString(5);
                int rent = rs.getInt(6);
                int seats = rs.getInt(7);
                String arrivalTime = rs.getString(8);
                String departureTime = rs.getString(9);
                dm.addRow(new Object[]{stationFrom, stationTo, stationDate, trainNo, trainName, rent, seats, arrivalTime, departureTime});

            }
            rs.close();


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }


}