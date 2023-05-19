# File Handling & Exception Handling

## Task

Create a Java program that reads data from a file and handles file-related exceptions. The program should read the contents of a text file and display its content on the console.

## Starter Code

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "data.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

```