package assignments.ass1;
/*
* List class
*
* A List is an ordered collection of any kind of object specified in the parameter.
*
* Operations:
* addToEnd Add a given object to the end of the list.
* toString A String form of the objects in the list in order,
* enclosed in square brackets, separated by spaces.
*/
public class List<T> {
    private static final int INIT_LEN = 10;
    private T[] items; // the actual items
    private int numItems; // the number of items currently in the list
    /*
    * constructor: initialize the list to be empty
    */
    @SuppressWarnings("unchecked")
    public List() {
        items = (T[]) new Object[INIT_LEN];
        numItems = 0;
    }
    /*
    * AddToEnd
    *
    * Given: Object obj Do: Add obj to the end of the list.
    */
    public void addToEnd(T obj) {}
    /*
    * toString
    *
    * A String form of the objects in the list in order, enclosed in
    * square brackets, separated by spaces.
    */
    @Override
    public String toString() {
        return null; // REPLACE WITH YOUR CODE
    }
}