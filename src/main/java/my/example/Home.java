package my.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class is for the user to have the main interface.
 *
 * @author Gan Wei Cai
 * @author Goh Deng Vee
 */
public class Home extends JFrame implements ActionListener {
    private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
    private JMenuBar mb;
    private JMenu maintenance, transaction, enquiry, report, housekeeping, wizards, help, exit;
    private JMenu item;
    private JMenuItem item1;
    private JMenuItem cr, rr;
    private JMenuItem pb;
    private JMenuItem itemlist;
    private JMenuItem receiptreport, salesreport;
    private JMenuItem generalsetup, transactionsetup;
    private JMenuItem usermanual;
    private JMenuItem aboutus, contactus;
    private JMenuItem logout, quit;
    private JButton b1, b2, b3, b4;


    /**
     * This constructor inherits the constructor of parent class
     */
    Home() {
        mb = new JMenuBar();
        setMaintenance();
        setTransaction();
        setEnquiry();
        setReport();
        setHousekeeping();
        setWizards();
        setHelp();
        setExit();

        setTime();
        setImage();
        setQuickButton();
        setLabel();
        addActionEvent();


        mb.add(maintenance);
        mb.add(transaction);
        mb.add(enquiry);
        mb.add(report);
        mb.add(housekeeping);
        mb.add(wizards);
        mb.add(help);
        mb.add(exit);

        setTitle("Home");
        setJMenuBar(mb);
        setBounds(380, 100, 1200, 850);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setResizable(false);
    }

    /**
     * This is button action event method.
     *
     * @param e = This is the button action
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == item1) {
            try {
                new setItemList();
                JOptionPane.showMessageDialog(this, "Item file saved");
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
        if (e.getSource() == cr) {
            new Cashierlogin();
        }
        if (e.getSource() == rr) {
            File file = new File("Receipt.txt");
            if (!file.exists()) {
                JOptionPane.showMessageDialog(null, "Record is empty!");
            } else {
                new receiptReport();
            }
        }

        if (e.getSource() == pb) {
            new receiptrecord();
        }
        if (e.getSource() == itemlist) {
            File file = new File("Item.ser");
            if (!file.exists()) {
                JOptionPane.showMessageDialog(null, "Record is empty!");
            } else {
                new printItemList();
            }
        }
        if (e.getSource() == receiptreport) {
            File file = new File("Receipt.txt");
            if (!file.exists()) {
                JOptionPane.showMessageDialog(null, "Record is empty!");
            } else {
                new receiptReport();
            }
        }
        if (e.getSource() == salesreport) {
            File file = new File("Receipt.txt");
            if (!file.exists()) {
                JOptionPane.showMessageDialog(null, "Record is empty!");
            } else {
                new receiptReport();
            }
        }
        if (e.getSource() == generalsetup) {
            new setGeneralSetup();
        }
        if (e.getSource() == transactionsetup) {
            new setTransactionSetup();
        }
        if (e.getSource() == usermanual) {
            new setUserManual();
        }
        if (e.getSource() == aboutus) {
            new setAboutUs();
        }
        if (e.getSource() == contactus) {
            new setContactUs();
        }
        if (e.getSource() == logout) {
            new Login();
            this.dispose();
        }
        if (e.getSource() == quit) {
            System.exit(0);
        }
        if (e.getSource() == b1) {
            new Cashierlogin();
        }
        if (e.getSource() == b2) {
            File file = new File("Receipt.txt");
            if (!file.exists()) {
                JOptionPane.showMessageDialog(null, "Record is empty!");
            } else {
                new receiptReport();
            }
        }
        if (e.getSource() == b3) {
            File file = new File("Receipt.txt");
            if (!file.exists()) {
                JOptionPane.showMessageDialog(null, "Record is empty!");
            } else {
                new receiptrecord();
            }

        }
        if (e.getSource() == b4) {
            new Login();
            this.dispose();
        }
    }

    /**
     * This is Maintenance method.
     */
    public void setMaintenance() {
        maintenance = new JMenu("Maintenance");
        setItem();
    }


    /**
     * This is Item method.
     */
    public void setItem() {
        item = new JMenu("Item File");
        maintenance.add(item);
        item1 = new JMenuItem("Item");
        item.add(item1);
        setPrintitem();
    }

    /**
     * This is the Transaction method.
     */
    public void setTransaction() {
        transaction = new JMenu("Transaction");
        cr = new JMenuItem("Cash Receipt");
        rr = new JMenuItem("Receipt Record");
        transaction.add(cr);
        transaction.add(rr);
    }

    /**
     * This is the Enquiry method.
     */
    public void setEnquiry() {
        enquiry = new JMenu("Enquiry");
        pb = new JMenuItem("Print Bill");
        enquiry.add(pb);
    }

    /**
     * This is the Print Item method.
     */
    public void setPrintitem() {
        itemlist = new JMenuItem("Item List");
        item.add(itemlist);
    }

    /**
     * This is the Report method.
     */
    public void setReport() {
        report = new JMenu("Report");
        receiptreport = new JMenuItem("Receipt Report");
        salesreport = new JMenuItem("Sales Report");
        report.add(receiptreport);
        report.add(salesreport);
    }

    /**
     * This is the Setting method.
     */
    public void setHousekeeping() {
        housekeeping = new JMenu("Housekeeping");
        generalsetup = new JMenuItem("General Setup");
        transactionsetup = new JMenuItem("Transaction Setup");
        housekeeping.add(generalsetup);
        housekeeping.add(transactionsetup);

    }

    /**
     * This is the Wizard method.
     */
    public void setWizards() {
        wizards = new JMenu("Wizard");
        usermanual = new JMenuItem("User Manual");
        wizards.add(usermanual);
    }

