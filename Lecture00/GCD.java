import java.util.*;
public class GCD {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int N1=sc.nextInt();
int N2=sc.nextInt();
int i=N1*N2;
while(i>=1){
if(N1%i==0&&N2%i==0){
    System.out.println(i);
    break;
}
i--;}

    }
}