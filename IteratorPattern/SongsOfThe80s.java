import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator{

	// Array holds SongInfo objects
	
	SongInfo[] bestSongs;
	
	// Used to increment to the next position i the array
	
	int arrayValue = 0;
	
	public SongsOfThe80s() {
		
		bestSongs = new SongInfo[3];
		
		addSong("Roam", "B 52s", 1989);
		addSong("Cruel Summer", "Bananarama", 1984);
		addSong("Head Over Heels", "Tears For Fears", 1985);
	}
	
	// Add a SongInfo object to the array and increment to the next position
	
	public void addSong(String songName, String bandName, int releaseYear){
		
		SongInfo song = new SongInfo(songName, bandName, releaseYear);
		bestSongs[arrayValue] = song;
		
		arrayValue++;
		
	}
	
	// Return ArrayList filled with SongInfo Objects
	
	public SongInfo[] getBestSongs() {
		
		return bestSongs;
		
	}
	
	// By adding Iterator method, we can treat all collections the same
	
	public Iterator createIterator() {
		
		return Arrays.asList(bestSongs).iterator();
		
	}

}
