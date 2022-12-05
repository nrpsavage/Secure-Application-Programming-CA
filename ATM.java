package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ATM extends JFrame {
    private JPanel panelAtm;
    private JLabel labelAtm;
    private JLabel labelWelcome;
    private JButton balanceBut;
    private JButton withdrawBut;
    private JButton depositBut;
    private JButton logOutBut;
    private JTextField tfUser;
    private JTextArea taMain;

    /*public static void main(String[] args) {
        new ATM();
    }*/

    Data d = new Data();

    //ATM panel details
    public ATM () {
        setContentPane(panelAtm);
        setTitle("ATM");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        final int[] withdraw = new int[1];
        final int[] deposit = new int[1];
        final int[] money = new int[1];

        //Balance check button
        balanceBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taMain.setText(null);
                taMain.append(String.valueOf(d.getBalance()));
                //Code for the log
                Logger logger = Logger.getLogger("Log");
                FileHandler fh;
                try {
                    logger.setUseParentHandlers(false);
                    fh = new FileHandler("C:/Users/Public/Documents/LogFile.log");
                    logger.addHandler(fh);
                    SimpleFormatter formatter = new SimpleFormatter();
                    fh.setFormatter(formatter);
                    logger.info("User checks balance.");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //Withdraw button
        withdrawBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
<<<<<<< Updated upstream
                taMain.setText(null);
                money[0] = Integer.parseInt(tfUser.getText());
                withdraw[0] = d.getBalance() - money[0];
                taMain.append(String.valueOf(withdraw[0]));
=======
                if (tfUser== null){
                    JOptionPane.showMessageDialog(null, "No amount inputted, please input cash amount.");
                } else {
                    taMain.setText(null);
                    money[0] = Integer.parseInt(tfUser.getText());
                    withdraw[0] = d.getBalance() - money[0];
                    taMain.append(String.valueOf(withdraw[0]));
                }
>>>>>>> Stashed changes
                //Code for the log
                Logger logger = Logger.getLogger("Log");
                FileHandler fh;
                try {
                    logger.setUseParentHandlers(false);
                    fh = new FileHandler("C:/Users/Public/Documents/LogFile.log");
                    logger.addHandler(fh);
                    SimpleFormatter formatter = new SimpleFormatter();
                    fh.setFormatter(formatter);
                    logger.info("User withdraws amount.");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //Deposit button
        depositBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
<<<<<<< Updated upstream
                taMain.setText(null);
                money[0] = Integer.parseInt(tfUser.getText());
                deposit[0] = d.getBalance() + money[0];
                taMain.append(String.valueOf(deposit[0]));
=======
                if (tfUser== null){
                    JOptionPane.showMessageDialog(null, "No amount inputted, please input cash amount.");
                } else {
                    taMain.setText(null);
                    money[0] = Integer.parseInt(tfUser.getText());
                    deposit[0] = d.getBalance() + money[0];
                    taMain.append(String.valueOf(deposit[0]));
                }
>>>>>>> Stashed changes
                //Code for the log
                Logger logger = Logger.getLogger("Log");
                FileHandler fh;
                try {
                    logger.setUseParentHandlers(false);
                    fh = new FileHandler("C:/Users/Public/Documents/LogFile.log");
                    logger.addHandler(fh);
                    SimpleFormatter formatter = new SimpleFormatter();
                    fh.setFormatter(formatter);
                    logger.info("User deposits amount.");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //Log out button
        logOutBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Thank you for using the ATM.");
                dispose();
                new LogIn();
                //Code for the log
                Logger logger = Logger.getLogger("Log");
                FileHandler fh;
                try {
                    logger.setUseParentHandlers(false);
                    fh = new FileHandler("C:/Users/Public/Documents/LogFile.log");
                    logger.addHandler(fh);
                    SimpleFormatter formatter = new SimpleFormatter();
                    fh.setFormatter(formatter);
                    logger.info("User logs out.");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}
