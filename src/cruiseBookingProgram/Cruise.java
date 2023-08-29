package cruiseBookingProgram;

import java.util.Scanner;

public class Cruise {
	
	CruiseName cruiseName;
	double priceForAdult;
	double priceForChildren;
	int numOfDays;
	static int priceForChildrenBelow5 = 0;
	
	public Cruise(CruiseName cruiseName,double priceForAdult,double priceForChildren,int numOfDays){
		this.cruiseName = cruiseName;
		this.priceForAdult = priceForAdult;
		this.priceForChildren = priceForChildren;
		this.numOfDays = numOfDays;
	}
	public Cruise() {
		
	}
	
	public void displayMessage() {
		System.out.println("We offer 4 different packages as displayed below. Please enter the cruise that you want to select");
		System.out.println("1.Scenic_Cruise \n2.Sunset_Cruise \n3.Discovery_Cruise \n4.Mystery_Cruise");
	}
	
	public int getNumOfDays(String userChoice) {
		return numOfDays;
	}
	public double getPriceForAdult(String userChoice) {
		return priceForAdult;
	}
	
	public double getPriceForKid(String userChoice) {
		return priceForChildren;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void cruiseSelection(String userChoice) {
		String formattedText = String.format("The cruise you have selected is %s which is a " + getNumOfDays(userChoice) + " days cruise",userChoice);
		System.out.println(formattedText);
		System.out.println("Price for Adults (greater than 12): $" +getPriceForAdult(userChoice));
		System.out.println("Price for Kids above 5: $" +getPriceForKid(userChoice));
		System.out.println("Please press Y to continue with this selection or Press any other alphabet to return to main menu");
	}
	
	public void userSelection(GeneratingInvoice invoice, UserCount user, MealPrice mp, String userChoice) {
		String userInput = sc.next();
		if (userInput.matches("[a-xA-XzZ]")) {
			displayMessage();
			String chooseAgain = sc.next();
			cruiseSelection(chooseAgain);
		}
	}

}


	
	
	
	


