package ba.bitcamp.hajrudin.objects.subroutines;

import java.util.Scanner;


public class VjezbeTask1 {

	public static void main(String[] args) {
		Student s1 = new Student("IUS", "Ferid", "Motika", 1977, 666);
		System.out.println(s1);
		
		System.out.println("Unesite ime");
		Scanner ime = new Scanner(System.in);
		String s = ime.next();
		
		s1.setName(s);	
		
		System.out.println(s1);
		
	}
	
}