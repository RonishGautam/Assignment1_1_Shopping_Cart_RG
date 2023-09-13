/**

 * 
 * In this application class which is main class their is:
 * 
 * Multiple items are created and added to a shopping cart.
 * Items are displayed and the total price is computed.
 * Some items are then removed from the cart.
 * The remaining items are displayed along with their frequency and the updated total price.
 * 
 * @author Ronish Gautam
 */
public class Application {

    /**
     * The entry point of the application. Demonstrates the operations on the ShoppingCart.
     * 
     * @param args Command line arguments (not used in this application).
     */
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("Apple", 1.50);
        Item item2 = new Item("Banana", 2.00);
        Item item3 = new Item("Cherry", 5.00);
        Item item4 = new Item("Cupcake", 1.5);
        Item item5 = new Item("Egg", 3.50);

        // Adding items multiple times to simulate quantity
        cart.addItem(item1);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
        cart.addItem(item4);
        cart.addItem(item4);
        cart.addItem(item5);
        cart.addItem(item5);
        cart.addItem(item5);

        System.out.println("Items added:");
        for (ItemADT item : cart.toArray()) {
            System.out.println(item.getItemName() + " - " + item.getprice());
        }
        
        // Showing item count and content before removal
        System.out.println("\nTotal items count before removal: " + cart.getItemCount());
        System.out.println("Unique items count before removal: " + cart.getCurrentSize());

        System.out.println("\nTotal price of items before removal: " + cart.getTotalPrice());

        // Removing items
        cart.removeItem(item3); // Removing one Cherry
        cart.removeItem(item4); // Removing one Cupcake
        cart.removeItem(item4); // Removing another Cupcake
        cart.removeItem(item5); // Removing one Egg

        System.out.println("\nItems after removal:");
        for (ItemADT item : cart.toArray()) {
            System.out.println(item.getItemName() + " - " + item.getprice());
        }

        System.out.println("\nTotal items count: " + cart.getItemCount());
        System.out.println("Unique items count: " + cart.getCurrentSize());
        System.out.println("Count of Apple: " + cart.getItemFrequency(item1));
        System.out.println("Count of Cupcake: " + cart.getItemFrequency(item4));
        System.out.println("Count of Egg: "+ cart.getItemFrequency(item5));
        
        System.out.println("\nTotal price of items after removal: " + cart.getTotalPrice());
    }
}
