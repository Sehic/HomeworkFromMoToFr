
public class Task2 {

	public static void main(String[] args) {
		TextIO.writeFile("src/input2.in");
		int unos = -1;
		int suma = 0;
		do{
			System.out.println("Unesi broj");
			unos = TextIO.getInt();
			if(unos!=-1){
			TextIO.putln(unos);
			suma+=unos;
			}
		}while(unos!=-1);
		System.out.println("Suma unesenih brojeva je "+suma);
	}

}
