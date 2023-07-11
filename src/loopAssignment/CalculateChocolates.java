package loopAssignment;

public class CalculateChocolates {

	int minChocolatesInABox = 27;
	int maxChocolates = 63;

	void addChocolates() {
		while (minChocolatesInABox != maxChocolates) {

			System.out.println("Total number of chocolates after adding 5 chocolates " + minChocolatesInABox );
			minChocolatesInABox += 5;
			
			if(minChocolatesInABox > maxChocolates) {
				break;
			}

		}
	}

}
