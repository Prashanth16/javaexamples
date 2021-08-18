import java.io.BufferedReader;

import java.io.*;

public class complex_dm {
    public static void main(String[] args) throws Exception {
        int m1, m2, m3, per;
        System.out.println("Enter the marks obtained in 3 subjects");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        m1 = Integer.parseInt(br.readLine());
        m2 = Integer.parseInt(br.readLine());
        m3 = Integer.parseInt(br.readLine());
        per = (m1 + m2 + m3) * 100 / 300;

        if (per >= 60) {
            System.out.println("First Division");
        } else if (per >= 50 && per <= 59) {
            System.out.println("Second Division");
        } else if (per >= 40 && per <= 49) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }
    }
}
