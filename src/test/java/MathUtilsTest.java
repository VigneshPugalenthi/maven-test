import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    MathUtils calculator;

    @BeforeEach
    void setUp() {
        calculator = new MathUtils();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void subtract() {
        assertEquals(-2, calculator.subtract(2, 4));
    }

    @Test
    void multiply() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    void divide() {
        assertEquals(-1.0, calculator.divide(2, 0));
    }
}