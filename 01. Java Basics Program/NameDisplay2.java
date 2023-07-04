
/*
This program will take full name as user input and display it.
We use delimiter
 */

import java.util.Scanner;

public class NameDisplay2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineSeparator = System.getProperty("line.seperator");
        scanner.useDelimiter(lineSeparator);

        System.out.println("Enter your full name : ");
        String fullname = scanner.next();

        System.out.println("Your name is : "+fullname);

    }
}
