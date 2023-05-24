import com.revature.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class CalculatorTest {

    @Mock
    private Calculator calculator;

    @Test
    void testAdd(){
        // Create a mock object
        calculator = mock(Calculator.class);

        // Define behavior of the mock object
        when(calculator.add(2, 3)).thenReturn(5);

        // Call the method being tested
        int result = calculator.add(2, 3);

        // Verify the methods was called and check the result
        // Verify is used to check if a method was called on mock objects during the test
        verify(calculator).add(2, 3);

        Assertions.assertEquals(5, result);
    }
}
