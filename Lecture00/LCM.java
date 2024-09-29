import java.util.*;
public class LCM {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int number1=sc.nextInt();
int number2=sc.nextInt();
int m=number1*number2;
int i=1;
while(i<=m){
    if(i%number1==0&&i%number2==0){
        System.out.println(i);
        break;
    }
    i++;
}
    }
}