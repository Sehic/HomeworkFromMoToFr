package ba.bitcamp.hajrudin.homework.weekend4;

import java.util.Arrays;

public class Koncert {
	private Artist [] artists;
	private Song [] songs;
	
	
	
	public Koncert(Artist[] artists, Song[] songs) {
		super();
		this.artists = artists;
		this.songs = songs;
	}
	public Artist[] getArtists() {
		return artists;
	}
	public void setArtists(Artist[] artists) {
		this.artists = artists;
	}
	public Song[] getSongs() {
		return songs;
	}
	public void setSongs(Song[] songs) {
		this.songs = songs;
	}
	@Override
	public String toString() {
		String s = "";
		return s;
	}
	
	
}
