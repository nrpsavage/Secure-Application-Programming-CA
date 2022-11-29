package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
            }
        });

        //Withdraw button
        withdrawBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taMain.setText(null);
                money[0] = Integer.parseInt(tfUser.getText());
                withdraw[0] = d.getBalance() - money[0];
                taMain.append(String.valueOf(withdraw[0]));
            }
        });

        //Deposit button
        depositBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taMain.setText(null);
                money[0] = Integer.parseInt(tfUser.getText());
                deposit[0] = d.getBalance() + money[0];
                taMain.append(String.valueOf(deposit[0]));
            }
        });

        //Log out button
        logOutBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Thank you for using the ATM.");
                dispose();
                new LogIn();
            }
        });
    }
}
