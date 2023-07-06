package javaProject;

public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating an instance
				Laptop dell =  new Laptop();
				
				//assigning the values
				dell.brandName = "Dell";
				dell.model = "Inspiron 15 3000";
				dell.memory = "500 GB";
				dell.screenSizeInInches = 15.6;
				dell.isWebCamPresent = true;
				
				//Invoking a method
				
				dell.displaySpecifications();
				dell.checkForWebCam();
				

			}

	}


