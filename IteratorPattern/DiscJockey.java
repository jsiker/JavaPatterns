import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey {

	SongsOfThe70s songsOfThe70s;
	SongsOfThe80s songsOfThe80s;
	SongsOfThe90s songsOfThe90s;
	
	// Passing in song iterators
	
	SongIterator iter70sSongs;
	SongIterator iter80sSongs;
	SongIterator iter90sSongs;
	
	public DiscJockey(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s) {
		
		iter70sSongs = newSongs70s;
		iter80sSongs = newSongs80s;
		iter90sSongs = newSongs90s;
		
	}
	
	public void showTheSongs(){
		
		// B/c the SongInfo Objects are stored in different collections,
		// e/t must be handled on an individual basis. This is NO GOOD, BAD, TERRIBLE
		// but good practice using different collection types.
		
		ArrayList arrayList70sSongs = songsOfThe70s.getBestSongs();
		
		System.out.println("Songs of the 70's\n");
		
		for(int i=0; i < arrayList70sSongs.size(); i++){
			
			SongInfo bestSongs = (SongInfo) arrayList70sSongs.get(i);
			
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased() + "\n");
			
		}
		
		SongInfo[] array80sSongs = songsOfThe80s.getBestSongs();
		
		System.out.println("Songs of the 80's\n");
		
		for(int j=0; j < array80sSongs.length; j++){
			
			SongInfo bestSongs = array80sSongs[j];
			
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased() + "\n");
			
		}
		
		Hashtable<Integer, SongInfo> hashTable90sSongs = songsOfThe90s.getBestSongs();
		
		System.out.println("Songs of the 90's");
		
		for (Enumeration<Integer> e = hashTable90sSongs.keys(); e.hasMoreElements();){
			
			SongInfo bestSongs = hashTable90sSongs.get(e.nextElement());
			
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased() + "\n");
			
		}
		
	}
	
	// THE BETTER WAY -- treat e/t as an Iterator object
	
	public void showTheSongs2(){
		
		System.out.println("NEW WAY WITH ITERATOR YOU MOUTH-BREATHER\n");
		
		Iterator Songs70s = iter70sSongs.createIterator();
		Iterator Songs80s = iter80sSongs.createIterator();
		Iterator Songs90s = iter90sSongs.createIterator();
		
		System.out.println("Songs of the 70's\n");
		printTheSongs(Songs70s);
		
		System.out.println("Songs of the 80's\n");
		printTheSongs(Songs80s);
		
		System.out.println("Songs of the 90's\n");
		printTheSongs(Songs90s);

	}
	
	public void printTheSongs(Iterator iterator){
		
		while(iterator.hasNext()){
			
			SongInfo songInfo = (SongInfo) iterator.next();
			
			System.out.println(songInfo.getSongName());
			System.out.println(songInfo.getBandName());
			System.out.println(songInfo.getYearReleased() + "\n");
			
		}
	}
	
}
