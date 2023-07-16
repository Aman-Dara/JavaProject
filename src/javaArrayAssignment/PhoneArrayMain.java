package javaArrayAssignment;

import java.util.Scanner;

public class PhoneArrayMain {

	public static void main(String[] args) {

		PhoneArray phone = new PhoneArray();

		Scanner sc = new Scanner(System.in);

		phone.populateArray();

		System.out.println("Choose one product from below \nSamsung \nApple \nGoogle");

		phone.phoneEntered = sc.next();

		System.out.println("Available products of selected category are ");

		phone.printSamsungArray();

		phone.printAppleArray();

		phone.printGoogleArray();

		System.out.println("Please enter the product name");

		phone.productEntered = sc.next();

		phone.findSamsungProductArray();

		phone.findAppleProductArray();

		phone.findGoogleProductArray();

	}

}
