package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class SearchRoom extends JFrame {
    SearchRoom(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(90,156,163));
        panel.setLayout(null);
        add(panel);

        JLabel label1 = new JLabel(("Search For Room"));
        label1.setBounds(360,11,186,31);
        label1.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(label1);

        JLabel label2 = new JLabel(("Status"));
        label2.setBounds(50,73,120,20);
        label2.setFont(new Font("Tahoma",Font.BOLD,16));
        panel.add(label2);

        Choice choice = new Choice();
        choice.setBounds(170, 74, 120, 20);
        choice.add("Available");
        choice.add("Occupied");
        panel.add(choice);

        JTable table = new JTable();
        table.setBounds(0,187,700,210);
        table.setBackground(new Color(90,156,163));
        table.setForeground(Color.white);
        table.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(table);

        try{
            conn c = new conn();
            String q = "select * from room";
            ResultSet resultSet= c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch(Exception e){
            e.printStackTrace();
        }

        JLabel Roomno = new JLabel(("Room Number"));
        Roomno.setBounds(10,162,150,20);
        Roomno.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Roomno);

        JLabel available = new JLabel(("Availability"));
        available.setBounds(175,162,150,20);
        available.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(available);

        JLabel price = new JLabel(("Price"));
        price.setBounds(350,162,150,20);
        price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(price);

        JLabel Bed = new JLabel(("Bed Type"));
        Bed.setBounds(525,162,150,20);
        Bed.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Bed);

        JButton search = new JButton("Search");
        search.setBounds(200, 420, 120, 20);
        search.setBackground(Color.BLACK);
        search.setForeground(Color.white);
        panel.add(search);
        search.addActionListener(new ActionListener() {
                                     @Override
                                     public void actionPerformed(ActionEvent e) {
                                         String q = "select * from room where Availability='" + choice.getSelectedItem() + "'";
                                         try {
                                             conn c = new conn();
                                             ResultSet resultSet = c.statement.executeQuery(q);
                                             table.setModel(DbUtils.resultSetToTableModel(resultSet));
                                         } catch (Exception E) {
                                             E.printStackTrace();
                                         }
                                     }
                                 });


                JButton back = new JButton("Back");
                back.setBounds(380, 420, 120, 20);
                back.setBackground(Color.BLACK);
                back.setForeground(Color.white);
                panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

                setUndecorated(true);
                setSize(900, 600);
                setLayout(null);
                setLocation(200, 50);
                setVisible(true);
            }

            public static void main(String[] args) {
                new SearchRoom();
            }
        }
