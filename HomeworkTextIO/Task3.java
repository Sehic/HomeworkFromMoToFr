
public class Task3 {

	public static void main(String[] args) {
		TextIO.writeFile("src/input3.in");
		int n = 0;
		int najmanjiBroj = 0;
		int unos = 0;
		
		System.out.println("Koliko zelite brojeva unijeti?");
		n = TextIO.getInt();
		TextIO.putln(n);
		System.out.println("Unesi broj");
		unos = TextIO.getInt();
		TextIO.putln(unos);
		najmanjiBroj = unos;
		for(int i = 1; i < n; i++){
			System.out.println("Unesi broj");
			unos = TextIO.getInt();
			TextIO.putln(unos);
			if(unos<najmanjiBroj)
				najmanjiBroj=unos;
		}
		System.out.println("Najmanji broj je "+najmanjiBroj);
	}

}
