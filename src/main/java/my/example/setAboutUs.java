package my.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 * This is About Us class which can let the user to get know about the authors.
 *
 * @author Gan Wei Cai
 * @author Goh Deng Vee
 */
public class setAboutUs extends JFrame {
    private static final long serialVersionUID = 1L;

    /**
     * This constructor inherits the constructor of parent class
     */
    setAboutUs() {
        Font f = new Font("Arial", Font.BOLD, 50);
        Font font = new Font("Arial", PROPERTIES, 20);
        JTextArea textArea = new JTextArea(35, 0);
        JLabel a = new JLabel("<HTML>Name: GAN WEI CAI<BR>Matric Number: 269979</HTML>");
        a.setBounds(5, 330, 890, 50);
        a.setFont(font);

        JLabel a2 = new JLabel("<HTML>Name: GOH DENG VEE<BR>Matric Number: 269843</HTML>");
        a2.setBounds(5, 720, 890, 50);
        a2.setFont(font);
        textArea.add(a2);

        JLabel a1 = new JLabel("About Us");
        a1.setFont(f);
        a1.setBounds(5, 5, 400, 80);
        add(a1);


        InputStream imgURL = getClass().getClassLoader().getResourceAsStream("AboutUs1.jpg");

        BufferedImage myImg = null;
        try {
            myImg = ImageIO.read(imgURL);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ImageIcon imageIcon = new ImageIcon(myImg);
        JLabel icon = new JLabel(imageIcon);
        icon.setBounds(0, 10, 300, 300);
        textArea.add(icon);
        textArea.add(a);

        InputStream imgURL1 = getClass().getClassLoader().getResourceAsStream("AboutUs2.png");

        BufferedImage myImg1 = null;
        try {
            myImg1 = ImageIO.read(imgURL1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ImageIcon imageIcon2 = new ImageIcon(myImg1);
        JLabel icon2 = new JLabel(imageIcon2);
        icon2.setBounds(0, 400, 300, 300);
        textArea.add(icon2);

        textArea.setLineWrap(true);
        textArea.setFont(font);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(0, 80, 890, 500);
        add(scrollPane);

        setTitle("About Us");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(550, 300, 900, 600);
        setLayout(null);
        setVisible(true);
        setResizable(false);
    }
}
