import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void whenAddTenToFiveThenResultFifteen(){
        double expected = 15;
        double result = calculator.add(10, 5);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void when5AddTo10AsStringThenResult15(){
        double expected = 15;
        double result = calculator.add("10", "5");
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void whenInputIncorrectValueThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.add("asdasdasd", "5");
        });
    }

    @Test
    void add() {
        double expected2 = 150;
        double result2 = calculator.add(100, 50);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    void multi(){
        double expected = 4;
        double result = calculator.multi(2, 2);
        assertEquals(expected, result);

        double expected2 = 16;
        double result2 = calculator.multi(4, 4);
        assertEquals(expected2, result2);
    }

    @Test
    void minus(){
        Calculator calculator = new Calculator();
        int expected = 2;
        int result = calculator.minus(4, 2);
        assertEquals(expected, result);

        int expected2 = 5;
        int result2 = calculator.minus(10, 5);
        assertEquals(expected2, result2);
    }

    @Test
    void divide(){
        double expected = 2;
        double result = calculator.divide(10, 5);
        assertEquals(expected, result);

        double expected2 = 4.0;
        double result2 = calculator.divide(16, 4);
        assertEquals(expected2, result2);

        assertThrows(ArithmeticException.class, ()->{
            calculator.divide(10, 0);
        });
    }
}