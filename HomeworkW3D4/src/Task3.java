import java.util.Scanner;


public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki string");
		String s = input.nextLine();
		System.out.println(hasNumbers(s));

	}
	
	public static boolean hasNumbers(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				return true;
			}
		}
		return false;
	}

}
