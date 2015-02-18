// Receiver

public class Television implements ElectronicDevice{

	private int volume = 0;
	
	public void on() {

		System.out.println("TV is on.");
		
	}

	public void off() {

		System.out.println("TV is off.");

	}

	public void volumeUp() {
		
		volume++;
		
		System.out.println("TV volume @: " + volume);
		
	}

	public void volumeDown() {
		if(volume > 0){
			
			volume--;
			
			System.out.println("TV volume @: " + volume);
			
		} else {
			
			System.out.println("Volume is as low as it goes, Sir! It can't go any lower!");
			
		}

		
	}

	
	
}
