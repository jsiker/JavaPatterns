// Represents each Observer that is monitoring changes in the subject

public class StockObserver implements Observer {
	
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	// Static counter
	private static int observerIDTracker = 0;
	
	// Used to track observers
	private int observerID;
	
	// Will hold reference to the StockGrabber obj
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber){
		
		//Store the ref to the stockGrabber obj so I can make calls to its methods
		this.stockGrabber = stockGrabber;
		
		// Assign an observer ID and increment the static counter
		this.observerID = ++observerIDTracker;
		
		// Message notifies user of new observer
		System.out.println("New observer: " + this.observerID);
		
		// Add the observer to the Subjects ArrayList
		stockGrabber.register(this);
	}

	public void update(double ibmPrince, double aaplPrice, double googPrice) {

		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		
		printThePrices();
		
	}
	
	public void printThePrices(){
		
		System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice + "\n");
		
	}

}
