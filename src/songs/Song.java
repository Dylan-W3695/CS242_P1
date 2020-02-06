package songs;

import java.lang.String;
/**
 * 
 * @author Wahl_D
 *
 */
public class Song implements Cloneable{
	
	private String name;
	private String album;
	private String artist;

	Song(String name, String album, String artist){
		this.name = name;
		this.album = album;
		this.artist = artist;
	}
	
	public Song clone() throws CloneNotSupportedException {
		Song newSong = (Song)super.clone();
		return newSong;
	}
	
	public boolean equals(Object otherObject) {
		boolean isEqual = false;
		if(otherObject != null) {
			if(otherObject == this) {
				isEqual = true;
			}
			else if(otherObject instanceof Song) {
				Song otherSong = (Song) otherObject;
				isEqual = otherSong.album == album &&
						otherSong.artist == artist &&
						otherSong.name == name;
			}
		}
		return isEqual;
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
