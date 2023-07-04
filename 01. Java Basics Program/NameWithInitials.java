import java.util.Scanner;

public class NameWithInitials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name (first name, middle name, surname) : ");
        String firstname = scanner.next();
        String middlename = scanner.next();
        String surname = scanner.next();

        System.out.print("Name with initials : ");

        System.out.print(firstname.substring(0,1)+". ");
        System.out.print(middlename.substring(0,1)+". ");
        System.out.println(surname);


    }
}
