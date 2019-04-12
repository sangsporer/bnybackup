package library;

import java.util.ArrayList;

public class Author {
	//Author properties
	// Set count to zero initially - for id
	static int count=0;
	int authorId;
	String name;
	ArrayList<Book> booksByAuthor;
	
	//Author constructor
	public Author(String name) {
		// TODO Auto-generated constructor stub
		count = count + 1;
		authorId = count;
		this.name = name;
		booksByAuthor = new ArrayList<Book>(); //getting booksByAuthor when new books are added with author name
	}
	
	public Author() {
		
	}
	
	
}


