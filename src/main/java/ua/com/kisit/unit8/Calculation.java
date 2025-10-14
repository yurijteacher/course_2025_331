package ua.com.kisit.unit8;

import javax.swing.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Calculation {

    /*
    ----------------------
    X -   Calculation
    ----------------------
    Display
    ----------------------
    7  8  9   +
    4  5  6   -
    1  2  3   *
    0  ,  =   /
    ------------------------
    =======================
    AWT     /    Swing
    =======================
    Frame   /    JFrame
    Panel   /    JPanel
    Button  /    JButton
    TextField / JTextField
    ...
    Java FX  (AWT / Swing)
    */

    JFrame frame;
    JTextArea display;
    JPanel panel;
    JButton b13, b14, b15, b16,
            b9, b10, b11, b12,
            b5, b6, b7, b8,
            b1, b2, b3, b4;

    String operator = "";
    double first = 0;
    double second = 0;


    public Calculation() {

        frame = new JFrame("My Calculation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        display = new JTextArea();
        frame.add(display, BorderLayout.NORTH);

        panel.setLayout(new GridLayout(4, 4));

        b1 = new JButton("0");
        b2 = new JButton(",");
        b3 = new JButton("=");
        b4 = new JButton("/");

        b5 = new JButton("1");
        b6 = new JButton("2");
        b7 = new JButton("3");
        b8 = new JButton("*");

        b9 = new JButton("4");
        b10 = new JButton("5");
        b11 = new JButton("6");
        b12 = new JButton("-");

        b13 = new JButton("7");
        b14 = new JButton("8");
        b15 = new JButton("9");
        b16 = new JButton("+");

        panel.add(b13);
        panel.add(b14);
        panel.add(b15);
        panel.add(b16);

        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);

        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);

        frame.add(panel, BorderLayout.CENTER);

        b1.setFont(new Font("Arial", Font.BOLD, 25));

        Stream.of(b13, b14, b15, b16, b9, b10, b11, b12, b5, b6, b7, b8, b1, b2, b3, b4)
                .forEach(el -> el.setFont(new Font("Arial", Font.BOLD, 20)));

        display.setFont(new Font("Arial", Font.BOLD, 20));

        frame.setSize(300, 400);

//        b1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                display.setText(display.getText()+b1.getText());
//            }
//        });

//        b1.addActionListener(e ->
//                display.setText(display.getText() + b1.getText()));

        Stream.of(b1, b5, b6, b7, b9, b10, b11, b13, b14, b15).forEach(el ->
                el.addActionListener(e -> {
                    display.setText(display.getText() + el.getText());
                }));

        b2.addActionListener(el -> {
            char[] arr = display.getText().toCharArray();

            boolean logic = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '.') logic = true;
            }

            if (!logic) display.setText(display.getText() + ".");
        });


//        b4.addActionListener(el->{
//            operator = b4.getText();
//            first = Double.valueOf(display.getText());
//            display.setText("0");
//        });

        Stream.of(b4, b8, b12, b16)
                .forEach(el -> {
                    el.addActionListener(e -> {
                        operator = el.getText();

                        String doubleValues = String.valueOf(display.getText());

                        String pattern2 = "[0-9]+[\\.]?[0-9]+";

                        Pattern p3 = Pattern.compile(pattern2);
                        Matcher m3 = p3.matcher(doubleValues);
                        boolean logic = m3.matches() ? true : false;
                        System.out.println(logic);

                        if (logic) {
                            first = Double.valueOf(display.getText());
                        } else {
                            first = 0;
                        }
                        display.setText("0");
                    });
                });

        b3.addActionListener(el -> {

            second = Double.valueOf(display.getText());

            switch (operator) {
                case "+":
                    display.setText(String.valueOf(first + second));
                    break;
                case "-":
                    display.setText(first - second + "");
                    break;
                case "*":
                    display.setText(first * second + "");
                    break;
                case "/":
                    if (second != 0) {
                        display.setText(first / second + "");
                    } else {
                        display.setText("0");
                    }
                    break;
//               default: display.setText("0");

            }
        });

        frame.setVisible(true);
    }
}
