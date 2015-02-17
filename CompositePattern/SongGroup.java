import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {

	// Contains any Songs or SongGroups that are added to this ArrayList
	
	ArrayList songComponents = new ArrayList();
	
	String groupName;
	String groupDescription;
	
	public SongGroup(String newGroupName, String newGroupDescription){
		
		groupName = newGroupName;
		groupDescription = newGroupDescription;
		
	}
	
	public String getGroupName() {return groupName;}
	public String getGroupDescription() {return groupDescription;}
	
	public void add(SongComponent newSongComponent) {
		
		songComponents.add(newSongComponent);
		
	}
	
	public void remove(SongComponent newSongComponent) {
		
		songComponents.remove(newSongComponent);
		
	}
	
	public SongComponent getComponent(int componentIndex) {
		
		// Must first cast object into a SongComponent
		return (SongComponent)songComponents.get(componentIndex);
		
	}
	
	public void displaySongInfo(){
		
		System.out.println(getGroupName() + " " +
					getGroupDescription() + "\n");
		
		//Iterates array and prints any Songs or SongGoups added
		// to this SongGroups ArrayList songComponents
		
		Iterator songIterator = songComponents.iterator();
		
		while(songIterator.hasNext()) {
			
			SongComponent songInfo = (SongComponent) songIterator.next();
			
			songInfo.displaySongInfo();
		
		}
	}
}
