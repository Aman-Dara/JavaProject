package cruiseBookingProgram;

import java.util.Scanner;

public class CruiseMain {

	public static void main(String[] args) {

		Cruise cruise = new Cruise();
		GeneratingInvoice invoice = new GeneratingInvoice();
		UserCount user = new UserCount();
		MealPrice mp = new MealPrice();
		UserDetails ud = new UserDetails(null, null, null, 0);

		Scanner sc = new Scanner(System.in);
		/*System.out.println("Welcome to Cruise Booking.\nPlease press 1 for login and 2 for SignUp to book a cruise.");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			ud.validateCredentials();

			break;
		case 2:
			System.out.println("Enter your Email Address.");
			String email = sc.next();
			System.out.println("Enter your Password");
			String password = sc.next();
			System.out.println("Enter your Name");
			String name = sc.next();
			System.out.println("Enter your Phone Number.");
			int phoneNum = sc.nextInt();
			UserRegistration ug = new UserRegistration(email, password, name, phoneNum);
			System.out.println("Thank you for registering!");
			break;
		default:
			System.out.println("Invalid Selection");
			break;
		}*/

		// ------------Code to Select the Cruise and Meals -----------------
		
		cruise.displayMessage();
		String userChoice = sc.next();
		String userInput;
		switch (userChoice) {
		case "Scenic_Cruise":
			cruise = new ScenicCruise(CruiseName.SCENICCRUISE, 43.99, 12.99, 3);
			cruise.cruiseSelection(userChoice);
			cruise.userSelection(invoice, user, mp, userChoice);
			break;
		case "Sunset_Cruise":
			cruise = new SunsetCruise(CruiseName.SUNSETCRUISE,52.99,15.99,1);
			cruise.cruiseSelection(userChoice);
			cruise.userSelection(invoice, user, mp, userChoice);
			break;
		case "Discovery_Cruise":
			cruise = new DiscoveryCruise(CruiseName.DISCOVERYCRUISE,39.99,9.99,4);
			cruise.cruiseSelection(userChoice);
			cruise.userSelection(invoice, user, mp, userChoice);
			break;
		case "Mystery_Cruise":
			cruise = new MysteryCruise(CruiseName.MYSTERYCRUISE,45.99,12.99,2);
			cruise.cruiseSelection(userChoice);
			cruise.userSelection(invoice, user, mp, userChoice);
			break;
		}

	}
	}
	
