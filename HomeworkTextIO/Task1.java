
public class Task1 {

	public static void main(String[] args) {
		TextIO.readFile("src/input1.in");
		int a = TextIO.getlnInt();
		int b = TextIO.getlnInt();
		for (int i = a+1; i<b;i++)
			System.out.println(i);
	}

}
