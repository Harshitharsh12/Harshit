import java.lang.*;

public class validSoduku {
    public static void main(String[] args) {
        char[][] arr = { { '1', '.', '3', '.', '8', '.', '9', '.', '6' },
                { '8', '.', '4', '.', '3', '.', '2', '.', '.' },
                { '3', '.', '1', '.', '1', '.', '4', '.', '5' },
                { '9', '.', '8', '.', '5', '.', '3', '.', '2' },
                { '2', '.', '1', '.', '6', '.', '7', '.', '4' },
                { '4', '.', '7', '.', '2', '.', '8', '.', '9' },
                { '6', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.' } };
        System.out.println(isValid(arr, 2, 3));
    }

    static boolean isValid(char[][] board, int i, int j) {

        boolean check = true;
        for (int y = 0; y < board.length; y++) {
            if (board[i][j] == '.') {
                return check;
            }
            if (y != j && y != i) {

                if (board[i][j] == board[y][j] || board[i][j] == board[i][y]) {
                    check = false;
                }
            }
        }
        if (check == true) {
            int n = board.length;
            int root_n = (int) Math.sqrt(n);
            int ri = (i / root_n) * root_n;
            int rj = (j / root_n) * root_n;
            for (int x = ri; x < ri + root_n; x++) {
                for (int y = rj; y < rj + root_n; y++) {
                    if (x != i && y != j) {
                        if (board[x][y] == board[i][j]) {
                            check = false;
                        }
                    }
                }
            }
        }
        return check;
    }
}
