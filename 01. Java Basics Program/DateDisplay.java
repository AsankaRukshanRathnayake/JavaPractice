/*
This program displays the date in a specified format
 */

import java.text.SimpleDateFormat;
import java.util.*;
public class DateDisplay {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE : dd MMMM, yyyy");

        System.out.println("Today is "+simpleDateFormat.format(today));
    }

}
