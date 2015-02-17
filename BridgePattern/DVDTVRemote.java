// Refined Abstraction

public class DVDTVRemote extends RemoteButton{
	
	private boolean play = true;

	public DVDTVRemote(EntertainmentDevice newDevice) {
		super(newDevice);
		
	}
	
	public void buttonNinePressed() {
		
		//System.out.println("DVD Paused. Go get a snack.");
		
		play = !play;
		
		System.out.println("DVD is Playing: " + play);
		
	}

}
