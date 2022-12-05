package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

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
    public LogIn(){
        setContentPane(mainPanelLogIn);
        setTitle("ATM");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        //Code for the log
        try {
            File myObj = new File("C:\\Users\\natha\\Desktop\\log.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //Log In button action
        buttonLogIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = tfName.getText();
                String p = tfPassword.getText();
                if (n.equals(d.getName()) && p.equals(d.getPassword())) {
                    JOptionPane.showMessageDialog(null, "Log in successful.");
                    dispose();
                    new ATM();
                    //Code for the log
                    Logger logger = Logger.getLogger("Log");
                    FileHandler fh;
                    try {
                        logger.setUseParentHandlers(false);
                        fh = new FileHandler("C:/Users/Public/Documents/LogFile.log");
                        logger.addHandler(fh);
                        SimpleFormatter formatter = new SimpleFormatter();
                        fh.setFormatter(formatter);
                        logger.info("User logs in.");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
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

