import java.util.*;

public class ReverseString3 {
    public static void main(String[] args) {
        String s = "Harshita";
        char[] c = s.toCharArray();
        int start = 0;
        int end = c.length - 1;
        while (start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
        // s = Arrays.toString(c);
        // System.out.println(

        // or

        for (char i : c) {
            System.out.print(i);
        }
    }

}
