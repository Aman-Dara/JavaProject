package loopAssignment;

public class CheckTankCapacity {

	double currentWaterLevel = 0.25;
	int bucketVolume = 10;
	int maxCapacityOfTank = 95; // assuming max capacity to 95L
	int tankCapacity = 100;
	double waterRemaining;

	void fillTankToCapacity() {

		while (maxCapacityOfTank < tankCapacity) {

			// if there is water in the tank
			if (currentWaterLevel != 0 && currentWaterLevel <= maxCapacityOfTank) {
				System.out.println("Water level in tank " + currentWaterLevel + "L");
				waterRemaining = maxCapacityOfTank - currentWaterLevel;
				currentWaterLevel += bucketVolume;
				System.out.println("You need " + waterRemaining + "L of more water to reach the max capacity");

				if (waterRemaining == 0) {
					System.out.println("You have reached the max capacity!");
					break;
				}
			}

			// if there is no water in the tank
			if (currentWaterLevel == 0 && currentWaterLevel <= maxCapacityOfTank) {
				System.out.println("Water level in tank " + currentWaterLevel + "L");
				waterRemaining = maxCapacityOfTank - currentWaterLevel;
				System.out.println("You need " + waterRemaining + "L of more water to reach the max capacity");
				currentWaterLevel += bucketVolume;
				System.out.println("You need " + waterRemaining + "L of more water to reach the max capacity");

				if (waterRemaining == 0) {
					System.out.println("You have reached the max capacity!");
					break;
				}
			}
		}
	}
}