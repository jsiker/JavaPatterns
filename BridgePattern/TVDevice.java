/* Concrete Implementor
 * Here is an implementations of the EntertainmentDevice abstract class. It specifies what
 * makes it different from other devices 
 */

public class TVDevice extends EntertainmentDevice {
	
	public TVDevice( int newDeviceState, int newMaxSetting){
		
		deviceState = newDeviceState; // channel or chapter number
		
		maxSetting = newMaxSetting; // max channel or chapter number
	}

	public void buttonFivePressed() {	
		
		System.out.println("Channel down");
		
		deviceState--;
		
	}

	public void buttonSixPressed() {

		System.out.println("Channel up");
		
		deviceState++;
		
	}

}
