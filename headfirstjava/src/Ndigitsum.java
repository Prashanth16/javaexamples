import java.io.*;

public class Ndigitsum {
    public static void main(String[] args) throws Exception {
        int digit, num, sum = 0;
        System.out.println("Enter the number");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        while (num > 0) {
            digit = num % 10;
            System.out.println("Digits entered is" + num);
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Sum of Digits: " + sum);
    }
}
