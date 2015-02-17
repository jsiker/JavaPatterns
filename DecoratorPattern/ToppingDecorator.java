// Has a "Has a" relationship with Pizza. This is an Aggregation Relationship (open diamond on Pizza)

abstract class ToppingDecorator implements Pizza {
	
	protected Pizza tempPizza;
	
	// Assigns the type instance to this attribute of a Pizza
	
	// All decorators can dynamically customize the Pizza instance PlainPizza b/c of this
	
	public ToppingDecorator(Pizza newPizza) {
		
		tempPizza = newPizza;
		
	}
	
	public String getDescription() {
		
		return tempPizza.getDescription();
		
	}
	
	public double getCost() {
		
		return tempPizza.getCost();
		
	}

}
