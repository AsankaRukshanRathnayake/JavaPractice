/*
This program will display a window
 */

import javax.swing.*;

public class MyWindow {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame();

        myWindow.setSize(800,400);
        myWindow.setTitle("Hello");
        myWindow.setVisible(true);

        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
