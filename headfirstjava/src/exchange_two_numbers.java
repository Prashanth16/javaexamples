public class exchange_two_numbers {
    public static void main(String[] args) {
        int a, b, temp;
        a = 10;
        b = 50;
        System.out.println("Before Swapping" + a);
        System.out.println("Before Swapping" + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping" + a);
        System.out.println("After Swapping" + b);
    }
}
