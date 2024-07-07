package hospital.management.system;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {

    Reception() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5, 160, 1525, 670);
        panel.setBackground(new Color(192,192,192));  // RGB values for dark grey
        add(panel);



        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5, 5, 1525, 150);
        panel1.setBackground(new Color(64, 64, 64));  // RGB values for light grey
        add(panel1);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/dr.png"));
        Image image = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setBounds(1300, 0, 250, 250);
        panel1.add(label);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/micon1.png"));
        Image image1 = i11.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i22 = new ImageIcon(image1);
        JLabel label1 = new JLabel(i22);
        label1.setBounds(1000, 20, 300, 100);
        panel1.add(label1);

        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icon/OIP4.png"));
        Image image2 = i3.getImage().getScaledInstance(1300, 797, Image.SCALE_SMOOTH); // Use SCALE_SMOOTH for better quality
        ImageIcon i33 = new ImageIcon(image2);
        JLabel label2 = new JLabel(i33);
        label2.setBounds(-120, 10, 1525, 670);  // Set bounds for label2
        panel.add(label2);




        JButton btn1 = new JButton("Add new patient");
        btn1.setBounds(30, 15, 200, 30);
        btn1.setBackground(new Color(246, 215, 118));
        btn1.setBorder(new LineBorder(Color.BLACK,5));
        panel1.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new NEW_PATIENT();
            }
        });

        JButton btn2 = new JButton("Room");
        btn2.setBounds(30, 58, 200, 30);
        btn2.setBackground(new Color(246, 215, 118));
        btn2.setBorder(new LineBorder(Color.BLACK,5));
        panel1.add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Room();
            }
        });

        JButton btn3 = new JButton("Department");
        btn3.setBounds(30, 100, 200, 30);
        btn3.setBackground(new Color(246, 215, 118));
        btn3.setBorder(new LineBorder(Color.BLACK,5));
        panel1.add(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Department();
            }
        });

        JButton btn4 = new JButton("All Employee Info");
        btn4.setBounds(270, 15, 200, 30);
        btn4.setBackground(new Color(246, 215, 118));
        btn4.setBorder(new LineBorder(Color.BLACK,5));
        panel1.add(btn4);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Employee_info();
            }
        });

        JButton btn5 = new JButton("Patient Info");
        btn5.setBounds(270, 58, 200, 30);
        btn5.setBackground(new Color(246, 215, 118));
        btn5.setBorder(new LineBorder(Color.BLACK,5));
        panel1.add(btn5);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ALL_Patient_Info();
            }
        });

        JButton btn6 = new JButton("Patient Discharge");
        btn6.setBounds(270, 100, 200, 30);
        btn6.setBackground(new Color(246, 215, 118));
        btn6.setBorder(new LineBorder(Color.BLACK,5));
        panel1.add(btn6);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new patient_discharge();
            }
        });

        JButton btn7 = new JButton("Update Patient Details");
        btn7.setBounds(510, 15, 200, 30);
        btn7.setBackground(new Color(246, 215, 118));
        btn7.setBorder(new LineBorder(Color.BLACK,5));
        panel1.add(btn7);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new update_patient_details();
            }
        });

        JButton btn8 = new JButton("Hospital Ambulance");
        btn8.setBounds(510, 58, 200, 30);
        btn8.setBackground(new Color(246, 215, 118));
        btn8.setBorder(new LineBorder(Color.BLACK,5));
        panel1.add(btn8);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ambulance();
            }
        });

        JButton btn9 = new JButton("Search Room");
        btn9.setBounds(510, 100, 200, 30);
        btn9.setBackground(new Color(246, 215, 118));
        btn9.setBorder(new LineBorder(Color.BLACK,5));
        panel1.add(btn9);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              new SearchRoom();
            }
        });

        JButton btn10 = new JButton("Logout");
        btn10.setBounds(750, 58, 200, 30);
        btn10.setBackground(new Color(246, 215, 118));
        btn10.setBorder(new LineBorder(Color.BLACK,5));
        panel1.add(btn10);
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });

        setUndecorated(true);
        setSize(1950, 1090);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);


    }

    public static void main(String[] args) {
        new Reception();
    }
}
