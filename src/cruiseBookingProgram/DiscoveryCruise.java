package cruiseBookingProgram;

public class DiscoveryCruise extends Cruise {
	
	static double adventureGames = 50;
	
	public DiscoveryCruise(CruiseName cruiseName, double priceForAdult, double priceForChildren, int numOfDays) {
		super(cruiseName, priceForAdult, priceForChildren, numOfDays);
	}
	
	public double getEntryTicketForGames() {
		return adventureGames;
	}

	

}
