package my.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This is the class which we can set the items and save in File.
 *
 * @author Gan Wei Cai
 * @author Goh Deng Vee
 */
public class setItemList {

    /**
     * This constructor inherits the constructor of parent class
     *
     * @throws IOException = File Input Output Exception.
     */
    public setItemList() throws IOException {
        Item item1 = new Item("Next-Day Delivery", "Zone 1", "First 500gm:", 4.90);
        Item item2 = new Item("Next-Day Delivery", "Zone 1", "Subsequent 250gm:", 0.80);
        Item item3 = new Item("Next-Day Delivery", "Zone 1", "2.001-2.5kg:", 10.50);
        Item item4 = new Item("Next-Day Delivery", "Zone 1", "Subsequent 500gm:", 0.50);
        Item item5 = new Item("Next-Day Delivery", "Zone 2", "First 500gm:", 5.40);
        Item item6 = new Item("Next-Day Delivery", "Zone 2", "Subsequent 250gm:", 1.00);
        Item item7 = new Item("Next-Day Delivery", "Zone 2", "2.001-2.5kg:", 16.00);
        Item item8 = new Item("Next-Day Delivery", "Zone 2", "Subsequent 500gm:", 2.00);
        Item item9 = new Item("Next-Day Delivery", "Zone 3", "First 500gm:", 6.90);
        Item item10 = new Item("Next-Day Delivery", "Zone 3", "Subsequent 250gm:", 1.50);
        Item item11 = new Item("Next-Day Delivery", "Zone 3", "2.001-2.5kg:", 21.00);
        Item item12 = new Item("Next-Day Delivery", "Zone 3", "Subsequent 500gm:", 3.00);
        Item item13 = new Item("Next-Day Delivery", "Zone 4", "First 500gm:", 7.40);
        Item item14 = new Item("Next-Day Delivery", "Zone 4", "Subsequent 250gm:", 1.50);
        Item item15 = new Item("Next-Day Delivery", "Zone 4", "2.001-2.5kg:", 26.00);
        Item item16 = new Item("Next-Day Delivery", "Zone 4", "Subsequent 500gm:", 3.50);
        Item item17 = new Item("Next-Day Delivery", "Zone 5", "First 500gm:", 7.90);
        Item item18 = new Item("Next-Day Delivery", "Zone 5", "Subsequent 250gm:", 2.00);
        Item item19 = new Item("Next-Day Delivery", "Zone 5", "2.001-2.5kg:", 31.00);
        Item item20 = new Item("Next-Day Delivery", "Zone 5", "Subsequent 500gm:", 4.00);
        Item item21 = new Item("Same-Day Delivery", "Local Town", "Below 500gm:", 10.90);
        Item item22 = new Item("Same-Day Delivery", "Local Town", "500gm-750gm:", 11.70);
        Item item23 = new Item("Same-Day Delivery", "Local Town", "750gm-1kg:", 12.50);
        Item item24 = new Item("Same-Day Delivery", "Cross Town", "Below 500gm:", 12.90);
        Item item25 = new Item("Same-Day Delivery", "Cross Town", "500gm-750gm:", 13.90);
        Item item26 = new Item("Same-Day Delivery", "Cross Town", "750gm-1kg:", 14.90);
        Item item27 = new Item("Envelope", "S", "Max 500g:", 7.31);
        Item item28 = new Item("Envelope", "L", "Max 1kg:", 10.49);
        Item item29 = new Item("Prepaid Box", "S", "Max 2kg:", 13.78);
        Item item30 = new Item("Prepaid Box", "M", "Max 5kg:", 21.20);
        Item item31 = new Item("Prepaid Box", "L", "Max 19kg:", 31.80);
        Item item32 = new Item("Pos Ekspres", "LG", "Max 100g:", 3.18);
        Item item33 = new Item("Pos Ekspres", "LE(C5)", "Max 250:", 3.71);
        Item item34 = new Item("Pos Ekspres", "LD(B4)", "Max 500g:", 4.77);
        Item item35 = new Item("Pos Ekspres", "LK", "Max 1000g:", 7.42);


        ArrayList<Item> itemsList = new ArrayList<>();
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);
        itemsList.add(item5);
        itemsList.add(item6);
        itemsList.add(item7);
        itemsList.add(item8);
        itemsList.add(item9);
        itemsList.add(item10);
        itemsList.add(item11);
        itemsList.add(item12);
        itemsList.add(item13);
        itemsList.add(item14);
        itemsList.add(item15);
        itemsList.add(item16);
        itemsList.add(item17);
        itemsList.add(item18);
        itemsList.add(item19);
        itemsList.add(item20);
        itemsList.add(item21);
        itemsList.add(item22);
        itemsList.add(item23);
        itemsList.add(item24);
        itemsList.add(item25);
        itemsList.add(item26);
        itemsList.add(item27);
        itemsList.add(item28);
        itemsList.add(item29);
        itemsList.add(item30);
        itemsList.add(item31);
        itemsList.add(item32);
        itemsList.add(item33);
        itemsList.add(item34);
        itemsList.add(item35);


        File file = new File("Item.ser");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            try {
                FileWriter fileWriter = new FileWriter(file);
                for (Item s : itemsList) {
                    fileWriter.write(s + System.lineSeparator());
                }
                fileWriter.flush();
                fileWriter.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            try {
                FileWriter fileWriter = new FileWriter(file);
                for (Item s : itemsList) {
                    fileWriter.write(s + System.lineSeparator());
                }
                fileWriter.flush();
                fileWriter.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
