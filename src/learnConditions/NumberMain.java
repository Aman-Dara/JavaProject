package learnConditions;

import java.util.Scanner;

public class NumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPositiveNegativeNumber PN = new FindPositiveNegativeNumber();
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number : ");
		PN.num = sc.nextInt();

		PN.checkIfNumberIsPositiveOrNegative();

		sc.close();

	}

}
