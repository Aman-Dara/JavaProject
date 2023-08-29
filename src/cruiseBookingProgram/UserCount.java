package cruiseBookingProgram;

import java.util.Scanner;

public class UserCount {

	int numOfAdults;
	int numOfKids;
	int ageOfChildren;
	int cruisePriceForKidsBelowFive = 0;

	Scanner sc = new Scanner(System.in);

	public int getNumOfAdults() {
		System.out.println("Enter the number of Adults");
		return numOfAdults = sc.nextInt();

	}

	public int getNumOfKids() {
		System.out.println("Enter the number of Kids");
		numOfKids = sc.nextInt();
		int i = 1;
		do {
			if (numOfKids != 0) {
				System.out.println("Enter the age of Child " + i);
				ageOfChildren = sc.nextInt();
				i++;
			}
		} while (i <= numOfKids);
		return numOfKids;
	}

}
