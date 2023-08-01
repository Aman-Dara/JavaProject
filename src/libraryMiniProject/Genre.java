package libraryMiniProject;

public enum Genre {
	
	COMIC("comic"),
	CRIME("crime"),
	FICTION("fiction"),
	CHILDREN("children"),
	NONFICTION("nonfiction");
	
	String bookGenre;
	
	Genre(String bGenre) {
		bookGenre = bGenre;
	}

	String getGenre() {
		return bookGenre;
	}
	 

}
