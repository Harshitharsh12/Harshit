import java.util.*;
public class PrintSeries {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int N1=sc.nextInt();
int N2=sc.nextInt();
int c=0;
int s;
int i=1;
while(c<N1){
s=3*i+2;
if(s%N2!=0){
    System.out.println(s);
    c++;
}
i++;
}
    }
}