    /**
     * This is the help method
     */
    public void setHelp() {
        help = new JMenu("Help");
        aboutus = new JMenuItem("About Us");
        contactus = new JMenuItem("Contact Us");
        help.add(aboutus);
        help.add(contactus);
    }

    /**
     * Thisis the exit method
     */
    public void setExit() {
        exit = new JMenu("Exit");
        logout = new JMenuItem("Logout");
        quit = new JMenuItem("Quit");
        exit.add(logout);
        exit.add(quit);
    }

    /**
     * This is Time method and display the actual time in the frame.
     */
    public void setTime() {
        final JLabel time = new JLabel();
        time.setBounds(950, 110, 300, 50);
        add(time);

        final DateFormat timeFormat = new SimpleDateFormat("d MMM yyyy (EE) HH:mm:ss");
        ActionListener t = e -> {
            Date date = new Date();
            String time1 = timeFormat.format(date);
            time.setFont(new Font("Arial", Font.BOLD, 18));
            time.setText(time1);
        };
        Timer timer = new Timer(1000, t);
        timer.setInitialDelay(0);
        timer.start();
    }

    /**
     * This is Image method.
     */
    public void setImage() {
        InputStream imgURL = getClass().getClassLoader().getResourceAsStream("Home-Head1.png");

        BufferedImage myImg = null;
        try {
            myImg = ImageIO.read(imgURL);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ImageIcon imageIcon = new ImageIcon(myImg);
        l1 = new JLabel(imageIcon);
        l1.setBounds(-3, -40, 1200, 200);
        add(l1);

        InputStream imgURL1 = getClass().getClassLoader().getResourceAsStream("Bottom-Layer1.png");

        BufferedImage myImg1 = null;
        try {
            myImg1 = ImageIO.read(imgURL1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ImageIcon imageIcon1 = new ImageIcon(myImg1);
        l2 = new JLabel(imageIcon1);
        l2.setBounds(-3, 768, 1200, 30);
        add(l2);
    }

    /**
     * This is quick button for quick access method.
     */
    public void setQuickButton() {
        InputStream imgURL2 = getClass().getClassLoader().getResourceAsStream("quick-button1.png");

        BufferedImage myImg2 = null;
        try {
            myImg2 = ImageIO.read(imgURL2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ImageIcon imageIcon2 = new ImageIcon(myImg2);
        b1 = new JButton(imageIcon2);
        b1.setBounds(120, 330, 200, 200);
        add(b1);
        b1.addActionListener(this);

        InputStream imgURL3 = getClass().getClassLoader().getResourceAsStream("quick-button2.png");

        BufferedImage myImg3 = null;
        try {
            myImg3 = ImageIO.read(imgURL3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ImageIcon imageIcon3 = new ImageIcon(myImg3);
        b2 = new JButton(imageIcon3);
        b2.setBounds(370, 330, 200, 200);
        add(b2);
        b2.addActionListener(this);

        InputStream imgURL4 = getClass().getClassLoader().getResourceAsStream("quick-button3.png");

        BufferedImage myImg4 = null;
        try {
            myImg4 = ImageIO.read(imgURL4);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ImageIcon imageIcon4 = new ImageIcon(myImg4);
        b3 = new JButton(imageIcon4);
        b3.setBounds(620, 330, 200, 200);
        add(b3);
        b3.addActionListener(this);

        InputStream imgURL5 = getClass().getClassLoader().getResourceAsStream("quick-button4.png");

        BufferedImage myImg5 = null;
        try {
            myImg5 = ImageIO.read(imgURL5);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ImageIcon imageIcon5 = new ImageIcon(myImg5);
        b4 = new JButton(imageIcon5);
        b4.setBounds(870, 330, 200, 200);
        add(b4);
        b4.addActionListener(this);
    }

    /**
     * This is the label method which provide the detail.
     */
    public void setLabel() {
        l3 = new JLabel("Quick Access");
        l3.setBounds(30, 150, 500, 200);
        l3.setFont(new Font("Arial", Font.BOLD, 48));
        add(l3);

        l4 = new JLabel("Cash Sales");
        l4.setBounds(180, 520, 150, 50);
        l4.setFont(new Font("Arial", Font.PLAIN, 16));
        add(l4);

        l5 = new JLabel("Daily Sales Report");
        l5.setBounds(410, 520, 150, 50);
        l5.setFont(new Font("Arial", Font.PLAIN, 16));
        add(l5);

        l6 = new JLabel("Print Bill");
        l6.setBounds(690, 520, 150, 50);
        l6.setFont(new Font("Arial", Font.PLAIN, 16));
        add(l6);

        l7 = new JLabel("Logout");
        l7.setBounds(950, 520, 150, 50);
        l7.setFont(new Font("Arial", Font.PLAIN, 16));
        add(l7);

        l8 = new JLabel("Powered by STIA1123-A192 Group D");
        l8.setBounds(5, 735, 400, 50);
        l8.setFont(new Font("Arial", Font.BOLD, 18));
        add(l8);

        l9 = new JLabel("Version 2.0.0.0");
        l9.setBounds(1060, 735, 400, 50);
        l9.setFont(new Font("Arial", Font.BOLD, 18));
        add(l9);
        add(l9);
    }

    /**
     * This is the action event method which we add the button action.
     */
    public void addActionEvent() {
        cr.addActionListener(this);
        rr.addActionListener(this);
        pb.addActionListener(this);
        item1.addActionListener(this);
        itemlist.addActionListener(this);
        receiptreport.addActionListener(this);
        salesreport.addActionListener(this);
        generalsetup.addActionListener(this);
        transactionsetup.addActionListener(this);
        usermanual.addActionListener(this);
        aboutus.addActionListener(this);
        contactus.addActionListener(this);
        logout.addActionListener(this);
        quit.addActionListener(this);
    }
}
