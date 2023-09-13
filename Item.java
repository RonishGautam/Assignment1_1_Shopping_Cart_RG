/**
 * Represents an individual item with a specified name and price.
 * This class provides methods to get and set the price, and to get the item name.
 * Implements the ItemADT interface.
 * 
 * @author Ronish Gautam
 */
public class Item implements ItemADT {
    
    /** The name of the item. */
    private String name;

    /** The price of the item. */
    private double price;

    /**
     * Constructs an Item instance with a specified name and price.
     *
     * @param name  The name of the item.
     * @param price The initial price of the item.
     */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Retrieves the name of the item.
     *
     * @return The name of the item.
     */
    @Override
    public String getItemName() {
        return name;
    }

    /**
     * Retrieves the current price of the item.
     *
     * @return The current price of the item.
     */
    @Override
    public double getprice() {
        return price;
    }

    /**
     * Updates the price of the item to the specified value.
     *
     * @param price The new price for the item.
     */
    @Override
    public void setprice(double price) {
        this.price = price;
    }
}
