import java.util.*;

public class Maain {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = 1; j <= N; j++) {
				if (j <= (N - i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for (int k = N - 1; k > 0; k--) {
				if (k <= N - i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = N - 1; i > 0; i--) {
			for (int j = 1; j <= N; j++) {
				if (j <= (N - (i - 1)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for (int k = N - 1; k > 0; k--) {
				if (k > (N - (i - 1)))
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}