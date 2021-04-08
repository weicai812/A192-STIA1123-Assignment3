package my.example;

import java.io.Serializable;

/**
 * This is Item class which to create the items
 *
 * @author Gan Wei Cai
 * @author Goh Deng Vee
 */
public class Item implements Serializable {
    private String itemtype;
    private String options;
    private String weight;
    private double price;

    /**
     * This constructor inherits the constructor of parent class
     * This is to set the detail of the delivery
     *
     * @param itemtype= Type of Delivery
     * @param options=  Specific Options
     * @param weight=   The maximum weight of the item
     * @param price=    The price of the delivery depend on weight.
     */
    public Item(String itemtype, String options, String weight, double price) {
        this.itemtype = itemtype;
        this.options = options;
        this.weight = weight;
        this.price = price;
    }

    /**
     * This is getter and display in String.
     *
     * @return itemtype, option, weight, price
     */
    public String toString() {
        return itemtype + " " + options + " " + weight + " " + price;
    }
}
