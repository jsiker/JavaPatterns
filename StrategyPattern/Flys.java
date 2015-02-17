/*
 * The interface is implemented by many other subclasses that allow for many types of flying
 * without effecting Animal, or Flys.
 * 
 * Classes that implement new Flys interface subclasses can allow other classes to use
 * that code, eliminating code duplication. DRY!
 * 
 * I'm decoupling : encapsulating the concept that varies
 */

public interface Flys {
	
	String fly();

}

// Class used if Animal can fly

class ItFlys implements Flys{
	
	public String fly() {
		
		return "I'm flyin', Pa! :)";
	}
}

// Class used if the Animal can't fly

class CantFly implements Flys{
	
	public String fly() {
		
		return "I can't fly, Pa. :(";
		
	}
}

// SupaFly

class SupaFly implements Flys{
	
	public String fly() {
		
		return "I'm flyin' so fast, Pa! :D";
		
	}
}
