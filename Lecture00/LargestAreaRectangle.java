class LargestAreaRectangle {
    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[] { 2, 4 }));
    }

    static int[] shorterElementLeft(int[] arr) {
        int shorter = -1;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = shorter;
            if (i < arr.length - 1) {
                for (int j = i; j >= 0; j--) {
                    if (arr[j] < arr[i + 1]) {
                        shorter = j;
                        break;
                    } else {
                        shorter = -1;
                    }
                }
            }
        }
        return temp;
    }

    static int[] shorterElementRight(int[] arr) {
        int shorter = arr.length;
        int[] temp = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            temp[i] = shorter;
            if (i > 0) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] < arr[i - 1]) {
                        shorter = j;
                        break;
                    } else {
                        shorter = arr.length;
                    }
                }
            }
        }
        return temp;
    }

    static int largestRectangleArea(int[] heights) {
        int[] breadth = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            breadth[i] = (shorterElementRight(heights)[i]) - (shorterElementLeft(heights)[i]) - 1;
        }
        int area = 0;
        for (int i = 0; i < heights.length; i++) {
            int temp = heights[i] * breadth[i];
            if (temp > area) {
                area = temp;
            }
        }
        return area;
    }
}