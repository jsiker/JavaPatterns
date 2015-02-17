
public class PizzaMaker {
	
	public static void main(String[] args){
		
		// The PlainPizza object is sent to the Moz constructor, then the TomatoSauce constructor
		
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		
		System.out.println("Ingredients: " + basicPizza.getDescription());
		
		System.out.println("Price: " + basicPizza.getCost());
		
	}
}
