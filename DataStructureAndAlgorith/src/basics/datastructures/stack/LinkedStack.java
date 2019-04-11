package basics.datastructures.stack;

import java.util.LinkedList;

import basics.datastructure.lists.Employee;
import basics.datastructure.lists.EmployeeLinkedList;

public class LinkedStack {
	
	private LinkedList<Employee> stack;
	
	public LinkedStack() {
		stack = new LinkedList<Employee>();
	}
	
	
	public Employee pop() {
		return stack.removeFirst();
	}
	
	
	public Employee peep() {
		return stack.element();
	}
	
	public void push(Employee employee) {
		stack.addFirst(employee);
	}
	
	public int size() {
		return stack.size();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
}
