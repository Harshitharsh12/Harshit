import java.util.*;
public class Fibonacci {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        for(int i=1;i<number;i++)
        {c=a+b;
        a=b;
        b=c;
            if(i==(number-1)){
                System.out.println(c);
            }
        }
    }
}
