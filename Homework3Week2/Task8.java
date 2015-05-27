package ba.bitcamp.hajrudin.objects.subroutines;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		int counter = -1;
		double sum = 0, avg = 0;
		int min=0, max=0;
		System.out.println("Unesi broj");
		num=in.nextInt();
		min=num;
		max=num;
		do {
			System.out.println("Unesi broj");
			num=in.nextInt();
			if(num<min && num!=-1)
				min=num;
			if(num>max && num != -1)
				max=num;
			sum += num;
			counter++;
			
		} while (num != -1);
		avg = sum / counter;
		System.out.println("Prosjek je "+ avg);
		System.out.println("Najmanji je "+ min);
		System.out.println("Najveci je "+ max);
		
		
	}

}
