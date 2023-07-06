package javaIfElseAssignment;

import java.util.Scanner;

public class LicenseMain {

	public static void main(String[] args) {
		// Instantiate a Class
		IssueLicense il = new IssueLicense();

		Scanner sc = new Scanner(System.in);

		// Assign Value to Variables

		System.out.println("Enter the Age of the person");

		il.age = sc.nextInt();

		System.out.println("Enter License Level - 0 for No License /1 for G1/ 2 for G2");

		il.licenseLevel = sc.nextInt();

		il.checkUserEligibility();

		sc.close();

	}

}
