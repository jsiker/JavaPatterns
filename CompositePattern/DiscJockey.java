
public class DiscJockey {
	
	SongComponent songList;
	
	// newSongList contains every Song, SongGroup,
	// and any Songs saved in SongGroups
	
	public DiscJockey(SongComponent newSongList){
		
		songList = newSongList;
		
	}
	
	// Calls displaySongInfo on every Song or SongGroup in songList
	
	public void getSongList() {
		
		songList.displaySongInfo();
		
	}

}
