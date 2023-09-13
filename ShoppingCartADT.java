public interface ShoppingCartADT {
	
	boolean addItem(ItemADT item);//Adds a specified item to the shopping cart.
	boolean removeItem(ItemADT item);//Removes a specified item from the shopping cart.
	
	void clear();//Clears all items from the shopping cart.
	
	
	double getTotalPrice();//Calculates and returns the total price of all items in the shopping cart.
	
	int getCurrentSize();//Returns the number of unique items in the shopping cart.
	
	int getItemCount();//Returns the total count of all items in the shopping cart, including duplicates.
	
	String getcurrentsize();//Returns the number of unique items in the shopping cart as a string.

	boolean contains(ItemADT item);
	
	ItemADT[] toArray();//Returns all items in the shopping cart as an array.
	int getItemCount(ItemADT item);
}
