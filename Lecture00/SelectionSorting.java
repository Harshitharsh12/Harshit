public class SelectionSorting {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr = { 1, 3, 6, 9, 2 };
        sortedArray(arr);
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    static void sortedArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // int min = i;
            // for (int j = i + 1; j < arr.length; j++) {
            // if (arr[j] < arr[min]) {
            // min = j;
            // }
            // }
            // int temp = arr[i];
            // arr[i] = arr[min];
            // arr[min] = temp;

            // or

            int max = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - i - 1] = arr[max];
            arr[max] = temp;
        }
    }
}