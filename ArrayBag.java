import java.util.Arrays;

/**
 * Represents a generic bag data structure implemented using an array.
 * The bag's capacity can be extended by user-defined logic if needed.
 *
 * @param <T> The generic type of items that the bag can store.
 * @author Ronish Gautam
 */
public class ArrayBag<T> {
    
    /** The default capacity for the internal array of the bag from the book. */
    private static final int DEFAULT_CAPACITY = 25;
    
    /** The array used to hold items in the bag. */
    private T[] bag;
    
    /** The current number of items stored in the bag. */
    private int numberOfEntries;

    /**
     * Constructs an ArrayBag with the default capacity.
     */
    @SuppressWarnings("unchecked")
    public ArrayBag() {
        bag = (T[]) new Object[DEFAULT_CAPACITY];
        numberOfEntries = 0;
    }

    /**
     * Adds a new item to the bag.
     *
     * @param entry The item to add to the bag.
     * @return true if the addition was successful, false if the bag is full.
     */
    public boolean add(T entry) {
        if (numberOfEntries < bag.length) {
            bag[numberOfEntries] = entry;
            numberOfEntries++;
            return true;
        } else {
            return false; // Logic to expand array can be added here if needed.
        }
    }

    /**
     * Removes a specific item from the bag, if present.
     *
     * @param entry The item to remove from the bag.
     * @return true if the item was successfully removed, false if the item is not in the bag.
     */
    public boolean remove(T entry) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (bag[i].equals(entry)) {
                bag[i] = bag[numberOfEntries - 1];
                bag[numberOfEntries - 1] = null;
                numberOfEntries--;
                return true;
            }
        }
        return false;
    }

    /** 
     * Clears all items from the bag.
     */
    public void clear() {
        for (int i = 0; i < numberOfEntries; i++) {
            bag[i] = null;
        }
        numberOfEntries = 0;
    }

    /**
     * Returns the current number of items in the bag.
     *
     * @return The integer count of items currently in the bag.
     */
    public int getCurrentSize() {
        return numberOfEntries;
    }

    /**
     * Counts the occurrences of a specific item in the bag.
     *
     * @param entry The item to be counted.
     * @return The number of times the item occurs in the bag.
     */
    public int getFrequencyOf(T entry) {
        int count = 0;
        for (int i = 0; i < numberOfEntries; i++) {
            if (bag[i].equals(entry)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Determines if the bag contains a specific item.
     * 
     * @param entry The item to search for.
     * @return true if the bag contains the item, false otherwise.
     */
    public boolean contains(T entry) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (bag[i].equals(entry)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Retrieves all items in the bag in an array format.
     * If the given array is too small to hold the items, a new array will be created.
     * 
     * @return An array of all items from the bag.
     */
    @SuppressWarnings("unchecked")
    public T[] toArray(T[] a) {
        if (a.length < numberOfEntries) {
            return (T[]) Arrays.copyOf(bag, numberOfEntries, a.getClass());
        }
        System.arraycopy(bag, 0, a, 0, numberOfEntries);
        if (a.length > numberOfEntries) {
            a[numberOfEntries] = null;
        }
        return a;
    }
}
