package libraryMiniProject;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BookDetails bd = new BookDetails();
		UserDetails ud = new UserDetails();

		bd.displayMenu();

		int userChoice = sc.nextInt();

		switch (userChoice) {
		case 1:
			bd.displayBooks();
			break;
		case 2:
			ud.displayUsers();
			break;
		case 3:
			bd.listAllGenre();
			break;
		case 4:
			bd.issueBooks();
			break;
		case 5:
			ud.addUser();
			break;
			default:
				System.out.println();
		}
		sc.close();

	}
}
