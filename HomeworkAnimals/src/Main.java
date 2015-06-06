
public class Main {

	public static void main(String[] args) {
		Animals cat = new Animals();
		cat.setZvuk("Mjau");
		cat.setVrsta("Macka");
		System.out.println(cat.toString());
		Animals dog = new Animals();
		dog.setZvuk("Av av");
		dog.setVrsta("Pas");
		System.out.println(dog.toString());
		Animals cow = new Animals();
		cow.setZvuk("Muu");
		cow.setVrsta("Krava");
		System.out.println(cow.toString());
		Animals horse = new Animals();
		horse.setZvuk("NJiihh");
		horse.setVrsta("Konj");
		System.out.println(horse.toString());
		Animals pigeon = new Animals();
		pigeon.setZvuk("Grr grr");
		pigeon.setVrsta("Golub");
		System.out.println(pigeon.toString());
		
		

	}

}
