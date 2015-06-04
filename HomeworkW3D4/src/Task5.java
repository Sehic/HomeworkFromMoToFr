import java.util.Scanner;


public class Task5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki string");
		String s = input.nextLine();
		System.out.println(getNumbersOnly(s));
	}
	
	public static String getNumbersOnly(String s) {
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				s1 += s.charAt(i);
			}
		}
		return s1;
	}

}
