public class StringReverse {
    public static void main(String[] args) {
        String s = "Harshit";
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ans += s.charAt(i);
        }
        System.out.println(ans);
    }
}
