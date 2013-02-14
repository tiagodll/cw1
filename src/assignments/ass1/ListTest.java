package assignments.ass1;

/**
 * Created with IntelliJ IDEA.
 * User: tiagodll
 * Date: 14/02/2013
 * Time: 20:10
 * To change this template use File | Settings | File Templates.
 */
public class ListTest extends junit.framework.TestCase {

    List<Integer> items;

    public void setUp() throws Exception {
        super.setUp();
        items = new List<Integer>();
    }

    public void tearDown() throws Exception {
        items = null;
    }

    public void testAddToEnd() throws Exception {
        items.addToEnd(5);
        items.addToEnd(6);
        assertEquals(6, (Object) items.get(1));
    }

    public void testToString() throws Exception {
        items.addToEnd(5);
        items.addToEnd(6);
        assertEquals("[5 6 ]", items.toString());
    }
}
