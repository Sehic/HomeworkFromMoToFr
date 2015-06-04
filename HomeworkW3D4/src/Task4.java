import java.util.Scanner;


public class Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj dobijenih bodova na ispitu");
		int N = input.nextInt();
		System.out.println("Unesite maximalan broj bodova");
		int M = input.nextInt();
		System.out.println("Procenti: "+getPercentage(N, M)+" %");

	}
	
	public static double getPercentage(int N, int M) {
		return (double) N * 100.0 / (double) M;
	}

}
