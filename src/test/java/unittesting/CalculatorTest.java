package unittesting;

import com.helloworldconsulting.unittesting.Calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    static Calculator calc;

    @BeforeAll
    static void setup() {
        calc = new Calculator();
        System.out.println("Setting up Calculator instance");
    }

    @AfterAll
    static void tearDown() {
        calc = null;
        System.out.println("Test case completed");
    }

    @BeforeEach
    void reset() {
        calc.reset();
    }

    @AfterEach
    void resetAfter() {
        calc.reset();
    }

    @Test
    public void testAddition() {
        int result = calc.add(3, 5);
        assertEquals(8, result, "3 + 5 should be 8");
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calc.multiply(5, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }
}
