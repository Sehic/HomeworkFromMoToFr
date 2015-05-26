import java.util.Scanner;


public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi broj");
		int num = in.nextInt();
		int sum=0;
		int counter = 0, pomocna = 0, num2=num;
		while(num2>0){
			num2/=10;
			counter++;
		}
		for(int i=0; i<=counter; i++){
			pomocna=num%10;
			sum+=pomocna;
			num/=10;
		}
			System.out.println("Suma je: "+sum);

	}

}
