package libraryMiniProject;

import java.util.Scanner;

public class BookDetails {

	Scanner sc = new Scanner(System.in);

	int numOfBooksIssued = 0;

	Book harryPotter = new Book("Goblet_Of_Fire", "JK Rowling", 2, false,Genre.FICTION);
	Book will = new Book("Will", "Will Smith", 3, false,Genre.NONFICTION);
	Book origin = new Book("Origin", "Dan Brown", 5, false,Genre.FICTION);
	Book missing = new Book("Missing", "Sumana Roy", 2, false,Genre.CRIME);
	Book frozen = new Book("Frozen", "Victoria Saxson", 1, false,Genre.CHILDREN);
	Book squire = new Book("Squire", "Sara", 2, false,Genre.COMIC);
	Book ducks = new Book("Ducks", "Kate Beaton", 1, false,Genre.COMIC);
	Book rave = new Book("Rave", "Jesicca Campbell", 4, false,Genre.COMIC);
	Book shelter = new Book("Shelter_Belts", "Johnathan", 2, false,Genre.COMIC);
	Book train = new Book("A_Train_In_The_Night", "Kale", 3, false,Genre.COMIC);
	Book sherlock = new Book("Sherlock_Holmes", "Arthur Conan", 5, false,Genre.CRIME);
	Book devil = new Book("Devil_In_The_City", "Erik Larson", 1, false,Genre.CRIME);
	Book manson = new Book("Manson", "Jeff Douglan", 3, false,Genre.CRIME);
	Book killings = new Book("Killings", "Kevin Trillen", 2, false,Genre.CRIME);
	Book rory = new Book("Rory's_Racecar", "John Pete", 2, false,Genre.CHILDREN);
	Book island = new Book("Grandad's Island", "Benji Devies", 5, false,Genre.CHILDREN);
	Book tiger = new Book("The_Teeny_Tiger", "Beau Bergeron", 1, false,Genre.CHILDREN);
	Book cat = new Book("The_Cat_In_The_Hat", "Dr Seuss", 1, false,Genre.CHILDREN);
	Book fire = new Book("Fire_Dance", "Ileana Myer", 2, false,Genre.FICTION);
	Book war = new Book("The_War_Of_Swords", "D. Barkley Briggs", 7, false,Genre.FICTION);
	Book stars = new Book("The_Calculating_Stars", "Mary Kowell", 3, false,Genre.FICTION);
	Book brave = new Book("Brave_Not_Perfect", "Reshma Saujani", 2, false,Genre.NONFICTION);
	Book brown = new Book("Brown_Baby", "Nikhil Shukla", 1, false,Genre.NONFICTION);
	Book relativity = new Book("Relativity", "Albert Einstein", 3, false,Genre.NONFICTION);
	Book barackObama = new Book("Barack Obama", "Barack Obama", 3, false,Genre.NONFICTION);

	Book[] nameOfTheBooks = { harryPotter, will, origin, missing, frozen, squire, ducks, rave, shelter, train, sherlock,
			devil, manson, killings, rory, island, tiger, cat, fire, war, stars, brave, brown, relativity, barackObama};
	
	

	void displayMenu() {
		System.out.println("Welcome to Brampton Library");
		System.out.println("Please choose the following options to continue");
		System.out.println("Press 1 to view all books and available quantity");
		System.out.println("Press 2 to display all the registered users ");
		System.out.println("Press 3 to Search book by genre ");
		System.out.println("Press 4 to issue or return books");
		System.out.println("Press 5 to add new User ");
		
		
	}

	public void displayBooks() {
		for (int i = 0; i < nameOfTheBooks.length; i++) {
			System.out.println(nameOfTheBooks[i].bookName + " by " + nameOfTheBooks[i].authorName + " "
					+ nameOfTheBooks[i].bookQty);
		}
	}

	public void issueBooks() {
		while (numOfBooksIssued <= 2) {
			System.out.println("Enter the name of the book you want to issue");
			String bookIssue = sc.next();
			for (int i = 0; i < nameOfTheBooks.length; i++) {
				if (nameOfTheBooks[i].bookName.equalsIgnoreCase(bookIssue) && nameOfTheBooks[i].isIssued == false) {
					nameOfTheBooks[i].isIssued = true;
					System.out.println("The book has been issued successfully");
					numOfBooksIssued++;
					nameOfTheBooks[i].bookQty--;
					System.out.println("Remaining Quantity of book " + nameOfTheBooks[i].bookName + " is  "
							+ nameOfTheBooks[i].bookQty);
					break;
				}if (nameOfTheBooks[i].bookName.equalsIgnoreCase(bookIssue) && nameOfTheBooks[i].isIssued == true) {
					System.out.println("This book has been issued already. Please choose another book");
					break;
				}if (nameOfTheBooks[i].bookQty == 0) {
					System.out.println("Out of Stock");
					break;
				}
			}if (numOfBooksIssued == 2) {
				System.out.println("You have reached the maximum limit of " + numOfBooksIssued + " books");
				break;
			}
		}		
		System.out.println("Do you want to retun any books? (Y/N)");
		String userChoice = sc.next();
		if (userChoice.equals("Y")) {
			System.out.println("Enter the name of the book you want to return ");
			String bookReturn = sc.next();
			for (int i = 0; i < nameOfTheBooks.length; i++) {
				if (nameOfTheBooks[i].bookName.equalsIgnoreCase(bookReturn) && nameOfTheBooks[i].isIssued == true) {
					System.out.println("Book has been returned successfully \n");
					nameOfTheBooks[i].isIssued = false;
					nameOfTheBooks[i].bookQty++;
					System.out.println("Quantity Updated of book " + nameOfTheBooks[i].bookName + " to "
							+ nameOfTheBooks[i].bookQty);
					break;
				}
			}

		}
	}
	
	void listAllGenre() {
		System.out.println("Below is the list of genres available");
		for(Genre listAllGenres:Genre.values()){
		System.out.println(listAllGenres);
		}
		System.out.println("Please enter the genre to see all the available books in that category");
		String userChoice = sc.next();
		Genre type = null;
		switch (userChoice.toLowerCase()) {
		case "comic":
			type = Genre.COMIC;
			break;
		case "fiction":
			type = Genre.FICTION;
			break;

		case "children":
			type = Genre.CHILDREN;
			break;

		case "non fiction":
			type = Genre.NONFICTION;
			break;

		case "crime":
			type = Genre.CRIME;
			break;
		default:
			System.out.println("Not a valid Genre");
			break;
		}
		for (int i = 0; i < nameOfTheBooks.length; i++) {
			if (nameOfTheBooks[i].bookGenre.getGenre().equals(type.getGenre())) {
				System.out.println(nameOfTheBooks[i].bookName + " by " + nameOfTheBooks[i].authorName);

				}
			
		}
		
	}
}
