package cruiseBookingProgram;

import java.util.Scanner;

public class HotelBooking {

	Rooms roomType;

	public HotelBooking(Rooms roomType) {
		this.roomType = roomType;
	}

	enum Rooms {
		DELUXEROOM("Deluxe_Room"), 
		FAMILYSUITE("Family_Suite");

		String roomType;

		Rooms(String roomType) {
			this.roomType = roomType;
		}

		public String getTypeOfRoom() {
			return roomType;
		}

	}
	Scanner sc = new Scanner(System.in);
	public void displayMenu(String userChoice,UserCount user,GeneratingInvoice invoice,int userInput) {
		System.out.println("Please enter the room you want to stay. \nDeluxe_Room \nFamily_Suite");
		System.out.println("Deluxe Room : accomodates 2 adults and 2 children at the rate of $180/night.");
		System.out.println("Family Suite : accomodates 4 adults and 4 children at the rate of $230/night.");
		userChoice = sc.next();
		
		int adultCount = user.getNumOfAdults();
		int kidCount = user.getNumOfKids();
		int totalGuest = adultCount + kidCount;
		if(totalGuest>4 && userChoice.equalsIgnoreCase("Deluxe_Room")) {
			System.out.println("Room is not suitable for the number of guests.Please try again or select separate rooms one at a time");
		}else if(totalGuest>8 && userChoice.equalsIgnoreCase("Family_Suite")) {
			System.out.println("Room is not suitable for the number of guests. Please try again or select separate rooms one at a time");
		}System.out.println("All the rooms come with free breakfast.Do you want to add lunch in your room as well as prebooking discounted pre-booking rate of $25/adult and $5/child");
		if(userChoice.equalsIgnoreCase("Yes")) {
			invoice.hotelBookingPriceWithMeal(userChoice);	
		}else if(userChoice.equalsIgnoreCase("No")) {
			invoice.hotelBookingPriceWithoutMeal(userChoice, userInput);
		}else {
			System.out.println("Invalid Selection");
		}
	}

}
