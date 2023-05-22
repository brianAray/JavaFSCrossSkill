import java.util.Scanner;

public class PatternPrinting {
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.print("Enter the number of rows: ");
    //     int numRows = scanner.nextInt();

    //     // Print the pattern
    //     for(int i = 0; i < numRows; i++){
    //         for (int j = 0; j <= i; j++){
    //             System.out.print('*');
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        String output = "";

        if(numRows > 0) {
            for (int i = 0; i < numRows; i++) {
                output += "*";
                System.out.println(output);
            }
        }
    }
}