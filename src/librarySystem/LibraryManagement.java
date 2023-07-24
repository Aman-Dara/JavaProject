package librarySystem;

import java.util.Scanner;

public class LibraryManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean isBookBorrowed = false;
		int numOfBooksIssued = 0;
		int userChoice;

		Book harryPotter = new Book("JK Rowling", "Goblet_Of_Fire", 2, false);
		Book will = new Book("Will Smith", "Will", 3, false);
		Book origin = new Book("Dan Brown", "Origin", 5, false);
		Book missing = new Book("Sumana Roy", "Missing", 2, false);
		Book frozen = new Book("Victoria Saxson", "Frozen", 1, false);

		Users joe = new Users("Joe", 123);
		Users john = new Users("John", 456);
		Users mel = new Users("Mel", 789);
		
		String[] totalIssuedBooks = new String[2]; // A user can take only 2 books 

		Book[] nameOfTheBooks = { harryPotter, will, origin, missing, frozen };
		Users[] allUsers = { joe, john, mel };

		// Displaying all the books and Quantity
		System.out.println("Below are the books available & quantity");
		for (int j = 0; j < nameOfTheBooks.length; j++) {
			System.out.println(nameOfTheBooks[j].bookName + " " + nameOfTheBooks[j].bookQty);
		}
		System.out.println("Registered users are ");
		for (int j = 0; j < allUsers.length; j++) {
			System.out.println(allUsers[j].nameOfUser);
		}

		System.out.println("Enter user library card number");
		int libCard = sc.nextInt();
		for (int i = 0; i < allUsers.length; i++) {
			if (allUsers[i].libraryCardNum == libCard) {
				System.out.println(
						allUsers[i].nameOfUser + " is registered User with library card number  "+libCard+ " \nPlease choose an option below to continue");
			}else {
				System.out.println("User is not registered");
				break;
			}
			System.out.println("Press 1 to issue a book & 2 to return a book");
			userChoice = sc.nextInt();
			switch (userChoice) {

			case 1:

				while (numOfBooksIssued <= 2) {
					System.out.println("Enter the name of the book you want to issue");
					String bookIssue = sc.next();
					for (i = 0; i < nameOfTheBooks.length; i++) {
						if (nameOfTheBooks[i].bookName.equalsIgnoreCase(bookIssue)
								&& nameOfTheBooks[i].isIssued == false) {
							nameOfTheBooks[i].isIssued = true;
							System.out.println("Book has been issued successfully \n");
							numOfBooksIssued++;
							isBookBorrowed = true;
							nameOfTheBooks[i].bookQty--;
							System.out.println("Remaining Quantity of book " + nameOfTheBooks[i].bookName + " is  "
									+ nameOfTheBooks[i].bookQty);
							//totalIssuedBooks =  nameOfTheBooks[i].bookName;
							break;
						}
						if (nameOfTheBooks[i].bookQty == 0) {
							System.out.println("Out of Stock");
							break;
						}

						if (nameOfTheBooks[i].bookName.equalsIgnoreCase(bookIssue) && isBookBorrowed == true) {
							System.out.println("This book has been issued already. Please choose another book");
							break;
						}

						if (numOfBooksIssued == 2) {
							System.out.println("You have reached the maximum limit of " + numOfBooksIssued + " books");
							//System.out.println("Below are the books listed to user " +libCard+"\n"+ totalIssuedBooks[i]);
							break;
						}
					}
				}
				break;
			case 2:
				System.out.println("Enter the name of the book you want to return ");
				String bookReturn = sc.next();
				for (i = 0; i < nameOfTheBooks.length; i++) {
					if (nameOfTheBooks[i].bookName.equalsIgnoreCase(bookReturn)) {
						System.out.println("Book has been returned successfully \n");
						isBookBorrowed = false;
						nameOfTheBooks[i].bookQty++;
						System.out.println("Quantity Updated of book " + nameOfTheBooks[i].bookName + " to "
								+ nameOfTheBooks[i].bookQty);

					}
				}
				break;

			default:
				System.out.println("Thank you for your time!");
				break;

			}
			break;
		}
	}

	private static void exit() {
		// TODO Auto-generated method stub

	}
}