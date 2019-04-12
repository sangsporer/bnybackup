package library;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//welcome message
		
		System.out.println("Welcome to Sang's Library");
		//ask user if he/she wants to add a book
		String response = "Y";
		
		while (response=="Y") {
			// print out list of books for user to see
			System.out.println("Would you like to add a book? Y or N");
			
			Scanner input = new Scanner(System.in);
			
			response = input.nextLine();
			
			//ask user for title, year published and author of the book to be added
			System.out.println("Title of the book you would like to Add");
			String title = input.nextLine();
			System.out.println("What is the year published?");
			int yearPublished = input.nextInt();
			System.out.println("Who is the author");
			String author = input.next();	
			Book book1 = new Book(title, yearPublished, author);
			System.out.println(book1.bookId + book1.title + book1.yearPublished + book1.author);
			
			// add book method in book class
			
			
			
			
			
		}
		 System.out.println("Thanks for visiting Sang's Library. Goody-bye!");//exit library
		
		

	}

}
