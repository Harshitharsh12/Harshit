public class PowerFunctionByRecursion {
    public static void main(String args[]) {
        // System.out.println(power(4, 4));
        System.out.println(power(4, 4, 1));
    }

    // Head Recursion:
    // static int power(int n, int m) {
    // if (m == 0)
    // return 1;
    // return n * power(n, (m - 1));
    // }
    // Tail Recursion:
    static int power(int n, int m, int k) {
        if (m == 0)
            return k;
        return power(n, (m - 1), (n * k));
    }
}
