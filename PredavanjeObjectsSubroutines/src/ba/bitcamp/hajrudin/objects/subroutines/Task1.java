package ba.bitcamp.hajrudin.objects.subroutines;

import ba.bitcamp.hajrudin.models.Planeta;

public class Task1 {

	public static void main(String[] args) {
		Planeta a = new Planeta(200,100,"kocka","KockaPlanet");
		Planeta b = new Planeta(100,50,"lopta","LoptaPlanet");
		a.dodajMasu(100);
		System.out.println(a.vrijednostMase());
		System.out.println();
		
	}

}
