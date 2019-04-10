package basics.datastructure.lists;

public class IntegerLinkedList {
	
	IntegerNode head;
	
	private int size =0;
	
	public Integer insertSorted(Integer newInteger) {
		IntegerNode newNode = new IntegerNode(newInteger);
		if(isEmpty() || head.getValue() >= newInteger) {
			newNode.setNext(head);
			head=newNode;
			size++;
			return newInteger;
			
		}
		IntegerNode current=head.getNext();
		IntegerNode previous=head;
		
		while(current != null && current.getValue()<newInteger) {
			current=current.getNext();
			previous=previous.getNext();
		}
		if(current == null) {
			previous.setNext(newNode);
			size++;
			return newInteger;
		}
		
		previous.setNext(newNode);
		newNode.setNext(current);
		size++;
		
		return newInteger;
		
	}
	
	public void printList() {
		IntegerNode current = head;
		System.out.print("HEAD -> ");
		while(current!=null) {
			System.out.print(current.getValue());
			System.out.print(" -> ");
			current=current.getNext();
		}
		
		System.out.println("null");
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}
	
	public int getSize() {
		return size;
		
	}
}
