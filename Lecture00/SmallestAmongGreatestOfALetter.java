public class SmallestAmongGreatestOfALetter {
    public static void main(String[] args) {
        char[] arr = { 'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n' };
        char target = 'e';
        System.out.println(celing(arr, target));
    }

    static char celing(char[] arr, char target) {
        if (target >= arr[arr.length - 1]) {
            return arr[0];
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
