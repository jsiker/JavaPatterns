// This is the interface for every Song (Leaf) and SongGroup (Composite) we create
public abstract class SongComponent {
	// We throw UnsupportedOperationException so that if
	// it doesn't make sense for a song, or song group
    // to inherit a method they can just inherit the
    // default implementation

	// Allows us to add components
	
	public void add(SongComponent newSongComponent) {
		
		throw new UnsupportedOperationException();
		
	}
	
	// Remove components
	
	public void remove(SongComponent newSongComponent) {
		
		throw new UnsupportedOperationException();

	}
	
	// Get components
	
	public SongComponent getComponent(int componentIndex) {
		
		throw new UnsupportedOperationException();

	}
	
	// retrieve song names
	
	public String getSongName() {
		
		throw new UnsupportedOperationException();

	}
	
	// retrieve band names
	
	public String getBandName() {
		
		throw new UnsupportedOperationException();

	}
	
	// retrieve release year
	
	public int getReleaseYear() {
		
		throw new UnsupportedOperationException();

	}
	
	// When this is called by a class object that extends
	// SongComponent it will print out the information
	// specific to the Song or SongGroup
	
	public void displaySongInfo() {
		
		throw new UnsupportedOperationException();

	}
}
