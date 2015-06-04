import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		char[] arr = { 'I', 'N', 'G', 'B', 'I', 'T', 'C', 'A', 'M', 'P' };
		Scanner input = new Scanner(System.in);
		System.out.println("Input N");
		int N = input.nextInt();
		while (N > 0) {
			char last = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = last;
			N--;
		}
		while (N < 0) {
			char last = arr[0];
			for (int i = 0; i <arr.length-1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length-1] = last;
			N++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
