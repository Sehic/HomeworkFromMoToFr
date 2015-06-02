import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input day");
		int Day = input.nextInt();
		switch (Day) {
		case 1:			
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Work day!");
			break;
		case 6:
		case 7:
			System.out.println("Weekend!");
			break;
		default:
			System.out.println("Wrong input!");
			break;
		}
		
		input.close();
	}
}