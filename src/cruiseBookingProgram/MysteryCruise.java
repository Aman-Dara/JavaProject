package cruiseBookingProgram;

public class MysteryCruise extends Cruise{
	
	double casinoTicket = 20;
	
	public MysteryCruise(CruiseName cruiseName, double priceForAdult, double priceForChildren, int numOfDays) {
		super(cruiseName, priceForAdult, priceForChildren, numOfDays);
	}
	public double getCasinoTicket() {
		return casinoTicket;
	}




}
