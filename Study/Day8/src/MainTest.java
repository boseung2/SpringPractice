import org.junit.Test;

import java.util.Objects;
import java.util.Vector;

import static org.junit.Assert.*;

class TestClass {
    @Override
    public String toString() {
        return "test입니다";
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof TestClass)) {
            return false;
        }
        TestClass otherClass = (TestClass)obj;
        return this.toString() == otherClass.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.toString());
    }
}

public class MainTest {
    @Test
    public void addTest() {
        Vector v = new Vector();

        v.add("111");
        v.add(null);
        v.add("222");
        v.add(null);
        v.add(new TestClass());
        assertTrue(v.size() == 5);
        assertTrue(v.lastIndexOf(null) == 3);
        System.out.println(v.get(4));
    }

    @Test
    public void indexOfTest() {
        Vector v = new Vector();

        for(int i=0; i<10; i++) {
            v.add(i + "번째 값");
        }
        assertTrue(v.indexOf("4번째 값") == 4);
        //assertTrue(v.indexOf(4번째 값) == 4);
    }

    @Test
    public void getTest() {
        Vector v = new Vector();

        v.add(new TestClass());
        assertTrue(v.get(0).equals(new TestClass()));
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
        v.add(1);
        v.add(2);
        v.add(3);

        assertTrue(v.size() == 3);
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



}