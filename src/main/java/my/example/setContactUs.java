package my.example;

import javax.swing.*;
import java.awt.*;

/**
 * This is Contact class which give information to user to contact us.
 *
 * @author Gan Wei Cai
 * @author Goh Deng Vee
 */
public class setContactUs extends JFrame {
    /**
     * This constructor inherits the constructor of parent class
     */
    setContactUs() {
        Font f = new Font("Arial", Font.BOLD, 50);
        Font font = new Font("Arial", PROPERTIES, 20);
        JLabel a1 = new JLabel("Contact Us");
        a1.setFont(f);
        a1.setBounds(5, 5, 400, 80);
        add(a1);

        JTextArea textArea = new JTextArea(25, 0);
        textArea.setText("When you face the problem while using our system, please contact us to get the technical assists.\n" +
                "You also can contact us for give us the feedback about this system.\n\nThank you very much.\n\n" +
                "This is our technical hotline:\n" +
                "018-3944253 (GAN WEI CAI)\n019-4162131 (GOH DENG VEE)\n\nYour also can contact us through Email:\n" +
                "weicai6919@gmail.com\nvenicegoh0925@gmail.com\n\nWe hope you can enjoy our system.\nHave a nice day.\n\n" +
                "Thank for using our system.\n\n\nPowered by UUM STIA1123-A192 Group D\nGuided by Encik Zhamri bin Che Ani" +
                "\nDesigned by Gan Wei Cai & Goh Deng Vee");

        textArea.setLineWrap(true);
        textArea.setFont(font);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(0, 80, 890, 500);
        add(scrollPane);

        setTitle("Contact Us");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(550, 300, 900, 600);
        setLayout(null);
        setVisible(true);
        setResizable(false);
    }

}
