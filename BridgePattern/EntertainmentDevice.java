/* Implementor
 * With Bridge Pattern you create 2 layers of abstraction.
 * Here we have an abstract class representing types of devices and another for
 * remote controls. This allows for an infinite variety of devices and remotes
 */

abstract class EntertainmentDevice {
	
	public int deviceState; //channel OR chapter
	
	public int maxSetting; //channel OR chapter
	
	public int volumeLevel = 0;
	
	public abstract void buttonFivePressed(); //method to be defined in each separate class
	
	public abstract void buttonSixPressed(); //ditto
	
	public void deviceFeedback() { //all devices and remotes have different channels
		
		if (deviceState > maxSetting || deviceState < 0) { deviceState = 0; }
		
		System.out.println("On channel " + deviceState);
		
	}
	
	public void buttonSevenPressed() { //all devices and remotes have volume
		
		volumeLevel++; 
		
		System.out.println("Volume at: " + volumeLevel);
	}
	
	public void buttonEightPressed() { //all devices and remotes have volume
		
		volumeLevel--; 
		
		System.out.println("Volume at: " + volumeLevel);
	}

}
