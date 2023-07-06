package learnConditions;

public class VotingAge {
	//Declare the Variables
	
	int voterAge;
	int minimumVotingAge = 18 ;
	
	// Create methods
	
	void calculateVotingAge() {
		if (voterAge >= minimumVotingAge)
			System.out.println("You are allowed to vote");					
		else {
		System.out.println("You are not allowed to vote");
	}
	}
}
