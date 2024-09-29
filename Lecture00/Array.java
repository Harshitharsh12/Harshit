public class Array {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        int[] n = { 1, 2, 3 };
        arr = n; // Here the length of the array arr is also the length of array n means 3.
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);
        System.out.println(arr);
        System.out.println(n);
    }
}
