package basics.datastructure.lists;

public class EmployeeDoblyLinkedList {
	
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		
		if(head == null)
			tail = node;
		else {
			head.setPrevious(node);
			node.setNext(head);
		}
		
		head = node;
		size++;
		
	}
	
	public void addToEnd(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if(tail == null)
				head =node;
		else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
		size++;
	}

	public EmployeeNode removeFromFront() {
		if(isEmpty())
			return null;
		EmployeeNode removedNode = head;
		head= head.getNext();
		if(head == null)
			tail = null;
		else {
			head.setPrevious(null);
		}
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	 
	public EmployeeNode removeFromEnd() {
		if(isEmpty())
			return null;
		EmployeeNode removedNode = tail;
		tail = tail.getPrevious();
		
		if (tail == null)
			head = null;
		else {
			tail.setNext(null);
		}
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
	public boolean addBefore(Employee newEmployee, Employee oldEmployee) {
		if(isEmpty())
			return false;
		EmployeeNode current = head;
		while(current != null && !current.getEmployee().equals(oldEmployee)) {
			current=current.getNext();
		}
		if(current == null)
			return false;
		EmployeeNode newNode = new EmployeeNode(newEmployee);
		current.getPrevious().setNext(newNode);
		newNode.setPrevious(current.getPrevious());
		newNode.setNext(current);
		current.setPrevious(newNode);
		size++;
		return true;
	}
	
	public void printList() {
		
		EmployeeNode current = head;
		System.out.print("Head -> ");
		
		while(current != null) {
			System.out.print(current);
			System.out.print(" <=> ");
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
