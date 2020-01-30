package songs;

import java.lang.String;

public class Song implements Cloneable{
	
	private String name;
	private String album;
	private String artist;

	Song(String name, String album, String artist){
		
	}
	
	public Song clone() {
		return null;
		
	}
	
	public boolean equals(Object otherObject) {
		return false;
		
	}
	
	public String getAlbum() {
		return album;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name +" [" + album +"] - " + artist;
	}
	
}
