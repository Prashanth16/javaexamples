//Any integer is input through the keyboard. Write a program to find out whether it is an odd exchange_two_numbers
// or even number

import java.io.*;

public class exercise2 {
    public static void main(String[] args) throws Exception {
        int num;
        System.out.println("Enter the number");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        if (num % 2 == 0) {
            System.out.println("Number provided is even" + num);
        } else {
            System.out.println("Number provided is odd" + num);
        }
    }
}
