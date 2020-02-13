package songs;

import java.util.Comparator;
/**
 * 
 * @author Wahl_D
 *
 */
public class NameComparator implements Comparator<Song> {

	public int compare(Song s1, Song s2) {
		return s1.getName().compareToIgnoreCase(s2.getName());
	}

}
