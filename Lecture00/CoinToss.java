public class CoinToss {
    public static void main(String[] args) {
        // toss(3,"");
        System.out.println(toss(3, ""));
    }
    // static void toss(int n,String s){
    // if(n==0){
    // System.out.println(s);
    // return;
    // }
    // toss(n-1,s+"H");
    // toss(n-1,s+"T");
    // }

    // number of total possibilities:
    static int toss(int n, String s) {
        if (n == 0) {
            return 1;
        }
        return toss(n - 1, s + "H") + toss(n - 1, s + "T");
    }
}
