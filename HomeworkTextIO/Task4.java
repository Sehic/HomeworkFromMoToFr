
public class Task4 {

	public static void main(String[] args) {
		TextIO.writeFile("src/input4.in");
		int n = 0;
		int unos = 0;
		int trazeniBroj = 0;
		boolean var = false;
		System.out.println("Koliko zelite brojeva unijeti?");
		n = TextIO.getInt();
		System.out.println("Koji broj zelite traziti?");
		trazeniBroj = TextIO.getInt();
		TextIO.putf("%d %d", n, trazeniBroj);
		for(int i = 0; i < n; i++){
		System.out.println("Unesi broj");
		unos = TextIO.getInt();
		TextIO.putln(unos);
		if(unos==trazeniBroj)
			var = true;
		}
		if(var == true)
			System.out.println("Trazeni broj postoji");
		else
			System.out.println("Trazeni broj ne postoji");
	}

}
