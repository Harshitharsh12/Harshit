public class FirstOccurence {
    public static void main(String[] args) {
        String s1 = "carbarratraz";
        System.out.println(firstOcc(s1, 3));
    }

    static String firstOcc(String s1, int k) {
        int start = 1;
        k++;
        String s2 = s1.substring(0, k);
        while (k <= s1.length()) {
            String temp = s1.substring(start, k);
            if (s2.compareToIgnoreCase(temp) > 0) {
                s2 = temp;
            }
            start++;
            k++;
        }
        return s2;
    }
}
