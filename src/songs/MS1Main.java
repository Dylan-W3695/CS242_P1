package songs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MS1Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File(args[1]);
		Scanner scanner = new Scanner(file);
		
		ArrayList<Song> songList = new ArrayList<Song>();
		
		while(scanner.hasNextLine()) {
			scanner.nextLine();
			scanner.useDelimiter(";");
			String[] songInfo = new String[3];
			for(int i = 0; i < 3 && scanner.hasNext(); i++) {
				songInfo[i] = scanner.next();
			}
			Song newSong = new Song(songInfo[0], songInfo[1], songInfo[2]);
			songList.add(newSong);
		}
		
		for(int i = 0; i < songList.size(); i++) {
			System.out.println(songList.get(i).toString());
		}
	}

}
