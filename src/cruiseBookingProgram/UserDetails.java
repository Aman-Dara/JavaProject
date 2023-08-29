package cruiseBookingProgram;

import java.util.Scanner;

public class UserDetails extends UserRegistration{

	public UserDetails(String emailAddress, String password, String name, int phoneNumber) {
		super(emailAddress, password, name, phoneNumber);
	}
	
	UserRegistration userMel = new UserRegistration("ABC@XYZ","ABC@1","Mel",123456);
	UserRegistration userJohn = new UserRegistration("DEF@XYZ","DEF@1","John",789101);
	
	UserRegistration[] allUsers = {userMel,userJohn};
	
	Scanner sc = new Scanner(System.in);
	
	boolean validateCredentials() {
		int numOfAttempts = 1;
		boolean loginStatus = false;
		while(numOfAttempts < 3) {
			System.out.println("Enter your Email");
			String enteredEmail = sc.next();
			System.out.println("Enter your password");
			String enteredPassword = sc.next();
			for(int i=0;i<allUsers.length;i++) {
				if(allUsers[i].getEmailAddress().equalsIgnoreCase(enteredEmail) && allUsers[i].getPassword().equals(enteredPassword)) {
					loginStatus = true;
					System.out.println("Welcome back, "+allUsers[i].getName());
					return loginStatus;
				}numOfAttempts++;
				if(loginStatus == false && numOfAttempts < 3) {
					System.out.println("Incorrect Login ID and password");
				}else {
					System.out.println("Too many failed attempts!Please try after some time");
				}
			}
			
		}
		
		return loginStatus;
		
	}

}
