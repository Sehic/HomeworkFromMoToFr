import java.util.Scanner;


public class Task2 {

	public static void main(String[] args) {
		int fibonaci1 = 0, brojac5 = 1,suma1=1, fibonaci2=1;
		int num=0;
		Scanner in = new Scanner(System.in);
		while(num<=1 || num>=50){
		System.out.println("Unesi broj");
		num = in.nextInt();
		}
		while(brojac5<num){
			
			suma1=fibonaci1+fibonaci2;
			fibonaci1=fibonaci2;
			fibonaci2=suma1;
			brojac5++;
		}
		System.out.println(suma1);

	}

}
