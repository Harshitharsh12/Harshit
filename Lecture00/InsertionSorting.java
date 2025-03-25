public class InsertionSorting {
    public static void main(String[] args) {
        // int[] arr = { 3, 2, 1, 8, 7 };
//        int[] arr = { 1, 2, 3, 4, 5 };
         int[] arr = { 5, 4, 3, 2, 1 };
        sorting(arr);
        for (int e : arr) {

            System.out.print(e + " ");
        }
    }

    static void sorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }


    }
}
