public class FibSeriesByRecursion {
    public static void main(String[] args) {
        int m = 0;
        int n = 5;
        // while (m <= n) {
        // System.out.print(fib(m) + " ");
        // m++;
        // }
        while (n >= 0) {
            System.out.print(fib(n) + " ");
            n--;
        }
    }

    static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }
}
