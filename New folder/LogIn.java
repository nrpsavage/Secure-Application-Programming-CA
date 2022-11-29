package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends JFrame {
    private JPasswordField tfPassword;
    private JPanel mainPanelLogIn;
    private JLabel labelHeading;
    private JLabel labelPassword;
    private JTextField tfName;
    private JLabel labelName;
    private JButton buttonLogIn;
    private JButton buttonExit;

    Data d = new Data();

    /*public static void main(String[] args) {
        new LogIn();
    }*/

    //Log In panel details
    public LogIn() {
        setContentPane(mainPanelLogIn);
        setTitle("ATM");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        //Log In button action
        buttonLogIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tfName.getText();
                String password = tfPassword.getText();
                if (name.equals(d.getName()) && password.equals (d.getPassword())) {
                    JOptionPane.showMessageDialog(null, "Log in successful.");
                    dispose();
                    new ATM();
                } else {
                    tfName.setText(null);
                    tfPassword.setText(null);
                    JOptionPane.showMessageDialog(null, "Incorrect name or password, please try again.");
                }
            }
        });

        //Exit button actions
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}

