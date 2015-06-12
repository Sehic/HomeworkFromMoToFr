package ba.bitcamp.hajrudin.homework.weekend4;

import java.util.Arrays;

public class Artist {
	private String name;
	private Boolean isGroup;
	private Integer established;
	private String genre;
	
	
	
	public Artist(String name, Boolean isGroup, Integer established,
			String genre) {
		super();
		this.name = name;
		this.isGroup = isGroup;
		this.established = established;
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsGroup() {
		return isGroup;
	}
	public void setIsGroup(Boolean isGroup) {
		this.isGroup = isGroup;
	}
	public Integer getEstablished() {
		return established;
	}
	public void setEstablished(Integer established) {
		this.established = established;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		String s = "";
		s = "Name: "+ name + "\n";
		s += "Is group: "+isGroup+"\n";
		s += "Group / artist established: "+established+" year. \n";
		s+="Genre: "+genre+"\n";
		return s;
	}
	
	
	
}
