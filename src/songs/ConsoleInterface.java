package songs;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.String;
import java.util.Comparator;
import java.util.Scanner;
/**
 * 
 * @author Wahl_D
 *
 */
public abstract class ConsoleInterface {

	public static void main(String[] args) throws FileNotFoundException {
		
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
			default:
				throw new IllegalArgumentException();
		}
		ULSortedList<Song> songList = new ULSortedList<Song>(cmp);
		
		File file = new File("resources//songs1.txt");
		Scanner scanner = new Scanner(file);
		
		while (scanner.hasNextLine()) {
			String newLine = scanner.nextLine();
			String[] array = newLine.split(";");
			if (array[0] != null && array[1] != null && array[2] != null) {
				Song newSong = new Song(array[0], array[1], array[2]);
				songList.add(newSong);
			}
		}
		
		for(int i = 0; i < songList.size(); i++) {
			System.out.println(songList.get(i).toString());
		}
		
	}

}
