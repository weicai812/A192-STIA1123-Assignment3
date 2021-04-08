package my.example;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * This is Cash Receipt class which allow the user to make transaction here.
 *
 * @author Gan Wei Cai
 * @author Goh Deng Vee
 */
public class setCashReceipt extends JFrame {
    private JTable table;
    private int i = 0;
    private JTextField textWeight, textField;
    private JComboBox comboBox, comboBox1;
    private String t, o, w, q;
    private double price, totalcharge;
    private String time1;

    /**
     * This constructor inherits the constructor of parent class
     */
    setCashReceipt() {

        comboBox = new JComboBox(new String[]{"Next-Day Delivery", "Same-Day Delivery", "Prepaid Box",
                "Envelope", "Pos Ekspres"});
        comboBox.setBounds(120, 305, 200, 40);
        add(comboBox);

        comboBox1 = new JComboBox();
        comboBox1.setBounds(120, 455, 200, 40);
        add(comboBox1);

        Font font1 = new Font("Arial", PROPERTIES, 16);

        table = new JTable();

        Object[] columns = {"No", "Item Type", "Item Weight (in gram)", "Quantity", "Options", "Price"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);

        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("Arial", 1, 16);
        table.setFont(font);
        table.setRowHeight(30);


        textWeight = new JTextField();
        JButton btnAdd = new JButton("Add");
        JButton btnLogout = new JButton("Logout");
        JButton btnCheckOut = new JButton("Checkout");
        JLabel itemType = new JLabel("Item Type");
        itemType.setFont(font1);
        itemType.setBounds(20, 300, 150, 50);
        add(itemType);
        JLabel weight = new JLabel("Weight");
        weight.setFont(font1);
        weight.setBounds(20, 350, 150, 50);
        add(weight);


        textWeight.setBounds(120, 355, 200, 40);
        textWeight.setFont(font1);
        add(textWeight);

        JLabel l1 = new JLabel("Quantity");
        l1.setBounds(20, 405, 150, 50);
        l1.setFont(font1);
        add(l1);

        JLabel l2 = new JLabel("Options");
        l2.setBounds(20, 455, 150, 50);
        l2.setFont(font1);
        add(l2);

        textField = new JTextField();
        textField.setFont(font1);
        textField.setBounds(120, 405, 200, 40);
        add(textField);

        btnAdd.setBounds(200, 500, 100, 40);
        btnLogout.setBounds(500, 500, 100, 40);
        btnCheckOut.setBounds(350, 500, 100, 40);

        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(10, 0, 880, 300);

        add(pane);
        add(btnAdd);
        add(btnLogout);
        add(btnCheckOut);
        Object[] row = new Object[6];
        btnAdd.addActionListener(new ActionListener() {
            /**
             * This is button action event method.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                double charge;
                t = (String) comboBox.getSelectedItem();
                o = (String) comboBox1.getSelectedItem();
                w = textWeight.getText();
                int weight = Integer.parseInt(w);
                q = textField.getText();
                int quantity = Integer.parseInt(q);

                DecimalFormat df2 = new DecimalFormat("#.##");

                switch (t) {
                    case "Next-Day Delivery":
                        switch (o) {
                            case "Zone 1":
                                if (weight <= 2000) {
                                    if (weight <= 2000) {
                                        charge = 4.90 + (weight - 500) / 250 * 0.80;
                                        price = charge * quantity;
                                    }
                                    if (weight <= 500) {
                                        charge = 4.90;
                                        price = charge * quantity;
                                    }
                                }
                                if (weight > 2000) {
                                    if (weight <= 2500) {
                                        charge = 10.50;
                                        price = charge * quantity;
                                    }
                                    if (weight > 2500) {
                                        charge = 10.50 + (weight - 2500) / 500 * 0.50;
                                        price = charge * quantity;
                                    }
                                }
                            case "Zone 2":
                                if (weight <= 2000) {
                                    if (weight <= 2000) {
                                        charge = 5.40 + (weight - 500) / 250 * 1.00;
                                        price = charge * quantity;
                                    }
                                    if (weight <= 500) {
                                        charge = 5.40;
                                        price = charge * quantity;
                                    }
                                }
                                if (weight > 2000) {
                                    if (weight <= 2500) {
                                        charge = 16.00;
                                        price = charge * quantity;
                                    }
                                    if (weight > 2500) {
                                        charge = 16.00 + (weight - 2500) / 500 * 2.00;
                                        price = charge * quantity;
                                    }
                                }
                                break;
                            case "Zone 3":
                                if (weight <= 2000) {
                                    if (weight <= 2000) {
                                        charge = 6.90 + (weight - 500) / 250 * 1.50;
                                        price = charge * quantity;
                                    }
                                    if (weight <= 500) {
                                        charge = 6.90;
                                        price = charge * quantity;
                                    }
                                }
                                if (weight > 2000) {
                                    if (weight <= 2500) {
                                        charge = 21.00;
                                        price = charge * quantity;
                                    }
                                    if (weight > 2500) {
                                        charge = 21.00 + (weight - 2500) / 500 * 3.00;
                                        price = charge * quantity;
                                    }
                                }
                                break;
                            case "Zone 4":
                                if (weight <= 2000) {
                                    if (weight <= 2000) {
                                        charge = 7.40 + (weight - 500) / 250 * 1.50;
                                        price = charge * quantity;
                                    }
                                    if (weight <= 500) {
                                        charge = 7.40;
                                        price = charge * quantity;
                                    }
                                }
                                if (weight > 2000) {
                                    if (weight <= 2500) {
                                        charge = 26.00;
                                        price = charge * quantity;
                                    }
                                    if (weight > 2500) {
                                        charge = 26.00 + (weight - 2500) / 500 * 3.50;
                                        price = charge * quantity;
                                    }
                                }
                                break;
                            case "Zone 5":
                                if (weight <= 2000) {
                                    if (weight <= 2000) {
                                        charge = 7.90 + (weight - 500) / 250 * 2.00;
                                        price = charge * quantity;
                                    }
                                    if (weight <= 500) {
                                        charge = 7.90;
                                        price = charge * quantity;
                                    }
                                }
                                if (weight > 2000) {
                                    if (weight <= 2500) {
                                        charge = 31.00;
                                        price = charge * quantity;
                                    }
                                    if (weight > 2500) {
                                        charge = 31.00 + (weight - 2500) / 500 * 4.00;
                                        price = charge * quantity;
                                    }
                                }
                                break;
                        }
                        break;

                    case "Same-Day Delivery":
                        switch (o) {
                            case "Local Town":
                                if (weight <= 500) {
                                    charge = 4.90 + 6.00;
                                    price = charge * quantity;
                                }
                                if (weight > 500 && weight <= 750) {
                                    charge = 5.70 + 6.00;
                                    price = charge * quantity;
                                }
                                if (weight > 750 && weight <= 1000) {
                                    charge = 6.50 + 6.00;
                                    price = charge * quantity;
                                }
                                break;
                            case "Cross Town":
                                if (weight <= 500) {
                                    charge = 5.40 + 7.50;
                                    price = charge * quantity;
                                }
                                if (weight > 500 && weight <= 750) {
                                    charge = 6.40 + 7.50;
                                    price = charge * quantity;
                                }
                                if (weight > 750 && weight <= 1000) {
                                    charge = 7.40 + 7.50;
                                    price = charge * quantity;
                                }
                                break;
                        }
                        break;
                    case "Prepaid Box":
                        switch (o) {
                            case "S":
                                charge = 13.78;
                                price = charge * quantity;
                                break;
                            case "M":
                                charge = 21.20;
                                price = charge * quantity;
                                break;
                            case "L":
                                charge = 31.80;
                                price = charge * quantity;
                                break;
                        }
                        break;
                    case "Envelope":
                        switch (o) {
                            case "S":
                                charge = 7.31;
                                price = charge * quantity;
                                break;
                            case "L":
                                charge = 10.49;
                                price = charge * quantity;
                                break;
                        }
                        break;
                    case "Pos Ekspres":
                        switch (o) {
                            case "LG":
                                charge = 3.18;
                                price = charge * quantity;
                                break;
                            case "LE (C5)":
                                charge = 3.71;
                                price = charge * quantity;
                                break;
                            case "LD (B4)":
                                charge = 4.77;
                                price = charge * quantity;
                                break;
                            case "LK":
                                charge = 7.42;
                                price = charge * quantity;
                                break;
                        }
                        break;
                }
                row[1] = comboBox.getSelectedItem();
                row[2] = textWeight.getText();
                row[3] = textField.getText();
                i++;
                row[0] = i;
                row[4] = comboBox1.getSelectedItem();
                row[5] = df2.format(price);
                model.addRow(row);
                textField.setText("");
                textWeight.setText("");
            }

        });


        table.addMouseListener(new MouseAdapter() {

            /**
             * This is mouse click event method.
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {

                int i = table.getSelectedRow();
            }
        });

        btnLogout.addActionListener(new ActionListener() {
            /**
             * This is button action event method.
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                new Cashierlogin();
                dispose();
            }
        });

        btnCheckOut.addActionListener(new ActionListener() {
            /**
             * This is button action event method.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df2 = new DecimalFormat("#.##");
                for (int i = 0; i < model.getRowCount(); i++) {
                    totalcharge += Double.parseDouble(model.getValueAt(i, 5).toString());
                }
                df2.format(totalcharge);

                JOptionPane.showMessageDialog(null, "Total: " + totalcharge);

                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                time1 = formatter.format(date);

                File file = new File("Receipt.txt");
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    try {
                        FileWriter fileWriter = new FileWriter(file, true);
                        List<String> totallist = Arrays.asList(time1 + ": RM" + totalcharge +
                                System.lineSeparator());
                        for (String totalcharge : totallist) {
                            fileWriter.append(totalcharge);
                        }
                        fileWriter.flush();
                        fileWriter.close();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    try {
                        FileWriter fileWriter = new FileWriter(file, true);
                        List<String> totallist = Arrays.asList(time1 + ": RM" + totalcharge +
                                System.lineSeparator());
                        for (String totalcharge : totallist) {
                            fileWriter.append(totalcharge);
                        }
                        fileWriter.flush();
                        fileWriter.close();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }

                new setCashReceipt();
                dispose();
            }
        });

        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(250);
        table.getColumnModel().getColumn(2).setPreferredWidth(130);
        table.getColumnModel().getColumn(3).setPreferredWidth(130);
        table.getColumnModel().getColumn(4).setPreferredWidth(130);
        table.getColumnModel().getColumn(5).setPreferredWidth(130);

        comboBox.addActionListener(new ActionListener() {
            /**
             * This is button action method.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String t = (String) comboBox.getSelectedItem();
                switch (t) {
                    case "Next-Day Delivery":
                        comboBox1.removeAllItems();
                        comboBox1.addItem("Zone 1");
                        comboBox1.addItem("Zone 2");
                        comboBox1.addItem("Zone 3");
                        comboBox1.addItem("Zone 4");
                        comboBox1.addItem("Zone 5");
                        break;
                    case "Same-Day Delivery":
                        comboBox1.removeAllItems();
                        comboBox1.addItem("Local Town");
                        comboBox1.addItem("Cross Town");
                        break;
                    case "Prepaid Box":
                        comboBox1.removeAllItems();
                        comboBox1.addItem("S");
                        comboBox1.addItem("M");
                        comboBox1.addItem("L");
                        break;
                    case "Envelope":
                        comboBox1.removeAllItems();
                        comboBox1.addItem("S");
                        comboBox1.addItem("L");
                        break;
                    case "Pos Ekspres":
                        comboBox1.removeAllItems();
                        comboBox1.addItem("LG");
                        comboBox1.addItem("LE (C5)");
                        comboBox1.addItem("LD (B4)");
                        comboBox1.addItem("LK");
                }
            }
        });

        add(pane);
        setTitle("Cash Receipt");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(550, 300, 900, 600);
        setLayout(null);
        setVisible(true);
        setResizable(false);

    }
}
