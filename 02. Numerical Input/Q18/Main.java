/*
Input the user’s first and last name as two separate strings. Then display a
frame window with its title set to <last>, <first>, where <last> and <first> are
the input values. For example, if the input values are Johann and Strauss,
then the title would be Strauss, Johann.
 */

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User();

        System.out.print("Enter firstname : ");
        user.firstname = scanner.next();
        System.out.print("Enter lastname  : ");
        user.lastname = scanner.next();

        JFrame window = new JFrame();
        window.setSize(800,600);
        window.setTitle(user.lastname+", "+user.firstname );
        window.setVisible(true);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
