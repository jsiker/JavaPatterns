// Refined Abstraction

// Where we further TVRemotePause functionality

public class TVRemotePause extends RemoteButton {

	public TVRemotePause(EntertainmentDevice newDevice) {
		super(newDevice);

	}
	
	public void buttonNinePressed() {
		
		System.out.println("DVD was Paused");
		
	}

}
