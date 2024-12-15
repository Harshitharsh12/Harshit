import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(intersection(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 })));
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        int num = 0;
        int c = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i = 0; i < nums1.length; i++) {
            if (i > 0)
                if (nums1[i] == nums1[i - 1])
                    continue;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    num = num * 10 + nums1[i];
                    c++;
                    break;
                }
            }
        }
        int[] arr = new int[c];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num % 10;
            num = num / 10;
        }
        return arr;
    }
}
