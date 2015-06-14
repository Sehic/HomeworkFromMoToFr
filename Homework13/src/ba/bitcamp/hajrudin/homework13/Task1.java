package ba.bitcamp.hajrudin.homework13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius");
		double c = input.nextDouble();
		System.out.printf("Kelvins: %.2f",convertToKelvins(c));
	}
	/**
	 * This method convert temperature from celsius to kelvins
	 * @param c temperature in celsius
	 * @return temperature in kelvins
	 */
	
	public static double convertToKelvins(double c){
		double k = 0;
		k=273.15+c;
		return k;
	}

}
