package library;

import java.util.ArrayList;

public class Book {
	//properties of Book class
	// Set count to zero initially - for id
    static int count = 0;
	int bookId;
	String title;
	int yearPublished;
	String author;
	
	//Book constructor
	Book(String title, int yearPublished, String author){
		count = count + 1;
		bookId = count;
		this.title = title;
		this.yearPublished = yearPublished;
		this.author = author;
		
		// getting author of the book when new object Author is created or from existing list of authors
	}
  
    
    
   
    
   
	//list of all the books "BookList" - new books added to list of all the books
	
	static ArrayList<Book> bookList = new ArrayList<Book>();
	
	
	

}
