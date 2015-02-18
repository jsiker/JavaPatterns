// Will hold info for each song

// All users:
// 1. create a function named addSong() for adding song, band, release
// 2. create a function named getBestSongs() that will return the collection of songs

public class SongInfo {

	String songName;
	String bandName;
	int releaseYear;
	
	public SongInfo(String newSongName, String newBandName, int newReleaseYear) {
		
		songName = newSongName;
		bandName = newBandName;
		releaseYear = newReleaseYear;
		
	}
	
	public String getSongName(){ return songName; }
	public String getBandName(){ return bandName; }
	public int getYearReleased(){ return releaseYear; }
	
	
}
