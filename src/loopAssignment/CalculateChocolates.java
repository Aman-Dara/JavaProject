package loopAssignment;

public class CalculateChocolates {

	int chocolateCount;
	int maxChocolates;

	void addChocolates() {
		while (chocolateCount <= maxChocolates) {
			System.out.println("Total chocolates in the box " + chocolateCount);	
			chocolateCount += 5;
			if(chocolateCount==63) {
				break;
			}
		}
	}

}
