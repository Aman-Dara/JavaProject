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

		System.out.println("Enter License Level - NoLicense /G1 or G2");

		il.licenseLevel = sc.next();

		il.checkUserEligibility();

		sc.close();

	}

}
