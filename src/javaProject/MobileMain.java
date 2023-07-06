package javaProject;

public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an instance
				MobilePhone iPhone = new MobilePhone();
				//Assigning values to  variables
				iPhone.brandName = "IPhone";
				iPhone.model = 12;
				iPhone.screenSizeInInches = 6.1;
				iPhone.isCameraPresent = true;
				
				//Invoking a Function
				iPhone.makeCalls();
				iPhone.sendTextMessage();
				iPhone.TakePictures();
				
			System.out.println("\n ");
				
				MobilePhone samsung = new MobilePhone();
				
				samsung.brandName = "Samsung";
				samsung.model = 22;
				samsung.screenSizeInInches = 6;
				samsung.isCameraPresent = true;
				
				samsung.makeCalls();
				samsung.sendTextMessage();
				samsung.TakePictures();

	}

}
