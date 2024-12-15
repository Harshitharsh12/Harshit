public class setMatrixZeroes {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1 }, { 1, 0, 1 }, { 1, 1, 0 } };
        setZeroes(arr);
    }

    static void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] column = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    column[j] = 1;
                }
        }
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 1) {
                for (int j = 0; j < column.length; j++)
                    matrix[i][j] = 0;
            }
        }
        for (int i = 0; i < column.length; i++) {
            if (column[i] == 1) {
                for (int j = 0; j < row.length; j++)
                    matrix[j][i] = 0;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j]);
            System.out.println();
        }
    }
}