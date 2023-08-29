package cruiseBookingProgram;

public class MealPrice {

	static double mealPriceForAdult = 20.99;
	static double mealPriceForKid = 4.99;
	static double mealPriceForKidBelow5 = 0.00;

	public static double getMealPriceForAdult() {
		return mealPriceForAdult;
	}

	public static double getMealPriceForKid() {
		UserCount user = new UserCount();
		if(user.ageOfChildren < 5) {
			return mealPriceForKidBelow5;
		}
		return mealPriceForKid;
	}
	
	public static double getMealPriceForKidBelow5() {
		return mealPriceForKidBelow5;
	}
	
	
	
}
