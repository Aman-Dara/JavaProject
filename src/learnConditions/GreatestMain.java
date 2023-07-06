package learnConditions;

import java.util.Scanner;

public class GreatestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiate the class
		
				FindGreatestNumber gn = new FindGreatestNumber();
				
				Scanner sc = new Scanner(System.in);
				
				//Assign the value to variables
				
				System.out.println("Enter the first number");
				gn.num1 = sc.nextInt();
				System.out.println("Enter the second number");
				gn.num2 = sc.nextInt();
				System.out.println("Enter the third number");
				gn.num3 = sc.nextInt();
				
				gn.findTheGreatestNumber();
				//gn.sumOfTheNumbers();
				
				sc.close();
				


	}

}
