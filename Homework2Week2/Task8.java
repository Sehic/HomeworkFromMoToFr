import java.util.Scanner;


public class Task8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi broj");
		int num = in.nextInt();
		
		for(int j=1; j<num;j++){
		int sum=0;
		int num2=j;
		int num3=j;
		int counter = 0, pomocna = 0;
		while(num2>0){
			num2/=10;
			counter++;
		}
		for(int i=0; i<=counter; i++){
			pomocna=num3%10;
			sum+=pomocna;
			num3/=10;
		}
		if (j%sum==0)
			System.out.println(j);
		}
		

	}

}
