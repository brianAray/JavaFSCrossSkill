# Calculator Application

## Task
Create a calculator application that performs basic arithmetic operations. It should prompt the user for two numbers and an operator (+, -, *, /), and then display the result of the operation.

## Starter Code

```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0.0;

        // Perform the calculation based on the operator

        System.out.println("Result: " + result);
    }
}
```