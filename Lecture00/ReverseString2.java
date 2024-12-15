public class ReverseString2 {
    public static void main(String[] args) {
        System.out.println(firstOcc("harahit", 3));
    }

    static int compare(String s1, String s2) {
        if (s1 == s2)
            return 0;
        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) != s2.charAt(i))
                return s1.charAt(i) - s2.charAt(i);
        return s1.length() - s2.length();
    }

    static String firstOcc(String s, int k) {
        String ans = s.substring(0, k);
        int i = 1;
        k++;
        while (k <= s.length()) {
            String temp = s.substring(i, k);
            if (ans.compareTo(temp)>0) {
                ans = temp;
            }
            i++;
            k++;
        }
        return ans;
    }

}
