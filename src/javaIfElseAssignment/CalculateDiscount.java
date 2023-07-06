package javaIfElseAssignment;

public class CalculateDiscount {

	// Declare variables
	double markedPrice;
	double sellingPrice;
	double priceAfter50PercentDiscount;
	double promoCode;
	double discountAfterPromoCode;
	double amountAfterAddDiscount; // amount after additional discount

	// Create Methods
	void calcualteDiscount() {
		priceAfter50PercentDiscount = (markedPrice * 50) / 100;
		sellingPrice = markedPrice - priceAfter50PercentDiscount;
		System.out.println("The price after 50% discount is " + sellingPrice);
	}

	void caluculateAdditionalDiscount() {
		if (promoCode == 5 || promoCode == 10 || promoCode == 20) {
			discountAfterPromoCode = (sellingPrice * promoCode) / 100;
			amountAfterAddDiscount = sellingPrice - discountAfterPromoCode;
			System.out.println(
					"Selling Price after " + promoCode + " Percent additional discount =" + amountAfterAddDiscount);
		} else {
			System.out.println("Your total is " + sellingPrice);
		}

	}

}
