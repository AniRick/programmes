
import java.io.*;
import java.util.*;

public class O11_number_of_days_in_year {

    public static void main(String args[]) {

        int month, year;
        month = 12;
        year = 2012;
        if ((month == 2) && ((year % 4 == 0) || ((year % 100 == 0) && (year % 400 == 0))))
            System.out.println("Number of days is 29");

        else if (month == 2)
            System.out.println("Number of days is 28");

        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.println("Number of days is 31");

        else
            System.out.println("Number of days is 30");

    }

}