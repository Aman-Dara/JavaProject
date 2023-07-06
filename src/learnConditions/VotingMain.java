package learnConditions;

import java.util.Scanner;

public class VotingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiate a class
				VotingAge va = new VotingAge();
				
				Scanner sc = new Scanner(System.in);
				
				//Assign value to variables
				
				System.out.println("Enter Voter's Age: ");
				
				va.voterAge =sc.nextInt();
				
				//Invoke a function
				va.calculateVotingAge();

				sc.close();

	}

}
