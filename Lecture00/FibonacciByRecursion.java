public class FibonacciByRecursion {
    public static void main(String args[]) {
        System.out.println(fib(4));
    }

    static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 2) + fib(n - 1);
    }
}
