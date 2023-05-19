# Prime Number Checker

## Task

Write a program that checks if a given number is prime or not. The program should prompt the user to enter a positive integer and display whether it is a prime number or not.

## Starter Code

```java
import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        // Check if the number is prime

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

```