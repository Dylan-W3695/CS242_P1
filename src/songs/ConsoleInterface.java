package songs;

import java.lang.String;
import java.util.Comparator;
/**
 * 
 * @author Wahl_D
 *
 */
public abstract class ConsoleInterface {

	public static void main(String[] args) {
		
		Comparator cmp = null;
		switch(args[0]) {
			case "0":
				cmp = new NameComparator();
				break;
			case "1":
				cmp = new AlbumComparator();
				break;
			case "2":
				cmp = new ArtistComparator();
				break;
		}
		ULSortedList<Song> songList = new ULSortedList<Song>(cmp);
		
		
		
	}

}
