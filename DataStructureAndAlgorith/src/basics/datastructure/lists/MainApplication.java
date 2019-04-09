package basics.datastructure.lists;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee doeJohn = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee joeSyriac = new Employee("Joe", "Syriac", 1190);
		EmployeeDoblyLinkedList list = new EmployeeDoblyLinkedList();
		
		list.addToFront(janeJones);
		list.addToFront(doeJohn);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		
		list.printList();
		System.out.println(list.getSize());
		
		list.addToEnd(joeSyriac);
		list.printList();
		System.out.println(list.getSize());
		list.removeFromFront();
		list.printList();
		System.out.println(list.getSize());
		list.removeFromEnd();
		list.printList();
		System.out.println(list.getSize());
	}
}