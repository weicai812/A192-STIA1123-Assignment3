package my.example;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * This is the Item list class which can let the user to display the items.
 *
 * @author Gan Wei Cai
 * @author Goh Deng Vee
 */
public class printItemList extends JFrame {
    /**
     * This constructor inherits the constructor of parent class
     */
    public printItemList() {
        JFrame frame = new JFrame();

        JTextArea tarea = new JTextArea();
        tarea.setEditable(false);

        File file = new File("Item.ser");
        JScrollPane scrollableTextArea = new JScrollPane(tarea);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setBounds(40, 20, 350, 500);
        frame.add(scrollableTextArea);
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(
                    new FileInputStream(file)));
            tarea.read(input, "Item");
        } catch (Exception e) {
            e.printStackTrace();
        }

        frame.setTitle("Item List");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setBounds(680, 300, 430, 580);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}