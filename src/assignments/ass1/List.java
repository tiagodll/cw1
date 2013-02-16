package assignments.ass1;

public class List<T> {
    private static final int INIT_LEN = 10;
    private T[] items; // the actual items
    private int numItems; // the number of items currently in the list
    private int currentObject;
    @SuppressWarnings("unchecked")
    public List() {

        items = (T[]) new Object[INIT_LEN];
        numItems = 0;
    }

    public void addToEnd(T obj) {
        if(numItems > items.length){
            T[] tmp = (T[]) new Object[2 * INIT_LEN];
            System.arraycopy(items, 0, tmp, 0, numItems);
            items = tmp;
        }
        items[numItems++] = obj;
    }

    @Override
    public String toString() {
        if(numItems == 0) return "[]";
        else{
            String result = "[";
            for(int i=0; i<numItems; i++){
                result = result + items[i].toString() + " ";
            }
            return result + "]";
        }
    }

    public T get(int i) {
        return items[i];
    }
    public void firstElement(){ currentObject=0; }
    public T nextElement(){ return items[currentObject++]; }
    public boolean hasMoreElements(){ return currentObject<numItems; }

    //testing the methods
    public static void main(String[] args){
        // create a list of Strings
        List<String> l = new List<>();
        l.addToEnd("Fred");
        l.addToEnd("Betty");
        l.addToEnd("Judith");
        System.out.println(l);

        l.firstElement();
        while (l.hasMoreElements()) {
            System.out.println("nextElement: " + l.nextElement());
        }

        List<String> l2 = new List<>();
        while (l2.hasMoreElements()) {
            System.out.println("nextElement: " + l2.nextElement());
        }
    }
}





















