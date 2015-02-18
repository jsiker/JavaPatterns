import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator{

	// Hashtable holds SongInfo objects
	
	Hashtable<Integer, SongInfo> bestSongs = new Hashtable<Integer, SongInfo>();
	
	// Used to increment to the Hashtable key
	
	int hashKey = 0;
	
	public SongsOfThe90s() {
		
		
		  addSong("Losing My Religion", "REM", 1991);
		  addSong("Creep", "Radiohead", 1993);
		  addSong("Walk on the Ocean", "Toad The Wet Sprocket", 1991);
	}
	
	// Add a SongInfo object to the array and increment the Hashtable key
	
	public void addSong(String songName, String bandName, int releaseYear){
		
		SongInfo songInfo = new SongInfo(songName, bandName, releaseYear);
		bestSongs.put(hashKey, songInfo);
		
		hashKey++;
		
	}
	
	// Return ArrayList filled with SongInfo Objects
	
	public Hashtable<Integer, SongInfo> getBestSongs() {
		
		return bestSongs;
		
	}
	
	// By adding Iterator method, we can treat all collections the same
	
	public Iterator createIterator() {
		
		return bestSongs.values().iterator();
		
	}

}