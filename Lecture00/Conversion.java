import java.util.*;

public class Conversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sb = sc.nextInt();
        int db = sc.nextInt();
        int sn = sc.nextInt();
        String result = "";
        int result2 = 0;
        int r;
        if (sb == 10) {

            while (sn > 0) {
                r = sn % db;
                sn = sn / db;
                result = r + result;
            }

            System.out.println(result);
        } else if (sb == 2) {
            int e;
            int i = 0;
            if (db == 10) {
                while (sn > 0) {
                    r = sn % db;
                    sn = sn / db;
                    e = (int) Math.pow(2, i);
                    result2 = result2 + (r * e);
                    i++;
                }
                System.out.println(result2);
            } else {
                while (sn > 0) {
                    r = sn % 10;
                    sn = sn / 10;
                    e = (int) Math.pow(2, i);
                    result2 = result2 + (r * e);
                    i++;
                }
                while (result2 > 0) {
                    r = result2 % db;
                    result2 = result2 / db;
                    result = r + result;

                }
                System.out.println(result);
            }
        } else if (sb == 8) {
            int e;
            int i = 0;
            if (db == 10) {
                while (sn > 0) {
                    r = sn % db;
                    sn = sn / db;
                    e = (int) Math.pow(8, i);
                    result2 = result2 + (r * e);
                    i++;
                }
                System.out.println(result2);
            } else {
                while (sn > 0) {
                    r = sn % 10;
                    sn = sn / 10;
                    e = (int) Math.pow(8, i);
                    result2 = result2 + (r * e);
                    i++;
                }
                while (result2 > 0) {
                    r = result2 % db;
                    result2 = result2 / db;
                    result = r + result;

                }
                System.out.println(result);
            }
        } else {
            int e;
            int i = 0;
            if (db == 10) {
                while (sn > 0) {
                    r = sn % db;
                    sn = sn / db;
                    e = (int) Math.pow(16, i);
                    result2 = result2 + (r * e);
                    i++;
                }
                System.out.println(result2);
            } else {
                while (sn > 0) {
                    r = sn % 10;
                    sn = sn / 10;
                    e = (int) Math.pow(16, i);
                    result2 = result2 + (r * e);
                    i++;
                }
                while (result2 > 0) {
                    r = result2 % db;
                    result2 = result2 / db;
                    result = r + result;

                }
                System.out.println(result);

            }
        }

    }
}