
//Check whether given number is prime or not//
import java.io.*;

public class primenumber {
    public static void main(String[] args) throws Exception {
        int num, i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        num = Integer.parseInt(br.readLine());

        i = 2;
        while (i <= num - 1) {
            if (num % i == 0) {
                System.out.println("Not a Prime number :" + num);
                break;
            }
            System.out.println("******************");
            System.out.println(i);
            i++;
        }
        if (i == num) {
            System.out.println("Prime number");
        }
    }
}
