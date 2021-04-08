package my.example;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * This is Receipt Report class which can display the sales report in Frame.
 *
 * @author Gan Wei Cai
 * @author Goh Deng Vee
 */
public class receiptReport {
    /**
     * This constructor inherits the constructor of parent class
     */
    public receiptReport() {
        JFrame frame = new JFrame();

        JTextArea tarea = new JTextArea();
        tarea.setEditable(false);

        File file = new File("Receipt.txt");
        JScrollPane scrollableTextArea = new JScrollPane(tarea);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setBounds(40, 20, 300, 500);
        frame.add(scrollableTextArea);
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(
                    new FileInputStream(file)));
            tarea.read(input, "Receipt");
        } catch (Exception e) {
            e.printStackTrace();
        }

        frame.setTitle("Receipt Record");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setBounds(680, 300, 380, 580);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
