public class PalindromeString2 {
    public static void main(String[] args) {
        String s = "12441";
        System.out.println(pal(s));
        // System.out.println('A' - 'A');
    }

    static boolean pal(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
