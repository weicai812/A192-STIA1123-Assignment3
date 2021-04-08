package my.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This is the Receipt Class which can let the user to print the receipt in terminal.
 * This don't have GUI so it could not display in Frame.
 *
 * @author Gan Wei Cai
 * @author Goh Deng Vee
 */
public class receiptrecord {
    /**
     * This constructor inherits the constructor of parent class
     */
    public receiptrecord() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("Receipt.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
