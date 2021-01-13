import org.junit.Test;
import java.util.Vector;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void addTest() {
        Vector v = new Vector();

        v.add("111");
        v.add(null);
        v.add("222");
        v.add(null);
        assertTrue(v.size() == 4);
        assertTrue(v.lastIndexOf(null) == 3);
        System.out.println(v.get(3));
    }

    @Test
    public void indexOfTest() {
        Vector v = new Vector();

        for(int i=0; i<10; i++) {
            v.add(i + "번째 값");
        }
        v.add(null);
        assertTrue(v.indexOf("4번째 값") == 4);
        System.out.println(v.indexOf(null));
        assertTrue(v.indexOf(null) == 10);
    }

    @Test
    public void getTest() {
        Vector v = new Vector();
    }

    @Test
    public void setTest() {
        Vector v = new Vector();
        v.add(0);
        v.add(1);
        v.add("2");
        v.set(1, 5);
        assertTrue(v.get(0) == Integer.valueOf(0));
        assertTrue(v.get(0) == Integer.valueOf(0));
        assertTrue(v.get(1) == Integer.valueOf(5));
        assertTrue(v.indexOf(5) == 1);
        //assertTrue(v.indexOf(5) == Integer.valueOf(1));
        assertTrue(v.get(2) == "2");
        assertTrue(v.get(2) == String.valueOf("2"));
    }

    @Test
    public void sizeTest() {
        Vector v = new Vector();
        assertTrue(v.size()==0);
        v.add(null);
        assertTrue(v.size()==1);
        v.remove(0);
        assertTrue(v.size()==0);
    }

    @Test
    public void isEmptyTest() {
        Vector v = new Vector();
        Vector v2 = new Vector();
        v2.add(100);
        assertTrue(v.isEmpty() == true);
        assertTrue(v2.isEmpty() == false);
    }

    public void capacityTest() {
        Vector v = new Vector(20);
        assertTrue(v.capacity() == 20);
    }

    @Test
    public void indexOfTest2(){

        MyVector v = new MyVector(100);

        v.add("abc");

        v.add("123");

        v.add(null);

        v.add("zzz");

        System.out.println(v.indexOf("abc"));
        assertTrue(v.indexOf("abc")==0);
//        System.out.println(v.indexOf("xxx"));
//        assertTrue(v.indexOf("xxx")==-1);
        System.out.println(v.indexOf(null));
        assertTrue(v.indexOf(null)==2);

    }

    @Test
    public void indexOfText3() {
        MyVector v = new MyVector();
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(null);
        assertTrue(v.indexOf(null) == 3);
    }

    @Test
    public void indexOfText4() {
        MyVector v = new MyVector();
        v.add("1");
        v.add("1");
        v.add("1");
        v.add(null);
        assertTrue(v.indexOf(null) == 3);
    }


}