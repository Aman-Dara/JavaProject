package learnConditions;

public class FindPositiveNegativeNumber {
	
	//declare variable
	int num;
	
	//create method
	
	void checkIfNumberIsPositiveOrNegative() {
		if(num<0) {
			System.out.println("This is negative number");
		}
		else if (num > 0){
			System.out.println("This is positive number");
		}
		else {
			System.out.println("Number is Zero");
		}
	}


}
