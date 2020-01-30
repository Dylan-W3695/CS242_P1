package songs;

import java.util.Comparator;

public class NameComparator implements Comparator<Song> {

	public int compare(Song s1, Song s2) {
		return s1.getName().compareTo(s2.getName());
	}

}
