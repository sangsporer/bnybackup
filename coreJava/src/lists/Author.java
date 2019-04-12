package lists;

import java.util.List;


public class Author {
	int aId;
	String aName;
	List<Book> aBooks;
	
	Author(int aId, String aName, List<Book> aBooks){
		this.aId=aId;
		this.aName=aName;
		this.aBooks=aBooks;
	}
	
	void printAuthor(){
		System.out.println(aId);
		System.out.println(aName);
		for (Book book : aBooks) {
			System.out.println(book.bName);		
		}
	}
	
	void selectAuthor(List<Author> allAuthors, String selectAuthor){
		for (int i = 0; i < allAuthors.size(); i++) {
			if(!allAuthors.get(i).aName.equals(selectAuthor)) {
				System.out.println("The author is not in the list");
				break;
			}else  {
				System.out.println(allAuthors.get(i).aId);
				System.out.println(allAuthors.get(i).aName);
				for (Book book : aBooks) {
					System.out.println(book.bName);	
				}
			}
			
		}
		
	}
	
	
	void removeBook(String removeBook) {
		for (int i=0; i<aBooks.size(); i++) {
			System.out.println("for: "+aBooks.get(i).bName);
			if (aBooks.get(i).bName.contentEquals(removeBook)) {
				aBooks.remove(aBooks.get(i));
				System.out.println(removeBook + " has been removed successfully from your list");
				for (Book book : aBooks) {
					System.out.println(book.bName);		
				}			
				break;
			}else {
				System.out.println("The book you're trying to remove is not in your list");
			}
		}
	}
	
	void addBook(String addBook, List<Book> allBooks) {
		//check if addBook is already in aBooks
		for (int i = 0; i < aBooks.size(); i++) {
			if (aBooks.get(i).bName.contentEquals(addBook)) {
				System.out.println(addBook + " is already in your list");
				for (Book book : aBooks) {
					System.out.println("Author Books list"); //aBooks
					System.out.println(book.bName); //aBooks		
				}			
				break;
			}			
		}
		System.out.println("All Books in the List");
		boolean added = false;
		for (int i=0; i<allBooks.size(); i++) {
			System.out.println("for: "+allBooks.get(i).bName);	//print allBooks	
			if (allBooks.get(i).bName.equals(addBook)) {
				aBooks.add(allBooks.get(i));
				added = true;				
			}
		}	
		if(added) {
			System.out.println(addBook + " has been added successfully to your list");
			for (Book book : aBooks) {
				System.out.println(book.bName);	
			}
		} else {System.out.println("The book you're trying to add is not in the Book list");			
			}
		
	}	
}	

