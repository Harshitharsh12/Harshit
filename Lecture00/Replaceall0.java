import java.util.*;

public class Replaceall0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        String s = sc.nextLine();
        long r;
        long result = 0l;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String s2 = String.valueOf(c);
            long number2 = Integer.parseInt(s2);
            if (number2 == 0) {
                r = 5;
                result = result * 10 + r;
            } else {
                r = number2;
                result = result * 10 + r;

            }

        }

        System.out.println(result);
    }
}

// import java.util.*;
// public class Main {
// public static void main (String args[]) {
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// System.out.println(replaceZeros(n,0,0));
// }
// public static int replaceZeros(int n,int temp,int r){
// if(n==0){
// return temp;
// }
// if(n%10!=0){
// return replaceZeros(n/10,temp*10+(n%10),n%10);
// }
// else{
// return replaceZeros(n/10,temp*10+(5),n%10);

// }
// }
// }