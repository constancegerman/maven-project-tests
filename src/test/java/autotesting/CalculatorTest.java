package autotesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void whenAddTenToFiveThenResultFifteen() {
        double expected = 15;
        double actual = calculator.add(10, 5);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void when5AddTo10AsStringThenResult15() {
        double expected = 15;
        double actual = calculator.add("10", "5");
        assertEquals(expected, actual, 0.001);
    }

    @Test (expected = Exception.class)
    public void whenInputIncorrectValueThenThrowException() {
        calculator.add("ddddddd", "5");
    }

    @Test
    public void whenAdd100To50ThenResult150() {
        double expected2 = 150;
        double actual2 = calculator.add(100, 50);
        assertEquals(expected2, actual2, 0.001);
    }

    @Test
    public void whenMultiple3To9ThenResult27() {
        double expected = 27;
        double actual = calculator.multiple(3, 9);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void whenDivide40To8ThenResult5() {
        double expected = 5;
        double actual = calculator.divide(40, 8);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void when50DivideTo10AsStringThenResult5() {
        double expected = 5;
        double actual = calculator.divide("50", "10");
        assertEquals(expected, actual, 0.001);
    }

    @Test (expected = Exception.class)
    public void whenInputIncorrectValueThenException() {
        calculator.divide("ddddddd", "10");
    }

    @Test
    public void whenPow2To5ThenResult32() {
        double expected = 32;
        double actual = calculator.powOperation(2, 5);
        assertEquals(expected, actual, 0.001);
    }

    @After
    public void close() {
        calculator = null;
    }
}