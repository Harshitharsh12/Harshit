public class IsStringPalindrome {
    public static void main(String[] args) {
        String s = "asa";
        int i = 0;
        int j = s.length() - 1;
        int a = 0;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                a = 1;
                System.out.println("false");
            }
            i++;
            j--;

        }
        if (a == 0) {
            System.out.println("true");
        }
    }
}
