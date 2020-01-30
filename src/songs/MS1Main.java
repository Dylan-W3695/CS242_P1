package songs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MS1Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File file = new File(args[0]);
		Scanner scanner = new Scanner(file);

		ArrayList<Song> songList = new ArrayList<Song>();

		while (scanner.hasNext()) {
			//scanner.nextLine();
			scanner.useDelimiter(";|\n");
			String[] songInfo = new String[3];
			for (int i = 0; i < 3 && scanner.hasNext(); i++) {
				songInfo[i] = scanner.next();
			}
			if (songInfo[0] != null && songInfo[1] != null && songInfo[2] != null) {
				Song newSong = new Song(songInfo[0], songInfo[1], songInfo[2]);
				songList.add(newSong);
			}
		}

		for (int i = 0; i < songList.size(); i++) {
			System.out.println(songList.get(i).toString());
		}
	}

}
