import java.util.*;

public class MaxOccurenceChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = "bcbbbbbccbccccccaaaaaa";
        int[] arr = new int[26];
        int max = 0;
        int i = 0;
        for (int r = 0; r < s.length(); r++) {
            arr[s.charAt(r) - 'a']++;
            if (arr[s.charAt(r) - 'a'] > max) {
                max = arr[s.charAt(r) - 'a'];
                i = s.charAt(r) - 'a';
            }
        }
        System.out.println((char) (i + 'a'));
        // int[] arr = { 24, 56 };
        // System.out.println(Integer.parseInt(String.valueOf(arr[0]) +
        // String.valueOf(arr[1])) / 10);
        // System.out.println(String.valueOf(arr[0]) / 10);
        // System.out.println(("23" + "23") / 10);

    }
}