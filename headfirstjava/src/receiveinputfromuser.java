import java.io.*;

public class receiveinputfromuser {
    public static void main(String[] args) throws Exception {
        float p, r, si;
        int n;
        System.out.println("Enter values of p,n,r");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        p = Float.parseFloat(br.readLine());
        n = Integer.parseInt(br.readLine());
        r = Float.parseFloat(br.readLine());
        si = (p * n * r) / 100;
        System.out.println("SimpleInterest = Rs." + si);
    }
}
