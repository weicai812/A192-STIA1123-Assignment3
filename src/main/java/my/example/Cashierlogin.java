package my.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This is the cashier login class which the cashier have to login this before make the transaction.
 *
 * @author Gan Wei Cai
 * @author Goh Deng Vee
 */
public class Cashierlogin extends JFrame implements ActionListener {
    private JLabel l1, l2;
    private JTextField tf1;
    private JPasswordField pf1;
    private JButton b1;

    /**
     * This constructor inherits the constructor of parent class
     */
    Cashierlogin() {
        Font font = new Font("Arial", PROPERTIES, 20);

        l1 = new JLabel("Username");
        l1.setBounds(120, 40, 100, 40);
        l1.setFont(font);
        add(l1);

        l2 = new JLabel("Password");
        l2.setBounds(120, 110, 100, 40);
        l2.setFont(font);
        add(l2);

        tf1 = new JTextField();
        tf1.setFont(font);
        tf1.setBounds(250, 40, 200, 40);
        add(tf1);

        pf1 = new JPasswordField();
        pf1.setFont(font);
        pf1.setBounds(250, 110, 200, 40);
        add(pf1);

        b1 = new JButton("Login");
        b1.setFont(font);
        b1.setBounds(300, 180, 100, 40);
        add(b1);
        b1.addActionListener(this);

        setTitle("Cashier Login");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(700, 300, 600, 300);
        setLayout(null);
        setVisible(true);
        setResizable(false);
    }

    /**
     * this is the action event method for the button.
     *
     * @param e = button action event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String userText;
            String pwdText;
            userText = tf1.getText();
            pwdText = pf1.getText();
            if (userText.equalsIgnoreCase("admin") && pwdText.equalsIgnoreCase("1234")) {
                new setCashReceipt();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
        }
    }
}
