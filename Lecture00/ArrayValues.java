public class ArrayValues {
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void displayReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 45 };
        display(arr);
        System.out.println();
        displayReverse(arr);
    }
}
