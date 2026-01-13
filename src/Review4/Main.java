package Review4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

    public JTextField textField1, textField2;
    public JLabel result;

    public Main() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout(10, 10));

        JLabel header = new JLabel("Calculator");
        header.setFont(new Font("Times New Roman", Font.BOLD, 24));
        header.setHorizontalAlignment(JLabel.CENTER);
        panel.add(header, BorderLayout.NORTH);

        JPanel gridPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gridPanel.add(new JLabel("Value 1: "), gbc);

        textField1 = new JTextField(13);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gridPanel.add(textField1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        gridPanel.add(new JLabel("Value 2: "), gbc);

        textField2 = new JTextField(13);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gridPanel.add(textField2, gbc);

        gbc.gridwidth = 1;
        gbc.gridy = 2;

        JButton btnPlus = new JButton("+");
        gbc.gridx = 0;
        gridPanel.add(btnPlus, gbc);

        JButton btnMin = new JButton("-");
        gbc.gridx = 1;
        gridPanel.add(btnMin, gbc);

        JButton btnMul = new JButton("*");
        gbc.gridx = 2;
        gridPanel.add(btnMul, gbc);

        JButton btnDivid = new JButton("/");
        gbc.gridx = 3;
        gridPanel.add(btnDivid, gbc);

        result = new JLabel("Result");
        result.setFont(new Font("Times New Roman", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        gridPanel.add(result, gbc);

        panel.add(gridPanel, BorderLayout.CENTER);
        add(panel);
        setVisible(true);
        btnPlus.addActionListener(e -> calculate("+"));
        btnMin.addActionListener(e -> calculate("-"));
        btnMul.addActionListener(e -> calculate("*"));
        btnDivid.addActionListener(e -> calculate("/"));
    }
    public void calculate(String op){
        double num1 = Double.parseDouble(textField1.getText());
        double num2 = Double.parseDouble(textField2.getText());
        double res = 0;
        switch(op){
            case "+" -> res = num1 + num2;
            case "-" -> res = num1 - num2;
            case "*" -> res = num1 * num2;
            case "/" ->
            {if(num2 != 0){
            res = num1 / num2;
            }else{
                result.setText("Can't divid!!!");
            }
            }
        }
        result.setText("Result: " + res);
    }


    public static void main(String[] args) {
        new Main();
    }
}
