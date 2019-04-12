package algorithms;



public class Node {
	private int data; // private so need get and set method
	private Node nextNode;
	
	public Node (int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	public Node getNextNode() {
		return this.nextNode;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString() {
		return "Data: " + this.data;
	}
	
	

}
