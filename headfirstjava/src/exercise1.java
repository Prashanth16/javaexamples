import java.io.BufferedReader;

// if cost price and selling price of an item is input through keyboard. write a program to get the cost price
// determine whether the seller has made profit or incurred loss. 
// Also determine how much profit he made or loss incurred

import java.io.*;

public class exercise1 {
    public static void main(String[] args) throws Exception {
        int cp, sp, p, l;
        System.out.println("Enter the cost price");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        cp = Integer.parseInt(br.readLine());
        System.out.println("Enter the selling price");
        sp = Integer.parseInt(br.readLine());
        p = sp - cp;
        l = cp - sp;
        if (sp > cp) {
            System.out.println("Profit obtained is" + p);
        } else {
            System.out.println("Loss obtained is" + l);
        }
    }
}
