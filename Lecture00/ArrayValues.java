public class ArrayValues {
    static void display(int[] arr) {
        System.out.println("The array Elements are:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = (arr.length - 1) - i; j >= 0; j--) {
        // arr[i] = arr[j];
        // }
        // }
    }

    static void displayReverse(int[] arr) {
        System.out.println("The array Elements in Reverse order are:");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = arr.length - (i + 1); j >= arr.length - (i + 1); j--) {
        // arr[i] = arr[j];

        // }

        // }
        // System.out.println("The array Elements in Reverse order are:");
        // for (int i = arr.length - 1; i >= 0; i--) {
        // System.out.println(arr[i]);
        // }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 45 };
        display(arr);
        System.out.println();
        displayReverse(arr);
    }
}
