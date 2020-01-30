package songs;

import java.lang.String;

public class Song implements Cloneable{
	
	private String name;
	private String album;
	private String artist;

	Song(String name, String album, String artist){
		this.name = name;
		this.album = album;
		this.artist = artist;
	}
	
	public Song clone() {
		Song newSong = new Song(name, album, artist);
		return newSong;
	}
	
	public boolean equals(Object otherObject) {
		// TODO does this function take an Object or Song as parameter? if so, how do I cast Song onto the Object?
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
