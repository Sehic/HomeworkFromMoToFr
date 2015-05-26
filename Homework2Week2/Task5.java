import java.util.Scanner;


public class Task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi broj");
		int num = in.nextInt();
		int pomocni = 0, noviBroj = 0;
		while(num>0){
			pomocni=num%10;
			num/=10;
			if(pomocni!=0){
			noviBroj+=pomocni;
			noviBroj*=10;
			}
		}
		noviBroj/=10;
		num=0;
		pomocni=0;
		while(noviBroj>0){
			pomocni=noviBroj%10;
			noviBroj/=10;
			num+=pomocni;
			num*=10;
			}
		num/=10;
		System.out.println(num);
	}
	

	}

