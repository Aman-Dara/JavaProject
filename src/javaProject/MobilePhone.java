package javaProject;

public class MobilePhone {
	//declaring the variables
		String brandName;
		int model;
		double screenSizeInInches;
		boolean isCameraPresent;
		
	// Creating functions
		void makeCalls() {
			System.out.println("Making Phone Calls from phone"+ " " +brandName +" " +model);
		}
		
		void sendTextMessage() {
			System.out.println("Sending Text Messages");
		}
		
		void TakePictures() {
			System.out.println("Taking Pictures");
		}
}
