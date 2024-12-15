public class HelloWorldByRecursion {
    public static void main(String[] args) {
        // System.out.println(hw(5, ""));
        hw(5);
    }

    // Head Recursion:
    static void hw(int n) {
        if (n == 0)
            return;

        System.out.println("Hello World");
        hw(n - 1);
    }

    // Tail Recursion:
    // static String hw(int n, String k) {
    // if (n == 0)
    // return k;

    // return hw(n - 1, k + "Hello world ");
    // }
}