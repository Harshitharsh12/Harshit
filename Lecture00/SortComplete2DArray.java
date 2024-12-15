import java.util.Arrays;

public class SortComplete2DArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 12 }, { 3, 4 }, { 5, 2 } };
        int[] arr2 = new int[arr.length * arr[0].length];
        int k = 0;
        System.out.println("the Array without Soring:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // flaten Array:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[k] = arr[i][j];
                k++;
            }
        }
        k = 0;
        // sort Array:
        Arrays.sort(arr2);

        // fill 2D array:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr2[k];
                k++;
            }
        }
        System.out.println("the Array after Sorting:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}