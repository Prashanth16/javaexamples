//Calculation of Simple Interest with 3 different sets using for loop

import java.io.*;

public class loop2 {
    public static void main(String[] args) throws Exception {
        int p, n, count;
        float r, si;
        for (count = 1; count <= 3; count += 1) {
            System.out.println("Enter the values of p,n,r");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            p = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            r = Float.parseFloat(br.readLine());
            si = p * n * r / 100;
            System.out.println("Simple interest for this set :" + si);
        }

    }
}
