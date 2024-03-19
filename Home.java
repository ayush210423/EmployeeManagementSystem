package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    JButton view, add, update, remove;
    
    Home() {
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(620, 20, 400, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        image.add(heading);
        
       // Load images for buttons
        ImageIcon addIcon = new ImageIcon("icons/add.png");
        ImageIcon viewIcon = new ImageIcon("icons/view.png");
        ImageIcon updateIcon = new ImageIcon("icons/update.png");
        ImageIcon removeIcon = new ImageIcon("icons/remove.png");

        add = new JButton(addIcon);
        add.setBounds(650, 80, addIcon.getIconWidth(), addIcon.getIconHeight());
        add.addActionListener(this);
        image.add(add);

        view = new JButton(viewIcon);
        view.setBounds(820, 80, viewIcon.getIconWidth(), viewIcon.getIconHeight());
        view.addActionListener(this);
        image.add(view);

        update = new JButton(updateIcon);
        update.setBounds(650, 140, updateIcon.getIconWidth(), updateIcon.getIconHeight());
        update.addActionListener(this);
        image.add(update);

        remove = new JButton(removeIcon);
        remove.setBounds(820, 140, removeIcon.getIconWidth(), removeIcon.getIconHeight());
        remove.addActionListener(this);
        image.add(remove);
        

        
        setSize(1120, 630);
        setLocation(250, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        } else {
            setVisible(false);
            new RemoveEmployee();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
