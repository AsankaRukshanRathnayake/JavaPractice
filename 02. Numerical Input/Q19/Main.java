/*
Input the user’s first, middle, and last name as three separate strings and
display the name in the order of the first name, the middle initial, and the last
name. Include the period after the middle initial. If the input strings are
Wolfgang, Amadeus, and Mozart, for example, then the ouput would be
Wolfgang A. Mozart. Use the console window for output.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User();

        System.out.print("Enter first name    : ");
        user.firstname = scanner.next();
        System.out.print("Enter middle name   : ");
        user.middlename = scanner.next();
        System.out.print("Enter last name     : ");
        user.lastname = scanner.next();

        System.out.println("");
        System.out.print("User : ");
        System.out.println(user.firstname+" "+user.middlename.substring(0,1)+". "+user.lastname);
        
    }
}
