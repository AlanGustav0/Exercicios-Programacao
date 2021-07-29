package hughGlass;

public class Main {

	public static void main(String[] args) {
		int arr[][] = new int[6][6];
		int sum = 0;
		int maxSum = 0;
		int x = 0, y = 0;
		boolean start = false;

		for (int line = 0; line < 6; line++) {
			for (int column = 0; column < 6; column++) {
				arr[line][column] = (int) (Math.random() * -100);
			}
		}

		for (int line = 0; line < arr.length; line++) {
			for (int column = 0; column < arr.length; column++) {

				if (line <= 3 && column <= 3) {
					sum = sumMatrix(line, column, arr);
				}
				if (maxSum == 0 && !start) {
					maxSum = sum;
					start = true;
				} else if (sum > maxSum) {
					maxSum = sum;
				}
			}
		}

		System.out.println(maxSum);

	}

	public static int sumMatrix(int line, int column, int arr[][]) {

		int sum = 0;
		int x = 0, y = 0;

		for (int i = line; i <= (line + 2); i++) {
			for (int j = column; j <= (column + 2); j++) {
				if (x == 0 && x == 2) {
					sum += arr[i][j];
				} else if (y == 1 && x == 1) {
					sum += arr[i][j];
				}
				y++;
			}
			y = 0;
			x++;
		}

		return sum;
	}

}
