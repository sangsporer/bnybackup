package lists;

import java.util.List;

public class Book {
	int bId;
	String bName;
	
	Book(int bId, String bName){
		this.bId=bId;
		this.bName=bName;
	}
	
	void printAllBooks(List<Book> allBooks){
		for (Book book : allBooks) {
			System.out.println(book.bName);		
		}	
	}
	
	
	
//	void removeBook(String removeBook) {
//		printBook();
//		System.out.println("for: "+Book.get(i).bName);
//			if (Book.get(i).bName.contentEquals(removeBook)) {
//				Book.remobve(Book.get(i));
//				System.out.println(removeBook + " has been removed successfully from your list");
//				printBook();			
//				break;
//			}else {
//				System.out.println("The book you're trying to remove is not in your list");
//			}
//		}
//	}

}
