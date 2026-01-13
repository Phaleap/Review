package Review5;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main(){
        //Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        add(mainPanel);
        //Heading
        JLabel heading = new JLabel("Calculator");
        heading.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(heading, BorderLayout.NORTH);
        //Center
        JPanel centerPanel = new JPanel();
        GridBagConstraints gbc = new GridBagConstraints();
        centerPanel.setLayout(new GridBagLayout());
        gbc.insets = new Insets(5,5,5,5);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        //Value1
        JLabel value1 = new JLabel("Value1");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        centerPanel.add(value1, gbc);
        //TextField1
        JTextField textField1 = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridwidth = 4;
        centerPanel.add(textField1, gbc);
        //Value2
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        centerPanel.add(new JLabel("Value2"), gbc);
        //TextField2
        JTextField textField2 = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridwidth = 4;
        centerPanel.add(textField2, gbc);
        //Button
        gbc.gridwidth =1;
        gbc.gridy =2;

        //btn1
        JButton btn1 = new JButton("+");
        gbc.gridx = 0;
        centerPanel.add(btn1, gbc);
        //btn2
        JButton btn2 = new JButton("-");
        gbc.gridx = 1;
        centerPanel.add(btn2, gbc);
        //btn3
        JButton btn3 = new JButton("*");
        gbc.gridx =2;
        centerPanel.add(btn3, gbc);
        //btn4
        JButton btn4 = new JButton("/");
        gbc.gridx = 3;
        centerPanel.add(btn4, gbc);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
