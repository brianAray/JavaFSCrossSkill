import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        // Check if the number is prime

        // They are only divisible by 1 and itself
        // for loop

        for (int i = 2; i < number; i++){
            // condition to check
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}