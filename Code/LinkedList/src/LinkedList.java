
class Node {
	public int key;
	public Node nextNode;
}

public class LinkedList {

	private Node headNode;

	public LinkedList() {
		headNode = null;
	}

	public LinkedList(int key) {
		Node node = new Node();
		node.key = key;
		node.nextNode = null;
		headNode = node;
	}

	public void insertLast(int key) {
		Node tempNode = new Node();
		tempNode = headNode;
		while (tempNode.nextNode != null) {
			tempNode = tempNode.nextNode;
		}
		Node newNode = new Node();
		newNode.key = key;
		newNode.nextNode = null;
		tempNode.nextNode = newNode;

	}

	public void print() {
		System.out.println("The list is : ");
		Node tempNode = new Node();
		tempNode = headNode;
		int i = 0;
		while (tempNode != null) {
			i++;
			System.out.println("index = " + i + " value = " + tempNode.key);
			tempNode = tempNode.nextNode;
		}
	}

	public void deleteLast() {
		Node tempNode = new Node();
		tempNode = headNode;
		while ((tempNode.nextNode).nextNode != null) {
			tempNode = tempNode.nextNode;
		}
		tempNode.nextNode = null;
	}

	public int getLength() {
		Node tempNode = new Node();
		tempNode = headNode;
		int i=0;
		while (tempNode != null) {
			i++;
			tempNode = tempNode.nextNode;
		}
		return i;

	}
	public void search(int key)
	{
		Node tempNode = new Node();
		tempNode = headNode;
		int i=1;
		boolean flag = false;
		while (tempNode != null) {
			if(tempNode.key == key)
			{
				System.out.println("found at index = "+i);
				flag= true;
			}
			tempNode = tempNode.nextNode;
			i++;
		}
		if(!flag)
			System.out.println("key = "+key+" not found");
	}
	
	public void searchAt(int pos)
	{
		Node tempNode = new Node();
		tempNode = headNode;
		int i=1;
		while (tempNode != null) {
			if(i==pos)
			{
				System.out.println(" at index "+pos+" value = "+tempNode.key);
			}
			tempNode = tempNode.nextNode;
			i++;
		}
		if(pos > i)
			System.out.println(pos+" is an invalid position");
	}
	
	public void insertAt(int pos,int key)
	{
		Node tempNode = new Node();
		tempNode = headNode;
		int i=1;                       
		while (i != pos-1) {   
			tempNode = tempNode.nextNode;
			i++;
		}
		Node newNode = new Node();
		newNode.key = key;
		newNode.nextNode = tempNode.nextNode;
		tempNode.nextNode = newNode;
	}
	
	public void removeAt(int pos)
	{
		Node tempNode = new Node();
		tempNode = headNode;
		int i=1;                       
		while (i != pos-1) {   
			tempNode = tempNode.nextNode;
			i++;
		}
		tempNode.nextNode = (tempNode.nextNode).nextNode;
	}

	public static void main(String[] args) {

		LinkedList ll = new LinkedList(3);
		ll.insertLast(5);
		ll.insertLast(6);
		ll.insertLast(2);
		ll.insertLast(1);
		
		ll.print();
		ll.insertAt(3, 10);
		ll.print();
		ll.removeAt(3);
		ll.print();
		
	}

}
