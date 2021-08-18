// Leap year or not //

import java.io.*;

public class leapyear {
    public static void main(String[] args) throws Exception {
        int year;
        System.out.println("Enter the year");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        year = Integer.parseInt(br.readLine());
        if ((year % 4 == 0) || (year % 400 == 0)) {
            System.out.println("Entered year is a leap year" + year);
        } else {
            System.out.println("Entered year is not a leap year" + year);
        }
    }
}
