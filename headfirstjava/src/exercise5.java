
// Write a Program to check whether a triangle is valid or not,when
// the three angles of triangle are entered through the keyboard
// A triangle is valid if the sum of all the three angles is equal to 180
// degress

import java.io.*;

public class exercise5 {
    public static void main(String[] args) throws Exception {
        float a1, a2, a3, sum;
        System.out.println("Enter the three angles pf triangle: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a1 = Float.parseFloat(br.readLine());
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        a2 = Float.parseFloat(br1.readLine());
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        a3 = Float.parseFloat(br2.readLine());
        sum = a1 + a2 + a3;
        if (sum == 180) {
            System.out.println("Triangle is valid" + sum);
        } else {
            System.out.println("Triangle is Invalid" + sum);
        }
    }
}
