
public class Task5 {

	public static void main(String[] args) {
		TextIO.readFile("src/decimal.in");
		int decimalni = 0;
		decimalni = TextIO.getInt();
		String binarni = Integer.toBinaryString(decimalni);
		TextIO.writeFile("src/binary.out");
		TextIO.put(binarni);
	}

}
