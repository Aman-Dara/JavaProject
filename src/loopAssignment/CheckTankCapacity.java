package loopAssignment;

public class CheckTankCapacity {

	int tankCapacityInLitres;
	int bucketCapacityInLitres;

	void fillTankToCapacity() {
		while (bucketCapacityInLitres <= tankCapacityInLitres) {
			System.out.println("The water in tank is " + bucketCapacityInLitres + "L");
			bucketCapacityInLitres += 10;

			if (tankCapacityInLitres > 100) {
				break;
			}

		}
	}
}
