public class SearchingIn2DArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        System.out.println(searchMatrix(arr, 13));
    }

    static boolean searchMatrix(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[i].length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[i][mid] == target) {
                    return true;
                } else if (arr[i][mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
