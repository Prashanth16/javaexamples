public class exchange_two_numbers_without_temp {
    public static void main(String[] args) {
        int a, b;
        a = 50;
        b = 30;
        System.out.println("Before Swapping" + a);
        System.out.println("Before Swapping" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Before Swapping" + a);
        System.out.println("Before Swapping" + b);
    }
}
