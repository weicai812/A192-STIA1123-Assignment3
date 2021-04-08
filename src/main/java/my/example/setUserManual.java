package my.example;

import javax.swing.*;
import java.awt.*;

/**
 * This is User Manual class which give the guide for user to use the system.
 *
 * @author Gan Wei Cai
 * @author Goh Deng Vee
 */
public class setUserManual extends JFrame {
    /**
     * This constructor inherits the constructor of parent class
     */
    setUserManual() {
        Font f = new Font("Arial", Font.BOLD, 50);
        Font font = new Font("Arial", PROPERTIES, 16);
        JTextArea textArea = new JTextArea();
        JLabel a = new JLabel("USER MANUAL");
        a.setFont(f);
        a.setBounds(5, 5, 400, 80);
        add(a);

        textArea.setText("Thank for using our system.\n\nThe user have to login the system before use. The username for " +
                "login the system is user and the password for login the system also is user. If the user would like to " +
                "make transaction by using cash sales, the user have to login the cash sales page by using \nthe username" +
                "is admin and the password is 1234. Besides that, we had updated our version to version 2.0.0.0 to \n" +
                "ensure our user can save the data easily" +
                "In our \nsystem, we also provide system time to ensure our system is fulfil the simple transaction to to" +
                " user.\n\n" +
                "Instruction to use our system:\n" +
                "1. Login in our system by using the username and password\n" +
                "2. When login successful, you can make the transaction by using quick access cash sales.\n" +
                "3. If you going to access cash sales, you have to login the cash sales.\n" +
                "4. For version 2.0.0.0, we have use the File to save all your transaction data\n" +
                "5. You also can go to Help to get more information about our system and our team\n\n" +
                "We hope you can enjoy our system.\n" +
                "Thamk you very much\n\n" +
                "by,\n" +
                "Gan Wei Cai & Goh Deng Vee");
        textArea.setLineWrap(true);
        textArea.setFont(font);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(0, 80, 890, 500);
        add(scrollPane);

        setTitle("User Manual");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(550, 300, 900, 600);
        setLayout(null);
        setVisible(true);
        setResizable(false);

    }

}
