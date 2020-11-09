package listDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SongPlayer {

	public void start() {
		// TODO Auto-generated method stub
		List<String> songList = getSongs();
		List<String> listOfSongs = new ArrayList<>(songList);
		System.out.println(songList);
		Collections.sort(listOfSongs);
		System.out.println(listOfSongs);
	}

	private List<String> getSongs() {
		List<String> listOfSongs = new ArrayList<>();
		try {

			File file = new File("songlist");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String newSong = null;
			while ((newSong = br.readLine()) != null) {
				String tokens[] = newSong.split("/");
				listOfSongs.add(tokens[0]);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfSongs;

	}

}
