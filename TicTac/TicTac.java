import java.util.Scanner;


// KORISNIK OVE IGRICE NEMA NEMA NEMA PRAVO NA GRESKU !!!!!


public class TicTac {

	public static void main(String[] args) {
		boolean temp = false;
		int vel = 0;
		char[][] matr;
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite zeljenu velicinu matrice");
		vel = input.nextInt();
		matr = new char[vel][vel];
		inicijalizacijaMatrice(matr);
		ispis(matr);
		while (true) {
			temp = unosX(matr);
			if (temp == true) {
				System.err.println("IGRAC X JE POBJEDNIK");
				break;
			} else {
				ispis(matr);
			}
			temp = unosO(matr);
			if (temp == true) {
				System.err.println("IGRAC O JE POBJEDNIK");
				break;
			} else {
				ispis(matr);
			}
		}

	}

	public static boolean provjeraReda(char matr[][], int red, char c) {
		for (int j = 0; j < matr.length; j++) {
			if (matr[red][j] != c) {
				return false;
			}
		}
		return true;
	}

	public static boolean provjeraKolone(char matr[][], int kolona, char c) {
		for (int i = 0; i < matr.length; i++) {
			if (matr[i][kolona] != c) {
				return false;
			}
		}
		return true;
	}

	public static boolean provjeraDijagonale1(char matr[][], int red,
			int kolona, char c) {
		if (red != kolona) {
			return false;
		} else {
			for (int i = 0; i < matr.length; i++) {
				if (matr[i][i] != c) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean provjeraDijagonale2(char matr[][], int red,
			int kolona, char c) {
		int temp = matr.length - 1;
		if (red + kolona != temp) {
			return false;
		} else {
			for (int i = 0, j = matr.length - 1; i < matr.length; i++, j--) {
				if (matr[i][j] != c) {
					return false;
				}
			}
		}
		return true;
	}

	public static void inicijalizacijaMatrice(char[][] matr) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				matr[i][j] = ' ';
			}
		}
	}

	public static boolean unosX(char matr[][]) {
		Scanner input = new Scanner(System.in);
		char c = 'X';
		while (true) {
			System.out.println("Igrac X na potezu");
			System.out.println("Unesite koordinatu x");
			int x = input.nextInt();
			System.out.println("Unesite koordinatu y");
			int y = input.nextInt();
			if (matr[x][y] == ' ') {
				matr[x][y] = c;
				if (provjeraReda(matr, x, c) == true) {
					return true;
				} else if (provjeraKolone(matr, y, c) == true) {
					return true;
				} else if (provjeraDijagonale1(matr, x, y, c) == true) {
					return true;
				} else if (provjeraDijagonale2(matr, x, y, c) == true) {
					return true;
				}
				return false;
			} else {
				System.err.println("POGRESAN UNOS!");
				System.out.println();
			}
		}
	}

	public static boolean unosO(char matr[][]) {
		Scanner input = new Scanner(System.in);
		char c = 'O';
		while (true) {
			System.out.println("Igrac O na potezu");
			System.out.println("Unesite koordinatu x");
			int x = input.nextInt();
			System.out.println("Unesite koordinatu y");
			int y = input.nextInt();
			if (matr[x][y] == ' ') {
				matr[x][y] = c;
				if (provjeraReda(matr, x, c) == true) {
					return true;
				} else if (provjeraKolone(matr, y, c) == true) {
					return true;
				} else if (provjeraDijagonale1(matr, x, y, c) == true) {
					return true;
				} else if (provjeraDijagonale2(matr, x, y, c) == true) {
					return true;
				}
				return false;
			} else {
				System.err.println("POGRESAN UNOS!");
				System.out.println();
			}
		}
	}

	public static void ispis(char[][] matr) {
		for (int temp = 0; temp < matr.length; temp++) {
			System.out.print(" -- ");
		}
		System.out.println();
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				System.out.print("| " + matr[i][j] + " ");
			}
			System.out.print("|");
			System.out.println();
			for (int temp = 0; temp < matr.length; temp++) {
				System.out.print(" -- ");
			}
			System.out.println();
		}
	}

}
