import java.util.*;
public class SumofOddandEvendigits {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int r;
int oddSum=0;
int evenSum=0;
int i=1;
while(number>0){
    r=number%10;
    number=number/10;
    if(i%2==0){
        evenSum=evenSum+r;
    }
    else{
        oddSum=oddSum+r;
    }
    i++;
}
System.out.println(oddSum);
System.out.println(evenSum);
    }
}