import java.io.*;

public class reverse_a_number {
    public static void main(String[] args) throws Exception {
        int reverse = 0, num, digit;
        System.out.println("Enter the number");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        while (num > 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversal of Digits: " + reverse);
    }
}
