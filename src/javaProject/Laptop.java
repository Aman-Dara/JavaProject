package javaProject;

public class Laptop {
	//Declaring variables
		 String brandName;
		 String model;
		 double screenSizeInInches;
		 String memory;
		 boolean isWebCamPresent;
		 
		 //Creating methods
		 
		 void displaySpecifications() {
			 System.out.println("The laptop Specifications are: \n" +brandName +" " +model + " "+memory + " "+screenSizeInInches);
		 }
		 
		 void checkForWebCam() {
			 System.out.println("Is WebCam Present" +" "+isWebCamPresent);
		 }
		 

}
