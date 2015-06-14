package ba.bitcamp.hajrudin.homework.weekend4;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		Artist a1 = new Artist("Mido Krembil", false, 1777, "Zabava");
		Artist a2 = new Artist("DJ nekiiii", false, 1899, "Techno");
		Artist a3 = new Artist("Lepi", false, 1999, "Svastara");
		Artist a4 = new Artist("Grupa neka", true, 2011, "Folk");
		Artist a5 = new Artist("Mujo Mujic", false, 2014, "Zabava");
		Song s1 = new Song("Labudovi", 1800, "Zabava", a1);
		Song s2 = new Song("Ljepota", 1900, "Zabava", a1);
		Song s3 = new Song("Mrznja", 1901, "Techno", a2);
		Song s4 = new Song("Ljubav", 1999, "Techno", a2);
		Song s5 = new Song("ImePjesme", 2005, "Svastara", a3);
		Song s6 = new Song("Snovi", 2010, "Svastara", a3);
		Song s7 = new Song("San", 2012, "Folk", a4);
		Song s8 = new Song("Ptice", 2013, "Folk", a4);
		Song s9 = new Song("Vuk u sumi", 2015, "Zabava", a5);
		Song s10 = new Song("Orlovi rano lete", 2015, "Zabava", a5);
		Song[] arr = new Song[2];
		arr[0] = s1;
		arr[1] = s2;
		Album al1 = new Album("Novi album", arr, "Zabava", a1);
		Song[] arr2 = new Song[2];
		arr2[0] = s3;
		arr2[1] = s4;
		Album al2 = new Album("Techno mix", arr2, "Techno", a2);
		Album[] arrAl = new Album[2];
		arrAl[0] = al1;
		arrAl[1] = al2;
		Artist[] arrAr = new Artist[2];
		arrAr[0] = a1;
		arrAr[1] = a2;
		System.out
				.println("Ispisuje da li je autor isti od dvije poslane pjesme "
						+ isSame(s1, s2));
		System.out.println("Ispisuje da li je izvodjac pjesme solo "
				+ isFromSolo(s4));
		Song s11 = getOlderSong(s1, s7);
		System.out.println(s11.toString());
		int a = countGenreNumber(al1, "Zabava");
		System.out.println("Broj pjesama datog zanra: " + a);
		printAlbumInformation(arrAl, s2);
		Koncert c = new Koncert(arrAr, arr2);
		int[] arri = (getNumberOfSongsPerAlbum(c, arrAl));
		System.out.println(Arrays.toString(arri));

	}

	public static boolean isSame(Song s1, Song s2) {
		if (s1.getNameOfArtists().getName()
				.equals(s2.getNameOfArtists().getName()))
			return true;
		return false;
	}

	public static boolean isFromSolo(Song s) {
		if (s.getNameOfArtists().getIsGroup() == true)
			return false;
		return true;
	}

	public static Song getOlderSong(Song s1, Song s2) {
		if (s1.getYear() > s2.getYear()) {
			Song s = new Song(s2.getName(), s2.getYear(), s2.getGenreOfSong(),
					s2.getNameOfArtists());
			return s;
		}
		Song s = new Song(s1.getName(), s1.getYear(), s1.getGenreOfSong(),
				s1.getNameOfArtists());
		return s;
	}

	public static int countGenreNumber(Album a, String genre) {
		int num = 0;
		for (int i = 0; i < a.getSongs().length; i++) {
			if (a.getSongs()[i].getGenreOfSong().equals(genre))
				num++;
		}
		return num;
	}

	public static void printAlbumInformation(Album a[], Song s) {
		boolean temp = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i].getSongs()[i].getName().equals(s.getName())) {
				System.out.println(a[i].getName());
				temp = true;
			}
		}
		if (temp == false) {
			System.out.println("Null");
		}
	}

	public static int[] getNumberOfSongsPerAlbum(Koncert c, Album[] a) {
		int[] arr = new int[a.length];
		for (int i = 0; i < c.getSongs().length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int z = 0; z < a[j].getSongs().length; z++) {
					if (c.getSongs()[i].equals(a[j].getSongs()[z])) {
						arr[j] += 1;
					}
				}
			}
		}
		return arr;
	}

}
