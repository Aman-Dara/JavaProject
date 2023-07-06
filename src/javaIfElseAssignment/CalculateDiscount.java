package javaIfElseAssignment;

public class CalculateDiscount {

	// Declare variables
	double markedPrice;
	double sellingPrice;
	double discount;
	String promoCode;

	// Create Methods
	void calcualteDiscount() {
		discount = (markedPrice * 50) / 100;
		sellingPrice = markedPrice - discount;
		System.out.println("The price after 50% discount is " + sellingPrice);

		if (promoCode.equals("promo5") || promoCode.equals("promo10") || (promoCode.equals("promo20"))) {
			if (promoCode.equals("promo5")) {
				discount = (sellingPrice * 5) / 100;
				discount = sellingPrice - discount;
				System.out.println("Selling Price after applying promo5  " + discount);
				
			} else if (promoCode.equals("promo10")) {
				discount = (sellingPrice * 10) / 100;
				discount = sellingPrice - discount;
				System.out.println("Selling Price after applying promo10  " + discount);
				
			} else if (promoCode.equals("promo20")) {
				discount = (sellingPrice * 20) / 100;
				discount = sellingPrice - discount;
				System.out.println("Selling Price after applying promo20  " + discount);
			}
		} else {
			System.out.println("Your total is " + sellingPrice);
		}
	}
}
