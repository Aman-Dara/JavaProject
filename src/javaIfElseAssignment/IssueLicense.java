package javaIfElseAssignment;

public class IssueLicense {

	int age;
	String licenseLevel;

	void checkUserEligibility() {
		if (age >= 16 && licenseLevel.equals("No License")) {
			System.out.println("You are eligible for G1 License");
		} else if (age >= 16 && licenseLevel.equals("G1")) {
			System.out.println("You are eligible for G2");
		} else if (age >= 16 && licenseLevel.equals("G2")){
			System.out.println("You are eligible for G");
		}

		else {
			System.out.println("You are not eligible");
		}
	}
}
