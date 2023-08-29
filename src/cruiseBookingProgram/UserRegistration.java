package cruiseBookingProgram;

import java.util.Scanner;

public class UserRegistration {

	private String emailAddress;
	private String password =" ABC123";
	private String name;
	private int phoneNumber;

	public UserRegistration(String emailAddress, String password, String name, int phoneNumber) {
		this.password = password;
		this.emailAddress = emailAddress;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public int getphoneNumber() {
		return phoneNumber;
	}
	
	public void changePassword() {
		String enteredPassword;
		String newPassword;
		String oldPassword = "ABC123";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your old password");
		enteredPassword = sc.next();
		if (oldPassword.equals(enteredPassword)) {
			System.out.println("Please enter new password");
			newPassword = sc.next();
			if (newPassword.contains("a-zA-Z0-9") && newPassword.length()==6) {
				oldPassword = newPassword;
				System.out.println("Password changed successfully");
			} else {
				System.out.println(
						"Password does not match the criteria.It should be 6 character long and contains atleast 1 UpperCase & 1 number.");
			}
		}
	}
		
		
	}
	


