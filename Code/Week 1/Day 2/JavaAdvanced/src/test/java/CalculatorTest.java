
/*

 */

import com.revature.testing.Calculator;
import com.revature.testing.DivideByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/*
JUnit is a popular uit testing framework from Java
It is used to run automated tests, and simplify the testing process

1. Test Cases
    - a test case is a unit of testing that checks the behavior of a specific piece of code or method
    - each test case typically focuses on a single scenario or functionality to be tested

2. Test Fixtures
    - A test fixture is a set of preconditions or setup required for a test case to run
    - It involves creating objects, initializing variable, or preparing the environment for testing

3. Test Method
    - A test method is a method within a test case class that actually contains the test logic
    - It uses assertions to verify expected behavior and compares the actual results with the expected results

4. Assertions
    - Assertions are used to validate expected conditions in a test method
    - There is a wide range of assertions that we can use to check any kind of behavior
    - assertEquals(), assertTrue(), assertFalse(), assertNull(), assertNotNull(), etc.

5. Test Annotations
    - JUnit uses annotations to mark methods as test methods and to define the test execution order
    - @Test
        - Marks a method as a test method
    - @BeforeEach
        - Specifies a method to be executed before each test method
    - @AfterEach
        - Specifies a method to be executed after each test method
    - @BeforeAll // setup stage
        - Specifies a method to be executed before all tests
    - @AfterAll // tear down stage
        - Specifies a method to be executed after all tests
 */
public class CalculatorTest {

    // bring the thing that needs to be tested
    private Calculator calculator;


    // Setup the testing environment
    // i.e. instantiate the calculator
    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testAddition(){
        int result = calculator.add(2,4);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testSubtraction(){
        int result = calculator.subtract(5, 1);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testMultiplication(){
        int result = calculator.multiply(3, 3);
        Assertions.assertEquals(9, result);
    }

    @Test
    public void testDivision() throws DivideByZeroException{
        int result = calculator.divide(10, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testDivisionByZeroException(){
        Assertions.assertThrows(
                DivideByZeroException.class,
                () -> calculator.divide(10, 0)
        );
    }
}
