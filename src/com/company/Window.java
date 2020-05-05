package com.company;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

public class Window extends JFrame {
    Text text = new Text();
    JTextArea area = new JTextArea();
    JTextField field = new JTextField();
    public Window () {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(0,0,400,400);
        area.setBounds(0,0,100,100);
        field.setBounds(30,300,200,100);
        frame.add(field);
        frame.add(area);
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.append(text.humanText(field.getText()));
                area.append(text.botText(field.getText()));
                field.setText("");
            }
        });

        frame.setVisible(true);
    }
    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(30,300,210,110);
    }

}
