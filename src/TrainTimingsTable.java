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


    TrainTimingsTable(String sf, String st, String sd) {


        f = new JFrame("Database Results");

        f.setBounds(550, 140, 610, 380);
        f.setResizable(false);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);//Setting the visibility of second Frame
        f.validate();
        //Setting the properties of JTable and DefaultTableModel
        defaultTableModel = new DefaultTableModel();
        table = new JTable(defaultTableModel);
        table.setPreferredScrollableViewportSize(new Dimension(300, 100));
        table.setFillsViewportHeight(true);
        f.add(new JScrollPane(table));
        defaultTableModel.addColumn("From Station");
        defaultTableModel.addColumn("To Station");
        defaultTableModel.addColumn("Date");


        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "");//Crating connection with database
            statement = connection.createStatement();//crating statement object
            String query = "select * from traintimings ;";//Storing MySQL query in A string variable
            ResultSet rs = statement.executeQuery(query);//executing query and storing result in ResultSet

//where (StationFrom=SFrom AND StationTo=STo AND StationDate=SDate)
            while (rs.next()) {

                //Retrieving details from the database and storing it in the String variables
//                String rank = rs.getString("id");
                String SFrom = rs.getString("StationFrom");
                String STo = rs.getString("StationTo");
                String SDate=rs.getString("StationDate");
//                if(sf==SFrom || st==STo || sd==SDate){
                    defaultTableModel.addRow(new Object[]{SFrom, STo,SDate});//Adding row in Table
                break;
//                }



            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


}