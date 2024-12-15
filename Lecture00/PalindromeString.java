public class PalindromeString {
    public static void main(String[] args) {
        String s = "1241";
        System.out.println(palString(s));
    }

    static boolean palString(String s1) {
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            // s2 = s2.concat(Character.toString((s1.charAt(i))));
            s2 = s2 + s1.charAt(i);
        }
        if (s2.equals(s1)) {
            return true;
        }
        return false;
    }
}
