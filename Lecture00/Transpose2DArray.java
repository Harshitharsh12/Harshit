public class Transpose2DArray {
    public static void main(String[] args) {

        int[][] arr = { { 1, 7, 3 }, { 2, 4, 3 }, { 5, 6, 3 }, { 2, 4, 5 } };
        int[][] arr2 = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr2.length + 1; i++) {
            for (int j = 0; j < arr2[0].length - 1; j++) {
                arr2[j][i] = arr[i][j];
            }
        }
        System.out.println("Array arr:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println("Transpose of Array arr :");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();

        }

    }
}