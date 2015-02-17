/*
 * By going this route we have to create a new subclass for an infinite number of pizza.
 * We also have to change prices in many classes when just 1 topping has changed.
 * 
 * Inheritance is static while composition is dynamic.
 * Through composition we can add new functionality
 * by writing new code rather than changing current code.
 */
public class ThreeCheesePizza extends Pizza{
	
	public void setDescription(String newDescription) {
		
	}
	
	public String getDescription() {
		
		return "Mozzarella, Fontina, Parmesan Cheese Pizza";
		
	}
	
	public double getCost() {
		
		return 15.99;
		
	}


}

/*
 * Inheritance (this) is static. That makes me sad.
 */
