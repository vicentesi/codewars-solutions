package _3kyu.fibonacci;

import java.math.BigInteger;

import org.example._3kyu.fibonacci.Fibonacci;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFib0() {
        testFib(0, 0);
    }

    @Test
    public void testFib1() {
        testFib(1, 1);
    }

    @Test
    public void testFib2() {
        testFib(1, 2);
    }

    @Test
    public void testFib3() {
        testFib(2, 3);
    }

    @Test
    public void testFib4() {
        testFib(3, 4);
    }

    @Test
    public void testFib5() {
        testFib(5, 5);
    }

    @Test
    public void testFib6() {
        testFib(-8, -6);
    }

    @Test
    public void testFib7() {
        testFib(new BigInteger("-51680708854858323072", 10), new BigInteger("51680708854858323072", 10));
    }

    private static void testFib(long expected, long input) {
        BigInteger found;
        try {
            found = Fibonacci.fib(BigInteger.valueOf(input));
        }
        catch (Throwable e) {
            // see https://github.com/Codewars/codewars.com/issues/21
            throw new AssertionError("exception during test: "+e, e);
        }
        assertEquals(BigInteger.valueOf(expected), found);
    }

    private static void testFib(BigInteger expected, BigInteger input) {
        BigInteger found;
        try {
            found = Fibonacci.fib(input);
        }
        catch (Throwable e) {
            // see https://github.com/Codewars/codewars.com/issues/21
            throw new AssertionError("exception during test: "+e, e);
        }
        assertEquals(expected, found);
    }

}