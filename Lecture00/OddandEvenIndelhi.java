import java.util.*;
public class OddandEvenIndelhi {
     public static void oddeven(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int num=arr[i];
            int r;
           int evenSum=0;
            int oddSum=0;
          while(num>0){
              r=num%10;
              num=num/10;
              if(r%2==0){
                  evenSum=evenSum+r;
              }
              else{
                  oddSum=oddSum+r;
              }
          }
          if(evenSum%4==0||oddSum%3==0){
              System.out.println("Yes");
          }
          else{
              System.out.println("No"); 
          }
          i++;
        }
    }
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
 int i = 0;
        int[] arr = new int[n];
        while (i < arr.length) {
            int number = sc.nextInt();
            arr[i] = number;
            i++;
        }
        oddeven(arr);
    }}