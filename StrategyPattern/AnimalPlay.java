
public class AnimalPlay {

	public static void main(String[] args){
		
		Animal fido = new Dog();
		Animal big = new Bird();
		
		System.out.println("Dog: " + fido.tryToFly());
		System.out.println("Bird: " + big.tryToFly());
		
		// This allows dynamic changes for flyingType
		
		fido.setFlyingAbility(new SupaFly());
		
		System.out.println("Dog: " + fido.tryToFly());
		
	}
}
