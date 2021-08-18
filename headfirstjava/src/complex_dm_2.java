// A Company insures its drivers in the following cases:
// if the driver is married
// if the driver is unmarried, male and above 30 years of age
// if the driver is unmarried, female and above 25 years of age

import java.io.*;

public class complex_dm_2 {

    public static void main(String[] args) throws Exception {
        char sex, ms;
        int age;
        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter values for age,sex,marital status");
        age = Integer.parseInt(br.readLine());
        str = br.readLine();
        sex = str.charAt(1);
        str = br.readLine();
        ms = str.charAt(1);

        System.out.println("Values of" + sex);
        System.out.println("Values of" + ms);
        if ((ms == 'M') || (ms == 'U' && sex == 'M' && age > 30) || (ms == 'U' && sex == 'F' && age < 25)) {
            System.out.println("Driver is Insured");
        } else {
            System.out.println("Driver is not Insured");
        }
    }
}
