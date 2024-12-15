public class IntegerReverseByRecursion {
    public static void main(String[] args) {

        // System.out.println(rev(237887));
        System.out.println(rev(237887, ""));
    }

    // Head Recursion:
    // static String rev(int n) {
    // if (n == 0)
    // return "";
    // return n % 10 + rev(n / 10);
    // }

    // Tail Recursion:
    static String rev(int n, String k) {
        if (n == 0)
            return k;
        return rev(n / 10, (k + (n % 10)));
    }
}
