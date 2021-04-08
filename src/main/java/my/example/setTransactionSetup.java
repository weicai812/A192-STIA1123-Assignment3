package my.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This is the Transaction Setup Class to let the user to set up the transaction.
 *
 * @author Gan Wei Cai
 * @author Goh Deng Vee
 */
public class setTransactionSetup extends JFrame implements ActionListener {
    private JLabel l1, l2, l3, l4, l5;
    private JButton b1;
    private JRadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8;
    private ButtonGroup bg1, bg2, bg3, bg4;

    /**
     * This constructor inherits the constructor of parent class
     */
    public setTransactionSetup() {
        Font font = new Font("Arial", PROPERTIES, 20);

        l1 = new JLabel("Transaction");
        l1.setBounds(40, 20, 300, 100);
        l1.setFont(new Font("Arial", Font.BOLD, 40));
        add(l1);

        l2 = new JLabel("Tax");
        l2.setBounds(150, 110, 200, 50);
        l2.setFont(font);
        add(l2);

        l3 = new JLabel("Discount");
        l3.setBounds(150, 180, 200, 50);
        l3.setFont(font);
        add(l3);

        l4 = new JLabel("Rounding");
        l4.setBounds(150, 250, 200, 50);
        l4.setFont(font);
        add(l4);

        l5 = new JLabel("Break-time Checkout");
        l5.setBounds(150, 320, 200, 50);
        l5.setFont(font);
        add(l5);


        rb1 = new JRadioButton("On");
        rb1.setBounds(450, 110, 100, 50);
        rb1.setFont(font);
        add(rb1);

        rb2 = new JRadioButton("Off");
        rb2.setBounds(600, 110, 100, 50);
        rb2.setFont(font);
        add(rb2);

        rb3 = new JRadioButton("On");
        rb3.setBounds(450, 180, 100, 50);
        rb3.setFont(font);
        add(rb3);

        rb4 = new JRadioButton("Off");
        rb4.setBounds(600, 180, 100, 50);
        rb4.setFont(font);
        add(rb4);

        rb5 = new JRadioButton("On");
        rb5.setBounds(450, 250, 100, 50);
        rb5.setFont(font);
        add(rb5);

        rb6 = new JRadioButton("Off");
        rb6.setBounds(600, 250, 100, 50);
        rb6.setFont(font);
        add(rb6);

        rb7 = new JRadioButton("On");
        rb7.setBounds(450, 320, 100, 50);
        rb7.setFont(font);
        add(rb7);

        rb8 = new JRadioButton("Off");
        rb8.setBounds(600, 320, 100, 50);
        rb8.setFont(font);
        add(rb8);

        bg1 = new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);
        bg2 = new ButtonGroup();
        bg2.add(rb3);
        bg2.add(rb4);
        bg3 = new ButtonGroup();
        bg3.add(rb5);
        bg3.add(rb6);
        bg4 = new ButtonGroup();
        bg4.add(rb7);
        bg4.add(rb8);

        b1 = new JButton("Save");
        b1.setFont(font);
        b1.setBounds(480, 390, 150, 40);
        add(b1);
        b1.addActionListener(this);

        setTitle("Transaction Setup");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(550, 300, 900, 600);
        setLayout(null);
        setVisible(true);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int save = JOptionPane.showConfirmDialog(this, "Do you want to save??");
            if (save == 0) {
                JOptionPane.showMessageDialog(this, "Saved Successfully");
                new setTransactionSetup();
                this.dispose();
            } else if (save == 1) {
                new setTransactionSetup();
                this.dispose();
            } else if (save == 2) {
                return;
            }
        }
    }
}
