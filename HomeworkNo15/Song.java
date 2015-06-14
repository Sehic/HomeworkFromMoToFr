package ba.bitcamp.hajrudin.homework.weekend4;

public class Song {
	private String name;
	private Integer year;
	private String genreOfSong;
	private Artist nameOfArtists;
	
	
	
	public Song(String name, Integer year, String genreOfSong,
			Artist nameOfArtists) {
		super();
		this.name = name;
		this.year = year;
		this.genreOfSong = genreOfSong;
		this.nameOfArtists = nameOfArtists;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getGenreOfSong() {
		return genreOfSong;
	}
	public void setGenreOfSong(String genreOfSong) {
		this.genreOfSong = genreOfSong;
	}
	public Artist getNameOfArtists() {
		return nameOfArtists;
	}
	public void setNameOfArtists(Artist nameOfArtists) {
		this.nameOfArtists = nameOfArtists;
	}
	
	
	
	@Override
	public String toString() {
		String s = "";
		s = "Name of song: "+name+"\n";
		s+="Year: "+year+"\n";
		s+="Genre of song: "+genreOfSong+"\n";
		s+="Artist: \n" + nameOfArtists.toString()+"\n";
		return s;
	}
	
	
}
