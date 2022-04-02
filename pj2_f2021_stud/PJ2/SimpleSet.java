 /*************************************************************************************
 *
 * This class implements the SetInterface by using a ResizableArrayBag bag object.
 * ResizableArrayBag and BagInteface programs are given.
 *
 * Requirements:
 * 1. Implement SetInterface and toString() methods using a Bag object to hold data 
 * 2. Must not add new or modify existing data fields; must not add new public methods
 * 3. May add private methods
 *
 ************************************************************************************/

package PJ2;

public class SimpleSet<T> implements SetInterface<T> 
{
	private ResizableArrayBag<T> aBag;

        /*-------------------------------------------*/	
	/* The following 3 methods are done */

	/* Creates a set from a new, empty ResizableArrayBag. */
	public SimpleSet()
	{
		aBag = new ResizableArrayBag<T>();
	} // end default constructor

	public T[] toArray() 
	{
		return aBag.toArray();
	} // end toArray

	public boolean isEmpty() 
	{
		return aBag.isEmpty();
	} // end isEmpty

        /*-------------------------------------------*/	
	/* Implement all methods below */

	public boolean add(T newEntry)
	{
		return false;
		// implement this method!
	} // end add

	public int size() 
	{
		return 0;
		// implement this method!
	} // end size 

	public boolean contains(T anEntry)
	{
		return false;
		// implement this method!
	} // end contains

	public void clear() 
	{
		// implement this method!
	} // end clear

	public T remove()
	{
		return null;
		// implement this method!
	} // end remove

	public boolean remove(T anEntry) 
	{
		return false;
		// implement this method!
	} // end remove


        // for methods below, you will need to traverse set data
        // use toArray() method to get an array of all data

	public SetInterface<T> union(SetInterface<T> anotherSet)
	{
		return null;
		// implement this method!
	} // end union

	public SetInterface<T> intersection(SetInterface<T> anotherSet)
	{
		return null;
		// implement this method!
	} // end intersection

	public SetInterface<T> difference(SetInterface<T> anotherSet)
	{
		return null;
		// implement this method!
	} // end difference

	public boolean subset(SetInterface<T> anotherSet)
	{
		return false;
		// implement this method!
	} // end subset 


	// display set data in a string
        // example: for a set containing 4 data a, b, c, d
        //          return a string "{a, b, c, d}"
	public String toString()
   	{
		return null;
		// implement this method!
   	} // toString

} // end SimpleSet
