// Calculation of Simple Interest for 3 sets of p,n,r

import java.io.*;

public class loop1 {
    public static void main(String[] args) throws Exception {
        int p, n, count;
        float si, r;
        count = 3;
        while (count >= 1) {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter 3 different sets of p,n,r");
            p = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            r = Float.parseFloat(br.readLine());
            si = p * n * r / 100;
            System.out.println("Simple Interest for this set : " + si);
            count -= 1;
        }
    }
}
