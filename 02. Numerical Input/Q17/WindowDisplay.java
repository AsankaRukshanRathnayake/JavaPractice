/*
A program that displays a frame window of
800 pixels wide and 600 pixels high.
Title : Welcome to Java
 */

import javax.swing.*;
public class WindowDisplay {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame();

        myWindow.setSize(800,600);
        myWindow.setTitle("Welcome to Java");
        myWindow.setVisible(true);

        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
