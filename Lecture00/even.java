public class even {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("First 10 Even Numbers are:");
        for (int i = 2, c = 0; c < n && i % 2 == 0; i = i + 2, c++) {

            System.out.print(i);
            System.out.print(" ");
        }
    }
}
