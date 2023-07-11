package loopAssignment;

public class CheckTankCapacity {

	int currentWaterLevel = 7; // assuming there is already 7L water in the tank
	int amountToBeFilledInLitres = 10;
	int maxCapacityInLitres = 97; // assuming max capacity to 97L

	void fillTankToCapacity() {

		while (currentWaterLevel <= maxCapacityInLitres) {
			System.out.println("The water in tank is " + currentWaterLevel + "L");
			currentWaterLevel += amountToBeFilledInLitres;

			if (currentWaterLevel == maxCapacityInLitres) {
				System.out.println("You have reached the maximum Capacity!!");
				break;
			}

		}
	}
}
