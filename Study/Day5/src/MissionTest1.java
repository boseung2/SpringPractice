import org.junit.Test;

import static org.junit.Assert.*;

public class MissionTest1 {
//        int mid(int x, int y, int z) {
//            if( x <= y) {
//                if( z >= y) {
//                    return y;
//                }else if(z <= x){
//                    return x;
//                }else {
//                    return z;
//                }
//            }else if( z >= x) {
//                return x;
//            }else if( z <= y) {
//                return y;
//            }else {
//                return z;
//            }
//        }
    int mid(int x, int y, int z) {
        if( (x <= y && y <= z) || (z <= y && y <= x)) {
            return y;
        }else if( (x <= z && z <= y) || (y <= z && z <= x)) {
            return z;
        }else {
            return x;
        }
    }

        @Test public void midTest1() {
            assertTrue(mid(1, 2, 3) ==2 );
        }

        @Test public void midTest2() {
            assertTrue(mid(1, 1, 1) == 1);
        }

        @Test public void midTest3() {
            assertTrue(mid(2, 3, 1) == 2);
        }

        @Test public void midTest4() {
            assertTrue(mid(2, 1, 1) == 1);
        }
        @Test public void midTest11() {
            assertTrue(mid(3, 2, 1) == 2);
        }
        @Test public void midTest12() {
            assertTrue(mid(3, 2, 2) == 2);
        }
        @Test public void midTest13() {
            assertTrue(mid(3, 1, 2) == 2);
        }
        @Test public void midTest14() {
            assertTrue(mid(3, 2, 3) == 3);
        }
        @Test public void midTest15() {
            assertTrue(mid(2, 1, 3) == 2);
        }
        @Test public void midTest16() {
            assertTrue(mid(3, 3, 2) == 3);
        }
        @Test public void midTest17() {
            assertTrue(mid(3, 3, 3) == 3);
        }
        @Test public void midTest18() {
            assertTrue(mid(2, 2, 3) == 2);
        }
        @Test public void midTest19() {
            assertTrue(mid(2, 3, 1) == 2);
        }
        @Test public void midTest20() {
            assertTrue(mid(2, 3, 2) == 2);
        }
        @Test public void midTest21() {
            assertTrue(mid(1, 3, 2) == 2);
        }
        @Test public void midTest22() {
            assertTrue(mid(2, 3, 3) == 3);
        }
        @Test public void midTest23() {
            assertTrue(mid(1, 2, 3) == 2);
        }
}