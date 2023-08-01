package libraryMiniProject;

import java.util.Scanner;

public class UserDetails {
	
	Scanner sc = new Scanner(System.in);

	User userJoe = new User("Joe",122,false);
	User userMelanie = new User("Melanie",133,false);
	User userAman = new User("Aman",145,false);
	User userSam = new User("Sam",150,false);
	User userJohn = new User("John",144,false);
	
	User[] registeredUsers = {userJoe,userMelanie, userAman,userSam, userJohn};
	
	public void displayUsers() {
		System.out.println("Below are registered users with Brampton Library");
		for (int i = 0; i < registeredUsers.length; i++) {
			System.out.println(registeredUsers[i].userName + " - registration number "+ registeredUsers[i].libraryCardNum);
		}
	}
	
	public void addUser() {
		System.out.println("Enter the name of the user");
		String newUser = sc.next();
		System.out.println("Enter the library Card Number");
		int newRegNum = sc.nextInt();
		for (int i = 0; i < registeredUsers.length; i++) {
			if (registeredUsers[i].userName.equalsIgnoreCase(newUser)
					&& registeredUsers[i].libraryCardNum == newRegNum) {
				System.out.println("User is already registered");
				break;
			} else {
				System.out.println("User is not registered,Please register the user first");
				break;
			}
		}
	}
	

}
