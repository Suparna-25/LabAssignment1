package listDemo2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SongPlayer {

	public void start() {

		List<Song> songList = getSongs();
		TreeSet<Song> listOfSongs = new TreeSet<>(songList);
		System.out.println(songList);

		// Collections.sort(listOfSongs);
		System.out.println(listOfSongs);

	}

	private List<Song> getSongs() {
		List<Song> listOfSongs = new ArrayList<>();
		try {

			File file = new File("songlist");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String newSong = null;
			while ((newSong = br.readLine()) != null) {
				String tokens[] = newSong.split("/");
				listOfSongs.add(new Song(tokens[0], tokens[1], tokens[2], tokens[3]));
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfSongs;

	}

}
