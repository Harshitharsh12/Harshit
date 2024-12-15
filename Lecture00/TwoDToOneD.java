public class TwoDToOneD {
    public static void main(String[] args) {
        int[][] arr = { { 1, 12 }, { 3, 4 }, { 5, 2 } };
        int[] arr2 = new int[arr.length * arr[0].length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[k] = arr[i][j];
                k++;
            }
        }
        System.out.println("The new 1D Array is:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}