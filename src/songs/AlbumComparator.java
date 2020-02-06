package songs;

import java.util.Comparator;
/**
 * 
 * @author Wahl_D
 *
 */
public class AlbumComparator implements Comparator<Song> {
	
	public AlbumComparator() {}

	public int compare(Song s1, Song s2) {
		return s1.getAlbum().compareTo(s2.getAlbum());
	}

}
