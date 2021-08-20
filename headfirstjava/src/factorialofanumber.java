
//Factorial of a number
import java.io.*;

public class factorialofanumber {
    public static void main(String[] args) throws Exception {
        int num, fact = 1, i;
        System.out.println("Enter the number :");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        for (i = 1; i <= num; i++) {
            System.out.print(" " + i);
            // System.out.println("##############");
            fact = fact * i;
            // System.out.println("$$$$$$$$$$$$$$$");
            System.out.println(" " + fact);
        }

        System.out.println("Factorial of a number :" + fact);
    }
}
