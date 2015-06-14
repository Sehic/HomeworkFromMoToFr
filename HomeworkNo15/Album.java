package ba.bitcamp.hajrudin.homework.weekend4;

import java.util.Arrays;

public class Album {
	private String name;
	private Song [] songs;
	private String genreOfAlbum;
	private Artist nameOfaArtist;
	
	
	
	public Album(String name, Song[] songs, String genreOfAlbum,
			Artist nameOfaArtist) {
		super();
		this.name = name;
		this.songs = songs;
		this.genreOfAlbum = genreOfAlbum;
		this.nameOfaArtist = nameOfaArtist;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Song[] getSongs() {
		return songs;
	}
	public void setSongs(Song[] songs) {
		this.songs = songs;
	}
	public String getGenreOfAlbum() {
		return genreOfAlbum;
	}
	public void setGenreOfAlbum(String genreOfAlbum) {
		this.genreOfAlbum = genreOfAlbum;
	}
	public Artist getNameOfaArtist() {
		return nameOfaArtist;
	}
	public void setNameOfaArtist(Artist nameOfaArtist) {
		this.nameOfaArtist = nameOfaArtist;
	}
	@Override
	public String toString() {
		String s = "";
		s = "Name of album: "+name+"\n";
		s+= "Genre of album: "+genreOfAlbum+"\n";
		s+= "About artist: \n" + nameOfaArtist.toString()+"\n";
		s+= "Songs in album: \n";
		for(int i = 0; i<songs.length;i++){
			s+=i+". "+songs[i].getName()+"\n";
		}
		return s;
	}
	
	
}
