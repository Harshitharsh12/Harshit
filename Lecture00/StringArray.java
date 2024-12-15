public class StringArray {
    public static void main(String[] args) {
        String[][] arr = new String[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (String s : arr[i]) {
                System.out.print(s);
            }
            System.out.println();
        }
        System.out.println(arr[0][0] == null);
    }
}
