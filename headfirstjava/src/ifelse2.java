import java.io.*;

public class ifelse2 {
    public static void main(String[] args) throws Exception {

        float basic_salary, hra, da_salary, gross_salary;
        System.out.println("Enter basic salary");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        basic_salary = Float.parseFloat(br.readLine());

        if (basic_salary < 1500) {
            hra = basic_salary * 10 / 100;
            da_salary = basic_salary * 90 / 100;
        } else {
            hra = 1200;
            da_salary = basic_salary * 98 / 100;
        }
        gross_salary = basic_salary + hra + da_salary;
        System.out.println("Salary received" + gross_salary);
    }
}
