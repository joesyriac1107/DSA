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
		
		EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
		
		employeeLinkedList.addToFront(janeJones);
		employeeLinkedList.addToFront(doeJohn);
		employeeLinkedList.addToFront(marySmith);
		employeeLinkedList.addToFront(mikeWilson);
		
		
		employeeLinkedList.printList();


	}
}