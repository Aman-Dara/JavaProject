package libraryMiniProject;

public class Book {

	String bookName;
	String authorName;
	boolean isIssued = false;
	int bookQty;
	Genre bookGenre;

	Book(String nameOfBook, String nameOfAuthor, int bookQuantity, boolean isBookIssued, Genre bGenre) {
		bookName = nameOfBook;
		authorName = nameOfAuthor;
		isIssued = isBookIssued;
		bookQty = bookQuantity;
		bookGenre = bGenre;

	}
}
