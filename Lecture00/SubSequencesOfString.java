public class SubSequencesOfString {
    public static void main(String[] args) {
        printSubSeq("car", "");
        // System.out.println(printSubSeq("car", ""));
    }

    static void printSubSeq(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        char a = ques.charAt(0);
        // Include:
        printSubSeq(ques.substring(1), ans + a);
        // Don't Include:
        printSubSeq(ques.substring(1), ans);
    }

    // Total Subsequences:
    // static int printSubSeq(String ques, String ans) {
    // if (ques.length() == 0) {
    // return 1;
    // }
    // char a = ques.charAt(0);

    // return printSubSeq(ques.substring(1),ans+a)+ printSubSeq(ques.substring(1),
    // ans);

}
