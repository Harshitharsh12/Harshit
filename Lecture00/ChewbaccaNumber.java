import java.util.*;
public class ChewbaccaNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        long result = 0L;
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            String s = String.valueOf(c);
            long n = Integer.parseInt(s);
              long  n2 = 9 - n;
                if ( n==9&&i==0) {
                    result = result * 10 + n;
                } 
                else if(n2<=n){

                    result = result * 10 + n2;
                }
                else {
                    result = result * 10 + n;
                }
            }

System.out.println(result);
        

    }
}

