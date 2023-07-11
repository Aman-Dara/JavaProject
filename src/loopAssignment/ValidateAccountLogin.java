package loopAssignment;

import java.util.Scanner;

public class ValidateAccountLogin {

	Scanner scan = new Scanner(System.in);

	String usernameInSystem = "pivotAdmin";
	String passwordInSystem = "Admin123";
	String username;
	String password;
	int totalAttempts = 1;

	void validateUserLogin() {
		while (totalAttempts <= 3) {
			System.out.println("Enter Username");
			username = scan.next();

			System.out.println("Enter Password");
			password = scan.next();

			if (username.equals(usernameInSystem) && password.equals(passwordInSystem)) {
				System.out.println("You are logged into the application.");
				break;
			} else {
				System.out.println("Invalid Username Or Password, Please Try Again!");

				totalAttempts++;
			}
			if (totalAttempts > 3) {
				System.out.println("Account Locked");
			}
		}
	}
}
