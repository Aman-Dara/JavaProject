package cruiseBookingProgram;

public class ScenicCruise extends Cruise {

	static double scenicSpa = 50;

	public ScenicCruise(CruiseName cruiseName, double priceForAdult, double priceForChildren, int numOfDays) {
		super(cruiseName, priceForAdult, priceForChildren, numOfDays);

	}

	public double getSpaPrice() {
		return scenicSpa;
	}

}
