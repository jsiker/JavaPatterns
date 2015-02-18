
public class DJ {
	
	SongComponent songList;
	
	// newSongList contains every Song, SongGroup,
	// and any Songs saved in SongGroups
	
	public DJ(SongComponent newSongList){
		
		songList = newSongList;
		
	}
	
	// Calls displaySongInfo on every Song or SongGroup in songList
	
	public void getSongList() {
		
		songList.displaySongInfo();
		
	}

}
