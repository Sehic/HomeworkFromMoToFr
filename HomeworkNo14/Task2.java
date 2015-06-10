public class Task2 {

	public static void main(String[] args) {
		int[][] matr = { { 1, -2, 1 }, { 5, 0, 4 }, { -4, 2, 2 } };
		System.out.println(getNumOfZeroRowsAndColumns(matr));

	}

	public static int rows(int[][] matrix, int i) {
		int sum = 0;
		for (int j = 0; j < matrix.length; j++) {
			sum += matrix[i][j];
		}
		return sum;

	}

	public static int columns(int[][] matrix, int j) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][j];
		}
		return sum;
	}

	public static int getNumOfZeroRowsAndColumns(int[][] matr) {
		int counter = 0;
		for (int i = 0; i < matr.length; i++) {

			if (rows(matr, i) == 0)
				counter++;
		}
		for (int j = 0; j < matr.length; j++) {

			if (columns(matr, j) == 0)
				counter++;

		}
		return counter;

	}

}
