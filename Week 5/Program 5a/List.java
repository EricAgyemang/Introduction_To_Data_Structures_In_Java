/**
 * Interface for lists.
 */
public interface List {
    
    /**
     * Adds the object x to the end of the list.
     * @param x the element to be added to this list
     * @return true
     */
    public boolean add(Card x);
    
    /**
     * Adds the object x at the specified position
     * @param index the position to add the element
     * @param x the element to be added to the list
     * @return true if the operation succeeded, false otherwise
     * @throws IllegalArgumentException if index is invalid
     */
    public boolean add(int index, Card x);
    
    /**
     * Returns the number of elements in this list
     * @return the number of elements in this list
     */
    public int size();
    
    /**
     * Returns the element with the specified position in this list
     * @param index the position of the element
     * @return the element at the specified position in this list
     * @throws IllegalArgumentException if index is invalid
     */
    public Card get(int index);
    
    /**
     * Replaces the object at the specified position
     * @param index the position to replace
     * @param x the element to be stored
     * @return the previous value of the element at index
     * @throws IllegalArgumentException if index is invalid
     */
    public Card set(int index, Card x);
    
    /**
     * Removes the object at the specified position
     * @param index the position to remove
     * @return the object that was removed
     * @throws IllegalArgumentException if index is invalid
     */
    public Card remove(int index);
    
    /**
     * Tests if this list has no elements.
     * @return  <tt>true</tt> if this list has no elements;
     *          <tt>false</tt> otherwise.
     */
    public boolean isEmpty();
    
    /**
     * Returns <tt>true</tt> if this list contains the specified element.
     *
     * @param element element whose presence in this List is to be tested.
     * @return  <code>true</code> if the specified element is present;
     *  <code>false</code> otherwise.
     */
    public boolean contains(Card element);
    
    
    /** 
     * Returns the index of the specified element
     *
     * @param element the element we're looking for
     * @return the index of the element in the list, or -1 if it is not contained within the list
     */
    public int indexOf(Card element);
     
    
}