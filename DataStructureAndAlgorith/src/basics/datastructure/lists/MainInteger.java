package basics.datastructure.lists;

public class MainInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerLinkedList list = new IntegerLinkedList();
		System.out.println(list.getSize());
		list.insertSorted(3);
		System.out.println(list.getSize());
		list.insertSorted(1);
		System.out.println(list.getSize());
		list.insertSorted(2);
		System.out.println(list.getSize());
		
		list.printList();
		System.out.println(list.getSize());
		

	}

}
