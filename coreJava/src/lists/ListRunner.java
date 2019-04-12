package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(1, "Hamlet");
		Book b2 = new Book(2, "Othello" );
		Book b3 = new Book(3, "King Lear" );
		Book b4 = new Book(4, "MacBeth" );
		Book b5 = new Book(5, "Pride and Prejudice");
		Book b6 = new Book(6, "Sense and Sensibility");
		Book b7 = new Book(7, "Emma");
		Book b8 = new Book(7, "Persuasion");

		//all books in the list
		List<Book> allBooks = new ArrayList<Book>();
		allBooks.add(b1);
		allBooks.add(b2);
		allBooks.add(b3);
		allBooks.add(b4);
		allBooks.add(b5);
		allBooks.add(b6);
		allBooks.add(b7);
		allBooks.add(b8);
			
		//books that belong to author a1 - Shakespeare
		List<Book> a1List = new ArrayList<Book>();
		a1List.add(b1);
		a1List.add(b2);
		a1List.add(b3);
		
		Author a1 = new Author(1, "Shakespeare", a1List);
		
		//books that belong to author a2 - Jane Austen
		List<Book> a2List = new ArrayList<Book>();
		a2List.add(b5);
		a2List.add(b6);
		a2List.add(b7);
		
		Author a2 = new Author(2, "Austen", a2List);
		
		//list of authors
		
		List<Author> allAuthors = new ArrayList<Author>();
		allAuthors.add(a1);
		allAuthors.add(a2);
		
		a1.printAuthor();
		a2.printAuthor();
		
		//print list of authors
		for (Author a : allAuthors) {
			System.out.println(a.aName);		
		}
		
		//pick author
		Scanner input = new Scanner(System.in);
		System.out.println("Which author to edit");
		String selectAuthor = input.nextLine();
		
		
		selectAuthor(allAuthors, selectAuthor);
		
		
		System.out.println("Which book do you want to remove?");
		String removeBook = input.nextLine();
		a1.removeBook(removeBook);
		
		a1.printAuthor();
		
		System.out.println("Which book do you want to add?");
		String addBook = input.nextLine();
		a1.addBook(addBook, allBooks);
		

		input.close();
	}

	private static void selectAuthor(List<Author> allAuthors, String selectAuthor) {
		// TODO Auto-generated method stub
		
	}

	


		
	

}
