package javaArrayAssignment;

import java.util.Scanner;

public class FindNameArray {

	String[] nameArray = new String[5];
	String searchName;

	Scanner sc = new Scanner(System.in);

	void populateNameArray() {
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println("Enter name " + (i + 1));
			nameArray[i] = sc.next();
		}
	}

	void printNameArray() {
		System.out.println("Names in the Array are :");
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println(nameArray[i]);
		}
	}

	void printIndexOfArray() {
		System.out.println("Displaying the index of the elements : ");
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println(nameArray[i] + " is at index : " + i);
		}
	}

	void findName() {

		System.out.println("Please enter the name you want to search");
		searchName = sc.next();
		for (int i = 0; i < nameArray.length; i++) {
			if (nameArray[i].equals(searchName)) {
				System.out.println("Entered Name is present in the array at index : " + i);
				break;
			} else {
				System.out.println("Entered Name is not present in the array");
				break;
			}

		}
	}

	void findDuplicates() {

		for (int i = 0; i < nameArray.length; i++) {
			for (int j = i + 1; j <= (nameArray.length - 1); j++) {
				if (nameArray[i].equals(nameArray[j])) {
					System.out.println("Repeating name is " + nameArray[i] + " at index " + i + " and " + j);
					break;
				}
			}
		}
	}

}
