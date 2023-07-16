package javaArrayAssignment;

public class PhoneArray {

	String[] phoneSamsungArray = new String[4];
	String[] phoneAppleArray = new String[4];
	String[] phoneGoogleArray = new String[4];
	String phoneEntered;
	String productEntered;

	// populate an array

	void populateArray() {
		phoneSamsungArray[0] = "S20";
		phoneSamsungArray[1] = "S21";
		phoneSamsungArray[2] = "Flip3";
		phoneSamsungArray[3] = "Fold3";
		phoneAppleArray[0] = "iPhone12";
		phoneAppleArray[1] = "iPhone12mini";
		phoneAppleArray[2] = "iPhone11";
		phoneAppleArray[3] = "iPhone13";
		phoneGoogleArray[0] = "GooglePixel6";
		phoneGoogleArray[1] = "GooglePixel6Pro";
		phoneGoogleArray[2] = "GooglePixelPro";
		phoneGoogleArray[3] = "GooglePixel5";

	}

	void printSamsungArray() {

		for (int i = 0; i < phoneSamsungArray.length; i++) {
			if (phoneEntered.equalsIgnoreCase("Samsung")) {
				System.out.println(phoneSamsungArray[i]);
			}
		}

	}

	void printAppleArray() {
		for (int i = 0; i < phoneAppleArray.length; i++) {
			if (phoneEntered.equalsIgnoreCase("Apple")) {
				System.out.println(phoneAppleArray[i]);
			}
		}

	}

	void printGoogleArray() {
		for (int i = 0; i < phoneGoogleArray.length; i++) {
			if (phoneEntered.equalsIgnoreCase("Google")) {
				System.out.println(phoneGoogleArray[i]);
			}
		}

	}

	void findSamsungProductArray() {

		for (int i = 0; i < phoneSamsungArray.length; i++) {
			if (phoneSamsungArray[i].equalsIgnoreCase(productEntered)) {
				System.out.println("Product Selected is " + phoneSamsungArray[i]);
			}
		} 
	}

	void findAppleProductArray() {

		for (int i = 0; i < phoneAppleArray.length; i++) {
			if (phoneAppleArray[i].equalsIgnoreCase(productEntered)) {
				System.out.println("Product Selected is " + phoneAppleArray[i]);
			}
		} 
	}

	void findGoogleProductArray() {
		for (int i = 0; i < phoneGoogleArray.length; i++) {
			if (phoneGoogleArray[i].equalsIgnoreCase(productEntered)) {
				System.out.println("Product Selected is " + phoneGoogleArray[i]);
			}else {
				System.out.println("Please select a product from the list");
				break;
			}
		} 
	}

}
