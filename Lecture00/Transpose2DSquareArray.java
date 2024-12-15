public class Transpose2DSquareArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 7, 3, 5 }, { 2, 4, 3, 1 }, { 5, 6, 3, 1 }, { 2, 4, 5, 1 } };
        System.out.println("Array arr:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println("Transpose of Array arr :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }
}
