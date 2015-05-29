package ba.bitcamp.hajrudin.objects.subroutines;

class Drink {
	
	String name;
	boolean isSoda;
	int expirationYear;
	String color;
	
	public String toString(){
		String s = "";
		s = s + "Name: " + name + "\n";
		s = s + "Is soda " + isSoda + "\n";
		s = s + "Expiration year " + expirationYear + "\n";
		s = s + "Color " + color;
		return s;
	}
	
}