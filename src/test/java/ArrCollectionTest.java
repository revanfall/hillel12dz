import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrCollectionTest {

    private ArrCollection arrCollection;
    private ArrCollection arrCollection2;

    @Before
    public void initTest(){
        arrCollection=new ArrCollection();
        arrCollection.add("1");
        arrCollection.add("2");
        arrCollection.add("3");
        arrCollection2=new ArrCollection();
        arrCollection2.add("1");
        arrCollection2.add("2");
        arrCollection2.add("3");
    }


    @Test
    public void add() {
        assertEquals(true,arrCollection.add("avcd"));

    }



@Test(expected = ArrayIndexOutOfBoundsException.class)
public void addAll(){
        assertEquals(true,arrCollection.addAll(arrCollection2));
}
    @Test
    public void delete() {
        Assert.assertEquals(true,arrCollection.delete(3));
    }



    @Test
    public void get() {
        assertEquals("2",arrCollection.get(1));
    }

    @Test
    public void contains() {
        assertEquals(false,arrCollection.contains("avcd"));
    }

    @Test
    public void clear() {
        assertEquals(true,arrCollection.clear());
    }

    @Test
    public void size() {
        assertEquals(3,arrCollection.size());
    }



    @Test
    public void compare() {
        assertEquals(true,arrCollection.compare(arrCollection2));
    }

    @Test
    public void getCount() {
        assertEquals(3,arrCollection.getCount());
    }
}