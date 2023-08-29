package cruiseBookingProgram;

import java.util.Scanner;

public class GeneratingInvoice implements Invoice {

	@Override
	public void getNumOfAdults(UserCount user) {
		user.getNumOfAdults();
	}

	public void getNumOfKids(UserCount user) {
		user.getNumOfKids();
	}

	Scanner sc = new Scanner(System.in);

	public void calculation(Cruise cruise, UserCount user, MealPrice mp,String userChoice) {

		System.out.println(
				"All our cruises have food service on board. Do you want to pre-book for dinner buffer meals at $20.99 for adults and $4.99 for kids?");
		String userInput = sc.next();
		if (userInput.equalsIgnoreCase("Yes")) {
			int adultCount = user.getNumOfAdults();
			int kidCount = user.getNumOfKids();
			double cruisePriceForAdult = adultCount*getCruisePriceAdult(cruise,userChoice)*cruise.getNumOfDays(userChoice) ;
			double cruisePriceForKid = kidCount * getCruisePriceKid(cruise,userChoice,user)*cruise.getNumOfDays(userChoice);
			double buffetPriceForAdult = adultCount * MealPrice.getMealPriceForAdult()*cruise.getNumOfDays(userChoice);
			double buffetPriceForKids = kidCount * MealPrice.getMealPriceForKid()*cruise.getNumOfDays(userChoice);
			double totalPrice = (double) Math.round(cruisePriceForAdult + cruisePriceForKid + buffetPriceForAdult + buffetPriceForKids);
			double hst = (double) Math.round((15 * totalPrice) / 100);
			double finalPrice = (double) Math.round(totalPrice + hst);

			System.out.println("Your Package Includes : \n");
			System.out.println("Cruise Price Adults @ : " + user.numOfAdults + " : $" + cruisePriceForAdult);
			System.out.println("Cruise Price Kids @ : " + user.numOfKids + " : $" + cruisePriceForKid);
			System.out.println("Buffet Special Price Adults @ : " + user.numOfAdults + " : $" + buffetPriceForAdult);
			System.out.println("Buffet Special Price For Kids Above 5  @ : " + user.numOfKids + " : $" + buffetPriceForKids);
			System.out.println("Total Price : " + totalPrice);
			System.out.println("HST @ 15% : $" + hst);
			System.out.println("Final Price : $" + finalPrice);		
			
		} else if (userInput.equalsIgnoreCase("No")) {
			int adultCount = user.getNumOfAdults();
			int kidCount = user.getNumOfKids();
			double cruisePriceForAdult = adultCount *getCruisePriceAdult(cruise, userChoice)*cruise.getNumOfDays(userChoice) ;
			double cruisePriceForKid = kidCount* getCruisePriceKid(cruise, userChoice,user)*cruise.getNumOfDays(userChoice);
			double totalPrice = (double) Math.round(cruisePriceForAdult + cruisePriceForKid);
			double hst = (double) Math.round((15 * totalPrice) / 100);
			double finalPrice = (double) Math.round(totalPrice + hst);

			System.out.println("Your Package Includes : \n");
			System.out.println("Cruise Price Adults @ : " + user.numOfAdults + " : $" + cruisePriceForAdult);
			System.out.println("Cruise Price Kids @ : " + user.numOfKids + " : $" + cruisePriceForKid);
			System.out.println("Total Price : " + totalPrice);
			System.out.println("HST @ 15% : $" + hst);
			System.out.println("Final Price : $" + finalPrice);
		} else {
			System.out.println("Invalid Selection");
		}

	}
	
	public double getCruisePriceAdult(Cruise cruise,String userChoice) {
		if (userChoice.equalsIgnoreCase("Scenic_Cruise")) {
			return cruise.priceForAdult;
		} else if (userChoice.equalsIgnoreCase("Sunset_Cruise")) {
			return cruise.priceForAdult;
		} else if (userChoice.equalsIgnoreCase("Discovery_Cruise")) {
			return cruise.priceForAdult;
		} else if (userChoice.equalsIgnoreCase("Mystery_Cruise")) {
			return cruise.priceForAdult;
		}

		return cruise.priceForAdult;
	}
	
	public double getCruisePriceKid(Cruise cruise, String userChoice,UserCount user) {
		if(user.ageOfChildren > 5) {
		if (userChoice.equalsIgnoreCase("Scenic_Cruise")) {
			return cruise.priceForChildren;
		} else if (userChoice.equalsIgnoreCase("Sunset_Cruise")) {
			return cruise.priceForChildren;
		} else if (userChoice.equalsIgnoreCase("Discovery_Cruise")) {
			return cruise.priceForChildren;
		} else if (userChoice.equalsIgnoreCase("Mystery_Cruise")) {
			return cruise.priceForChildren;
		}
		}else {
			return Cruise.priceForChildrenBelow5;
		}

		return cruise.priceForChildren;
	}	
	
	//------------------------ Generating Invoice For Hotel Booking --------------------
	public void hotelBookingPriceWithMeal(String userChoice) {
		System.out.println("Enter the number of stay");
		int userInput = sc.nextInt(); 
		System.out.println("The amount you will charged is");
		switch(userChoice) {
		case "Deluxe_Room":
			System.out.println(userChoice + " @ " + userInput + ": " + userInput * HotelPrice.priceForDeluxe);
			hotelPriceCalWithMeal(userInput);
			break;
		case "Family_Suite":
			System.out.println(userChoice + " @ " + userInput + ": " + userInput * HotelPrice.priceForFamilySuite);
			hotelPriceCalWithMeal(userInput);
			break;			
		}
	}

	public void hotelPriceCalWithMeal(int userInput) {
		double lunchPriceForAdult = userInput * HotelPrice.hotelLunchPriceForAdult;
		double lunchPriceForChild = userInput * HotelPrice.hotelLunchPriceForChild;
		double totalPrice = lunchPriceForAdult + lunchPriceForChild;
		double hst = (18*totalPrice)/100;
		double finalPrice = hst+totalPrice;
		System.out.println("Lunch Pre-Booked Special Rate Adults @"+userInput +": "+lunchPriceForAdult);
		System.out.println("Lunch Pre-Booked Special Rate Children @"+userInput +": "+lunchPriceForChild);
		System.out.println("Total Price :" +totalPrice);
		System.out.println("HST @18 : "+hst);
		System.out.println("Final Price : "+finalPrice);
	}
	
	public void hotelBookingPriceWithoutMeal(String userChoice, int userInput) {
		System.out.println("The amount you will charged is");
		switch(userChoice) {
		case "Deluxe_Room":
			double totalPrice = userInput * HotelPrice.priceForDeluxe;
			System.out.println(userChoice + " @ " + userInput + ": " +totalPrice );
			double hst = (18*totalPrice)/100;
			double finalPrice = hst+totalPrice;
			System.out.println("Total Price :" +totalPrice);
			System.out.println("HST @18 : "+hst);
			System.out.println("Final Price : "+finalPrice);
			break;
		case "Family_Suite":
			double totalPriceFS = userInput * HotelPrice.priceForFamilySuite;
			System.out.println(userChoice + " @ " + userInput + ": " +totalPriceFS );
			double hstFS = (18*totalPriceFS)/100;
			double finalPriceFS = hstFS+totalPriceFS;
			System.out.println("Total Price :" +totalPriceFS);
			System.out.println("HST @18 : "+hstFS);
			System.out.println("Final Price : "+finalPriceFS);
			break;			
		}
	}
	
	

}
