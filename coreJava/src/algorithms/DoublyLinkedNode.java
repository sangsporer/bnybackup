package algorithms;

public class DoublyLinkedNode {
	private int data; // private so need get and set method
	private DoublyLinkedNode nextNode;
	private DoublyLinkedNode previousNode;
	
	public DoublyLinkedNode (int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public DoublyLinkedNode getNextNode() {
		return nextNode;
	}
	
	public void setNextNode(DoublyLinkedNode nextNode) {
		this.nextNode = nextNode;
	}
	
	public DoublyLinkedNode getPreviousNode() {
		return previousNode;
	}
	
	public void setPreviousNode(DoublyLinkedNode previousNode) {
		this.previousNode = previousNode;
	}
	
	

}
