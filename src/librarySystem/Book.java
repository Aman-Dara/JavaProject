package librarySystem;

public class Book {
	
	String authorName;
	String bookName;
	boolean isIssued;
	int bookQty;
	
	
	Book(String nameOfAuthor,String nameOfBook,int bookQuantity,boolean isBookIssued){
		authorName = nameOfAuthor;
		bookName = nameOfBook;
		isIssued = isBookIssued;
		bookQty = bookQuantity;
	}

}
