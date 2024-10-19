import java.util.*;

public class SearchingInString {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Searching Character:");
        // String t = sc.next();
        // char target = t.charAt(0);
        // or
        char target = 't';
        String s = "Harshit";
        System.out.println(search(s, target));
        System.out.println(search2(s, target));
    }

    static int search(String s, char target) {
        if (s.length() == 0) {
            return -1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                return i;

            }
        }
        return -1;
    }

    static boolean search2(String s, char target) {
        if (s.length() == 0) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (c == target) {
                return true;

            }
        }
        return false;
    }
}
