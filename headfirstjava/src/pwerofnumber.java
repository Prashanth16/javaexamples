
import java.io.*;

public class pwerofnumber {
    public static void main(String[] args) throws Exception {
        double num1, num2, power;
        System.out.println("Enter the number");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num1 = Float.parseFloat(br.readLine());
        num2 = Float.parseFloat(br.readLine());
        power = Math.pow(num1, num2);
        System.out.println("Power of number :" + power);
    }
}
