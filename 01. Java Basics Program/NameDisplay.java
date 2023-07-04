/*
This program will take full name as user input and display it.
 */

import java.util.Scanner;
public class NameDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your fullname : ");
        String firstname = scanner.next();
        String middlename = scanner.next();
        String surname = scanner.next();

        System.out.println("Your name is : "+firstname+" "+middlename+" "+surname);



    }

}