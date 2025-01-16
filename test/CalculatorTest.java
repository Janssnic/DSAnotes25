import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testCalcMult() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2,3));
    }
    @Test
    void testCalcMultWithThree() {
        Calculator calc = new Calculator();
        assertEquals(24, calc.multiply(2,3,4));
    }

}