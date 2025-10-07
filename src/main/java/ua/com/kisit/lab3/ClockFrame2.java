package ua.com.kisit.lab3;

import javax.swing.*;
import java.awt.*;

public class ClockFrame2 {

    JFrame frame;
    JPanel panel;
    JLabel label;

    public ClockFrame2() {
        frame = new JFrame("My Clock");
        panel = new JPanel();
        label = new JLabel();

        frame.setSize(500,168);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label.setFont(new Font("Arial", Font.BOLD, 20));

        panel.add(label, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.CENTER);


        ClockExt2 clockExt = new ClockExt2(12,06,30,00);

        Timer timer = new Timer(1000, e -> {
            clockExt.nextMilliSecond();
            label.setText(clockExt.toString());
        });

        timer.start();

        frame.setVisible(true);

    }

}
