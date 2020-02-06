package songs;

import java.util.Comparator;
/**
 * 
 * @author Wahl_D
 *
 */
public class ArtistComparator implements Comparator<Song> {
	
	public ArtistComparator(){}

	public int compare(Song s1, Song s2) {
		return s1.getArtist().compareTo(s2.getArtist());
	}

}
