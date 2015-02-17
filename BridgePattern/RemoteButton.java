/*
 * Abstraction layer
 * This is an abstract class that'll represent numerous ways to work with each device 
 */

public abstract class RemoteButton {
	
	// A reference to a generic device using aggregation
	
	private EntertainmentDevice theDevice;
	
	public RemoteButton(EntertainmentDevice newDevice){
		
		theDevice = newDevice;
		
	}
	
	public void buttonFivePressed() {
		
		theDevice.buttonFivePressed(); // sets default for buttonFive for all remotes
		
	}
	
	public void buttonSixPressed() {
		
		theDevice.buttonSixPressed(); // ditto
		
	}
	
	public void deviceFeedback() {
		
		theDevice.deviceFeedback();
		
	}

	public abstract void buttonNinePressed(); // introduces buttonNine to be defined further down the line
	
}
