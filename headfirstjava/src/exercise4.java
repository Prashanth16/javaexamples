import java.io.BufferedReader;

// if the ages of ram.shyam and Ajay are input through the keyboard
// Write a program to determine the youngest

import java.io.*;

public class exercise4 {
    public static void main(String[] args) throws Exception {
        int ram, shyam, ajay;
        System.out.println("Enter Ram's age: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ram = Integer.parseInt(br.readLine());
        System.out.println("Enter Shyam's age: ");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        shyam = Integer.parseInt(br1.readLine());
        System.out.println("Enter Ajay's age: ");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        ajay = Integer.parseInt(br2.readLine());

        if ((ram <= (shyam & ajay))) {
            System.out.println("Ram is the youngest");
        } else if ((shyam <= (ram & ajay))) {
            System.out.println("Shyam is the youngest");
        } else if ((ajay <= (shyam & ram))) {
            System.out.println("Ajay is the youngest");
        }

    }
}
