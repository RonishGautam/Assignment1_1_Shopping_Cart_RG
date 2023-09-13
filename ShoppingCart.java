/**
 * Represents a shopping cart that contains items.
 * This class implements the ShoppingCartADT interface.
 *
 * @author Ronish Gautam
 */
public class ShoppingCart implements ShoppingCartADT {

    /** Bag to store the items in the shopping cart. */
    private ArrayBag<ItemADT> items;

    /**
     * Default constructor that initializes the shopping cart with an empty bag of items.
     */
    public ShoppingCart() {
        this.items = new ArrayBag<>();
    }

    /**
     * Adds an item to the shopping cart.
     * @return true if the item was added successfully, false otherwise.
     */
    @Override
    public boolean addItem(ItemADT item) {
        return items.add(item);
    }

    /**
     * Removes an item from the shopping cart.
     *
     * @param item The item to be removed.
     * @return true if the item was removed successfully, false otherwise.
     */
    @Override
    public boolean removeItem(ItemADT item) {
        return items.remove(item);
    }

    /** Clears all the items from the shopping cart. */
    @Override
    public void clear() {
        items.clear();
    }

    /**
     * Calculates and returns the total price of all items in the shopping cart.
     *
     * @return The total price of all items in the shopping cart.
     */
    @Override
    public double getTotalPrice() {
        double total = 0;
        for (ItemADT item : items.toArray(new ItemADT[0])) {
            total += item.getprice();
        }
        return total;
    }

    /**
     * Returns the current size of the shopping cart.
     *
     * @return The number of items currently in the shopping cart.
     */
    @Override
    public int getCurrentSize() {
        return items.getCurrentSize();
    }

    /**
     * Returns the total number of items in the cart.
     *
     * @return The number of items currently in the shopping cart.
     */
    public int getItemCount() {
        return getCurrentSize();
    }

    /**
     * Returns the frequency of a specific item in the shopping cart.
     *
     * @param item The item for which the frequency is to be checked.
     * @return The frequency of the given item in the shopping cart.
     */
    public int getItemFrequency(ItemADT item) {
        return items.getFrequencyOf(item);
    }

    /**
     * Checks if a specific item is present in the shopping cart.
     *
     * @param item The item to be checked.
     * @return true if the item is present, false otherwise.
     */
    @Override
    public boolean contains(ItemADT item) {
        return items.contains(item);
    }

    /**
     * Returns an array representation of all the items in the shopping cart.
     *
     * @return An array containing all the items in the shopping cart.
     */
    @Override
    public ItemADT[] toArray() {
        return items.toArray(new ItemADT[0]);
    }

    /** 
     *  This method seems to be auto generated and needs proper implementation and documentation. 
     */
    @Override
    public String getcurrentsize() {
        return null;
    }

    /** 
     * TODO: This method seems to be auto generated and needs proper implementation and documentation. 
     */
    @Override
    public int getItemCount(ItemADT item) {
        return 0;
    }
}
