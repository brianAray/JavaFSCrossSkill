# Test Code

## Task

Given the following code, test it fully using JUnit 5

## Code

```java
public class StringUtil {
    public static String reverse(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }
        String reversed = reverse(str);
        return str.equals(reversed);
    }
}
```