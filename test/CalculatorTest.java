import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testCalcMult() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2,3));
    }
}