public class Substring {

    // Total substring of a word:(n(n+1))/2;----> where n is the total no. of
    // letters in the word
    public static void main(String[] args) {
        String s = "Harsh";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.print(s.substring(i, j) + " ");
            }
            System.out.println();
        }

    }
}
