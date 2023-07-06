package learnConditions;

public class FindGreatestNumber {
	//Write a Java program that takes three numbers from the user and prints the greatest number.
	
		//declare variables
		int num1,num2,num3;
		
		//create method
		void findTheGreatestNumber() {
			if(num1>num2 && num1>num3) {
				System.out.println("The greatest number is " +num1);
		}else if(num2>num1 && num2 >num3) {
			System.out.println("The greatest number is " +num2);
		}else {
			System.out.println("The greatest number is "+num3);
		}
		}
		//Write a Java program that takes three numbers from the user and prints the sum.
		void sumOfTheNumbers() {
			int sum=num1+num2+num3;
			System.out.println("The sum of three numbers is "+sum);
		}


}
