package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        //Creates the main window 
        JFrame window = new JFrame();
        window.setTitle("My GUI"); //Sets window title
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null); //Centers window on screen when running app
        
        window.setSize(400,400); //Window Size
        window.setLayout(new GridLayout(4,1)); //Grid Layout with 4 rows

        //Panel that holds label and button 
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));

        
        JLabel label = new JLabel("This is my GUI that I created",SwingConstants.CENTER); //Creates label and centers the text 
        JButton button = new JButton("This is button makes label font larger"); //Creates button

        //Adds widgets to panel
        panel.add(label);
        panel.add(button);
        
        //Once button is clicked increases font size of the label 
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font currentFont = label.getFont();
                int newFontSize = currentFont.getSize() + 10;
                label.setFont(new Font(currentFont.getName(), currentFont.getStyle(), newFontSize));
            }
        });

        //Panel for radio buttons
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(2,1));

        //Radio buttons make the button visble or not
        JRadioButton radioButton1 = new JRadioButton("Make button visible");
        JRadioButton radioButton2 = new JRadioButton("Make button not visible");
        //Adds radio buttons  to panel
        buttonsPanel.add(radioButton1);
        buttonsPanel.add(radioButton2);

        
        //Action listener used to make button visible or not
        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setVisible(true);
            }
        });
        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setVisible(false);
            }
        });

        //Panel for check boxes 
        JPanel checksPanel = new JPanel();
        checksPanel.setLayout( new GridLayout(3,1));

        //Creates check boxes
        JCheckBox checkBox1 = new JCheckBox("Change font");
        JCheckBox checkBox2 = new JCheckBox("This is a checkbox");
        JCheckBox checkBox3 = new JCheckBox("This is a checkbox");

        //Check box once clicked changes label font
        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setFont(new Font("Arial", Font.PLAIN, 12));
            }
        });

        //Adds check boxes to panel 
        checksPanel.add(checkBox1);
        checksPanel.add(checkBox2);
        checksPanel.add(checkBox3);

        //Draws a horizontal line
        JPanel linePanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.drawLine(0, getHeight() / 2, getWidth(), getHeight()/2);
            }
        };
        
        //Adds panels to layout
        window.add(panel);
        window.add(buttonsPanel);
        window.add(checksPanel);
        window.add(linePanel);
        
        window.setVisible(true); //Makes window visible


    }
}