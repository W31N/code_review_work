import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(-6, 5);
        assertEquals(-1, result);
    }

    @Test
    void dif() {
        Calculator calculator = new Calculator();
        int result = calculator.dif(0, 5);
        assertEquals(-5, result);
    }

    @Test
    void divByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.div(10, 0);
        });
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        int result = calculator.div(18, 6);
        assertEquals(3, result);
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        int result = calculator.times(5, 6);
        assertEquals(30, result);
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();
        int result = calculator.solver(5, 8, 3);
        assertEquals(143, result);
    }
}