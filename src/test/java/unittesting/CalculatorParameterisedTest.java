package unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.helloworldconsulting.unittesting.Calculator;

public class CalculatorParameterisedTest {

    static Calculator calc;

    @BeforeAll
    static void setup() {
        calc = new Calculator();
        System.out.println("Setting up Calculator instance");
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void testAdditionByAddingZero(int number) {
        assertEquals(number, calc.add(number, 0), number + " + 0 should be " + number);
    }

    @ParameterizedTest
    @CsvSource({"5, 3, 2", "10, 7, 3", "15, 5, 10"})
    void testSubtraction(int a, int b, int expected) {
        assertEquals(expected, calc.subtract(a, b), a + " - " + b + " should be " + expected);
    }

    @ParameterizedTest
    @CsvSource({"2, 3, 6", "4, 5, 20", "6, 7, 42"})
    void testMultiplication(int a, int b, int expected) {
        assertEquals(expected, calc.multiply(a, b), a + " * " + b + " should be " + expected);
    }

    static Stream<int[]> divisionProvider() {
        return Stream.of(new int[]{10, 2, 5}, new int[]{20, 4, 5}, new int[]{30, 3, 10});
    }

    @ParameterizedTest
    @MethodSource("divisionProvider")
    void testDivision(int[] data) {
        assertEquals(data[2], calc.divide(data[0], data[1]), data[0] + " / " + data[1] + " should be " + data[2]);
    }

}
