public class ArrayValues {
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 45 };
        display(arr);
        display(arr);
    }
}
