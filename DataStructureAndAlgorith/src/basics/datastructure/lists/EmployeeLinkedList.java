package basics.datastructure.lists;

public class EmployeeLinkedList {
	
	private EmployeeNode head;
	
	private int size=0;
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;
		
	}

	public EmployeeNode removeFromFront() {
		if(isEmpty())
			return null;
		EmployeeNode removedNode = head;
		head= head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	public void printList() {
		
		EmployeeNode current = head;
		System.out.print("Head -> ");
		
		while(current != null) {
			System.out.print(current);
			System.out.print(" -> ");
			current=current.getNext();
		}
		System.out.println("null");
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		if(head == null)
			return true;
		else
			return false;
	}
}
