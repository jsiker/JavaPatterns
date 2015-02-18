
public class Radio implements ElectronicDevice{
	
	private int volume = 0;
	
	public void on() {
		
		System.out.println("Radio is on.");
	
	}
	
	public void off() {
		
		System.out.println("Radio is off.");
		
	}
	
	public void volumeUp() {
		
		volume++;
		
		System.out.println("Radio volume is @: " + volume);
		
	}
	
	public void volumeDown(){
		
		if(volume > 0){
			
			volume--;
			
			System.out.println("Radio volume is @: " + volume);
			
		} else {
			
			System.out.println("Volume is as low as it can go, sir! It can't go any lower!");
			
		}
		
	}
		
}

