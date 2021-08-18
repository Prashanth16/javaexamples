// Write a program to find the absolute value of a number that is entered through the input
// keyboard

import java.io.*;

public class exercise3 {
    public static void main(String[] args) throws Exception {
        int num;
        System.out.println("Enter the number");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        System.out.println("Absolute number of num" + " " + "is" + Math.abs(num));

    }
}
