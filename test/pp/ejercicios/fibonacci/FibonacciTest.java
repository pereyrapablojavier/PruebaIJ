package pp.ejercicios.fibonacci;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class FibonacciTest {

    Fibonacci f = new Fibonacci();

    @BeforeClass
    public static void before() {
        System.out.println("I'm before method.");
    }

    @AfterClass
    public static void after() {
        System.out.println("I'm after method.");
    }

    @Test
    public void fibonacci0() {
        f.setName("This is a fibonacci0 Test");
        int value = f.fibonacci(0);
        Assert.assertEquals(0, value);
    }

    @Test
    public void fibonacci1() {
        f.setName("This is a fibonacci1 Test");
        int value = f.fibonacci(1);
        Assert.assertEquals(1, value);
    }

    @Test
    public void fibonacci2() {
        f.setName("This is a fibonacci2 Test");
        int value = f.fibonacci(7);
        Assert.assertEquals(13, value);
    }

    @Test
    public void fibonacciString1() {
        f.setName("This is a fibonacciString1 Test");
        f.setSize(10);
        String result = f.showSeries();
        Assert.assertEquals("0 1 1 2 3 5 8 13 21 34", result);
    }

    @Test
    public void fibonacciString2() {
        f.setName("This is a fibonacciString2 Test");
        f.setSize(5);
        String result = f.showSeries();
        Assert.assertEquals("0 1 1 2 3", result);
    }
}