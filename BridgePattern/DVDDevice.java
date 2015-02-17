// Concrete Implementor for TV/DVD

public class DVDDevice extends EntertainmentDevice {

	public DVDDevice(int newDeviceState, int newMaxSetting){
		
		deviceState = newDeviceState;
		
		maxSetting = newMaxSetting;
		
	}
	
	public void buttonFivePressed() {
		
		System.out.println("Chapter down");
		
		deviceState--;
		
	}

	public void buttonSixPressed() {
		
		System.out.println("Chapter up");
		
		deviceState++;
		
	}

}
