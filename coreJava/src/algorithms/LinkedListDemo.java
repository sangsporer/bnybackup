package algorithms;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		
		list.insertAtHead(5);
		list.insertAtHead(10);
		list.insertAtHead(2);
		list.insertAtHead(12);
		list.insertAtHead(10);
		list.insertAtHead(20);
		
		list.deleteFromHead();
		
		System.out.println(list);
		System.out.println("Length: " + list.length());
		System.out.println("Found: " + list.find(15));

	}

}
