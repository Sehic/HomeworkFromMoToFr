import java.util.Scanner;


public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi broj");
		int num1 = in.nextInt();
		System.out.println("Unesite koju cifru zelite sa desne strane vaseg broja");
		int num2 = in.nextInt();
		int cifra = 0;
		int brojac = 1;
		while(brojac<num2){
			num1/=10;
			brojac++;
		}
		cifra=num1%10;
		System.out.println("Cifra je "+cifra);

	}

}
