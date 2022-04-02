
/**
   A class that implements a bag of objects by using an array.
	The bag is never full.
   @author Frank M. Carrano, Timothy M. Henry
   @version 5.1

   ** Do not modfiy this file
*/

package PJ2;
import java.util.Arrays;

public final class ResizableArrayBag<T> implements BagInterface<T>
{
	private T[] bag; // Cannot be final due to doubling
	private int numberOfEntries;
	private static final int DEFAULT_CAPACITY = 25; // Initial capacity of bag
	private static final int MAX_CAPACITY = 10000;

	/** Creates an empty bag whose initial capacity is 25. */
	public ResizableArrayBag() 
	{
		this(DEFAULT_CAPACITY);
	} // end default constructor

	/** Creates an empty bag having a given initial capacity.
	    @param initialCapacity  The integer capacity desired. */
	public ResizableArrayBag(int initialCapacity)
	{
      
      		// The cast is safe because the new array contains null entries
      		@SuppressWarnings("unchecked")
      		T[] tempBag = (T[])new Object[initialCapacity]; // Unchecked cast
      		bag = tempBag;
      		numberOfEntries = 0;
	} // end constructor

       
	/** Adds a new entry to this bag.
       	    @param newEntry  The object to be added as a new entry.
       	    @return  True. */
	public boolean add(T newEntry)
	{
      		if (isArrayFull())
         		doubleCapacity();
      
      		bag[numberOfEntries] = newEntry;
      		numberOfEntries++;
      
      		return true;
	} // end add

	/** Retrieves all entries that are in this bag.
       	    @return  A newly allocated array of all the entries in this bag. */
	public T[] toArray() 
	{
      
      		// The cast is safe because the new array contains null entries.
      		@SuppressWarnings("unchecked")
      		T[] result = (T[])new Object[numberOfEntries]; // Unchecked cast
      		for (int index = 0; index < numberOfEntries; index++)
         		result[index] = bag[index];
      
      		return result;
	} // end toArray
   
	/** Sees whether this bag is empty.
            @return  True if this bag is empty, or false if not. */
	public boolean isEmpty()
	{
      		return numberOfEntries == 0;
	} // end isEmpty
   
	/** Gets the current number of entries in this bag.
            @return  The integer number of entries currently in this bag. */
	public int getCurrentSize()
	{
      		return numberOfEntries;
	} // end getCurrentSize
   
	/** Counts the number of times a given entry appears in this bag.
            @param anEntry  The entry to be counted.
            @return  The number of times anEntry appears in this ba. */
	public int getFrequencyOf(T anEntry)
	{
      		int counter = 0;
      		for (int index = 0; index < numberOfEntries; index++)
         		if (anEntry.equals(bag[index]))
            			counter++;
      		return counter;
	} // end getFrequencyOf
   
	/** Tests whether this bag contains a given entry.
            @param anEntry  The entry to locate.
            @return  True if this bag contains anEntry, or false otherwise. */
   	public boolean contains(T anEntry)
	{
      		return getIndexOf(anEntry) > -1; // or >= 0
	} // end contains
   
	/** Removes all entries from this bag. */
	public void clear()
	{
      		while (!isEmpty())
         		remove();
	} // end clear
	
	/** Removes one unspecified entry from this bag, if possible.
            @return  Either the removed entry, if the removal
       		     was successful, or null. */
	public T remove()
	{
      		T result = removeEntry(numberOfEntries - 1);
      		return result;
	} // end remove
	
	/** Removes one occurrence of a given entry from this bag.
            @param anEntry  The entry to be removed.
            @return  True if the removal was successful, or false if not. */
	public boolean remove(T anEntry)
	{
      		int index = getIndexOf(anEntry);
      		T result = removeEntry(index);
      		return anEntry.equals(result);
	} // end remove
   
	//** private methods **//

	
 	// Locates a given entry within the array bag.
	// Returns the index of the entry, if located,
	// or -1 otherwise.
	private int getIndexOf(T anEntry)
	{
		int where = -1;
		boolean found = false;
		int index = 0;
      
      		while (!found && (index < numberOfEntries))
		{
			if (anEntry.equals(bag[index]))
			{
				found = true;
				where = index;
			} // end if
         		index++;
		} // end while
		return where;
	} // end getIndexOf
   
   	// Removes and returns the entry at a given index within the array.
   	// If no such entry exists, returns null.
   	// Precondition: 0 <= givenIndex < numberOfEntries.
   	// Precondition: checkintegrity has been called.
	private T removeEntry(int givenIndex)
	{
		T result = null;
      
		if (!isEmpty() && (givenIndex >= 0))
		{
         		result = bag[givenIndex];          // Entry to remove
         		int lastIndex = numberOfEntries - 1;
         		bag[givenIndex] = bag[lastIndex];  // Replace entry to remove with last entry
         		bag[lastIndex] = null;             // Remove reference to last entry
         		numberOfEntries--;
		} // end if
      
      		return result;
	} // end removeEntry
   
   	// Returns true if the array bag is full, or false if not.
	private boolean isArrayFull()
	{
		return numberOfEntries >= bag.length;
	} // end isArrayFull
   
   	// Doubles the size of the array bag.
   	// Precondition: checkintegrity has been called.
	private void doubleCapacity()
	{
      		int newLength = 2 * bag.length;
      		bag = Arrays.copyOf(bag, newLength);
	} // end doubleCapacity
   
   
} // end ResizableArrayBag


