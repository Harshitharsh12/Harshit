import java.util.*;

public class TwodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
        int[][] arr2 = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };
        System.out.println("enter the element of arr array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("the element of arr array are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);
        // System.out.println(arr2[1][2]); --> Exception indexoutofbound.

        System.out.println("Elements of arr2 array:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");

            }
            System.out.println();

        }
        for (int i[] : arr2) {
            System.out.println(Arrays.toString(i));
        }

    }
}