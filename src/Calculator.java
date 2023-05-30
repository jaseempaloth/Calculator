import javax.swing.*;
import java.awt.*;

public class Calculator {
    public Calculator() {
        JFrame jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(300,50);

        JLabel displayLabel=new JLabel("Hello World");
        displayLabel.setBounds(30,50,540,40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        JButton sevenButton=new JButton("7");
        sevenButton.setBounds(30,130,80,80);
        jf.add(sevenButton);

        JButton eightButton=new JButton("8");
        eightButton.setBounds(130,130,80,80);
        jf.add(eightButton);

        JButton nineButton=new JButton("9");
        nineButton.setBounds(230,130,80,80);
        jf.add(nineButton);

        JButton fourButton=new JButton("4");
        fourButton.setBounds(30,230,80,80);
        jf.add(fourButton);

        JButton fiveButton=new JButton("5");
        fiveButton.setBounds(130,230,80,80);
        jf.add(fiveButton);

        JButton sixButton=new JButton("6");
        sixButton.setBounds(230,230,80,80);
        jf.add(sixButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Calculator();

    }
}