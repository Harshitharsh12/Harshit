public class StringReverseByRecursion {
    public static void main(String args[]) {
        // String n = "Harshit";
        int n = 232456;
        String s = n + "";
        // System.out.println(rev(s, s.length() - 1));
        System.out.println(rev(s, s.length() - 1, ""));
    }

    // Head Recursion:
    // static String rev(String s, int n) {
    // if (n < 0)
    // return "";
    // return s.charAt(n) + rev(s, (n - 1));
    // }

    // Tail Recursion:
    static String rev(String s, int n, String k) {
        if (n < 0)
            return k;
        return rev(s, (n - 1), k + s.charAt(n));
    }
}