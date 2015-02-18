import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator{

	// ArrayList holds SongInfo objects
	
	ArrayList<SongInfo> bestSongs;
	
	public SongsOfThe70s() {
		
		bestSongs = new ArrayList<SongInfo>();
		
		addSong("Slim Slow Slider", "Van Morrison", 1973);
		addSong("The Weight", "The Band", 1970);
		addSong("War", "That One Band", 1975);
		
	}
	
	// Add a SongInfo object to the end of the ArrayList
	
	public void addSong(String songName, String bandName, int releaseYear){
		
		SongInfo songInfo = new SongInfo(songName, bandName, releaseYear);
		bestSongs.add(songInfo);
		
	}
	
	// Return ArrayList filled with SongInfo Objects, not needed with iterator below
	
	public ArrayList<SongInfo> getBestSongs() {
		
		return bestSongs;
		
	}
	
	// By adding Iterator method, we can treat all collections the same
	
	public Iterator createIterator() {
		
		return bestSongs.iterator();
		
	}

}
