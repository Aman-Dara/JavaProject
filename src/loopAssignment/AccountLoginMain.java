package loopAssignment;

import java.util.Scanner;

public class AccountLoginMain {

	public static void main(String[] args) {

		ValidateAccountLogin validate = new ValidateAccountLogin();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Username");
		validate.username = sc.next();

		System.out.println("Enter Password");
		validate.password = sc.next();

		validate.validateUserLogin();
		
		sc.close();

	}

}
