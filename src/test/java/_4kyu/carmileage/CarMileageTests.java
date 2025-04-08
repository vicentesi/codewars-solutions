package _4kyu.carmileage;

import org.example._4kyu.carmileage.CarMileage;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CarMileageTests {

    @Test
    public void testTooSmall() {
        assertEquals(0, CarMileage.isInteresting(3, new int[] { 1337, 256 }));
    }

    @Test
    public void testAlmostAwesome() {
        assertEquals(1, CarMileage.isInteresting(1336, new int[] { 1337, 256 }));
    }

    @Test
    public void testAwesome() {
        assertEquals(2, CarMileage.isInteresting(1337, new int[] { 1337, 256 }));
    }

    @Test
    public void testFarNotInteresting() {
        assertEquals(0, CarMileage.isInteresting(11208, new int[] { 1337, 256 }));
    }

    @Test
    public void testAlmostInteresting() {
        assertEquals(1, CarMileage.isInteresting(11209, new int[] { 1337, 256 }));
    }

    @Test
    public void testInteresting() {
        assertEquals(2, CarMileage.isInteresting(11211, new int[] { 1337, 256 }));
    }

    @Test
    public void testfollowedByZeros() {
        assertEquals(true, CarMileage.followedByZeros("1000"));
    }

    @Test
    public void testNotfollowedByZeros() {
        assertEquals(false, CarMileage.followedByZeros("1001"));
    }

    @Test
    public void testAllSame() {
        assertEquals(true, CarMileage.allSame("11111"));
    }

    @Test
    public void testNotAllSame() {
        assertEquals(false, CarMileage.allSame("111311"));
    }

    @Test
    public void testIsPalindrome() {
        assertEquals(true, CarMileage.isPalindrome("12321"));
    }

    @Test
    public void testIsNotPalindrome() {
        assertEquals(false, CarMileage.isPalindrome("123421"));
    }

    @Test
    public void testMatchArray() {
        assertEquals(true, CarMileage.matchArray(1337, new int[] { 1337, 256 }));
    }
}
