package javaIfElseAssignment;

import java.util.Scanner;

public class DiscountMain {

	public static void main(String[] args) {
		// Instantiate a Class

		CalculateDiscount cd = new CalculateDiscount();

		Scanner sc = new Scanner(System.in);

		// Assign Value to Variables

		System.out.println("Enter the marked price of the product");

		cd.markedPrice = sc.nextDouble();

		cd.calcualteDiscount();

		System.out.println("Please enter the promo Code (5% 10% Or 20%) if available otherwise enter 0 to continue");

		cd.promoCode = sc.nextDouble();

		cd.caluculateAdditionalDiscount();

		sc.close();
	}

}
