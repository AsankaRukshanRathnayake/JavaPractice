/*
This program will divide a given string into two parts.
 */

public class StringProcessor {
    public static void main(String[] args) {
        String fullname= "Asanka Rathnayake";
        String space=" ";

        String firstname, surname;

        firstname = fullname.substring(0,fullname.indexOf(space));
        surname = fullname.substring(fullname.indexOf(space)+1,fullname.length());

        System.out.println("First Name     : "+firstname);
        System.out.println("Surname        : "+surname);
    }
}
