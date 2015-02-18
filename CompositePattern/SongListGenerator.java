
public class SongListGenerator {
	
	public static void main(String[] args){
		
		SongComponent folkMusic = 
				new SongGroup("Folk:", "is a style of traditional music that draws inspiration"
						+ "from traditional musical sounds and local history");
		
		SongComponent hipHopMusic = 
				new SongGroup("\nHip-Hop:", "an evolution from earlier forms of Blues, Rock and Roll, Funk and Spoken Word");
		
		SongComponent rockMusic = 
				new SongGroup("\nRock:", "it rocks and rolls.");
		
		// Top level component that holds everything
		
		SongComponent everySong = new SongGroup("Song List", "Every Song Available"); 
		
		// Composite that holds individual groups of songs
		// This holds Songs plus a SongGroup with Songs
		
		everySong.add(folkMusic);
		
		folkMusic.add(new Song("I'm Not The Guy", "Dan Bern", 2001));
		folkMusic.add(new Song("Tiger Woods", "Dan Bern", 2003));
		
		folkMusic.add(rockMusic);
		
		rockMusic.add(new Song("You Can't Always Get What You Want", "The Rolling Stones", 1973));
		rockMusic.add(new Song("Seven Nation Army", "The White Stripes", 2003));
		
		// This is a SongGroup that just holds Songs
		
		everySong.add(hipHopMusic);
		
		hipHopMusic.add(new Song("i", "Kendrick Lamar", 2014));
		hipHopMusic.add(new Song("Juice", "Chance the Rapper", 2014));
		
		DJ crazyEddie = new DJ(everySong);
		
		crazyEddie.getSongList();
		
	}

}
