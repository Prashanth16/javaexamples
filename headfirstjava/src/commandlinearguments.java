public class commandlinearguments {
    public static void main(String[] args) {
        float p, r, si;
        int n;
        p = (Float.valueOf(args[0])).floatValue();
        n = (Integer.valueOf(args[1])).intValue();
        r = (Float.valueOf(args[2])).floatValue();
        si = (p * n * r) / 100;
        System.out.println("Simple Interest = " + si);
    }
}
