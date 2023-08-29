package cruiseBookingProgram;

public class SunsetCruise extends Cruise{
	
	double candleLightDinner = 45;
	
	public SunsetCruise(CruiseName cruiseName, double priceForAdult, double priceForChildren, int numOfDays) {
		super(cruiseName, priceForAdult, priceForChildren, numOfDays);
	}
	
	public double getPriceForCandleLightDinner() {
		return candleLightDinner;
	}



}
