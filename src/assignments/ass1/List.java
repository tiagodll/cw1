package assignments.ass1;


public class List<T> {
    private static final int INIT_LEN = 10;
    private T[] items; // the actual items
    private int numItems; // the number of items currently in the list

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
}























