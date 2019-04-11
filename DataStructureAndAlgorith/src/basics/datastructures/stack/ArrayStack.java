package basics.datastructures.stack;

import java.util.EmptyStackException;

import basics.datastructure.lists.Employee;

public class ArrayStack {
	
	private Employee[] stack;
	private int top;
	
	public ArrayStack() {
		stack = new Employee[10];
	}
	public ArrayStack(int capapcity) {
		stack = new Employee[capapcity];
	}
	
	public void push(Employee employee) {
		if (top == stack.length) {
			//need to resize the array
			Employee[] newArray = new Employee[2*stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack= newArray;
		}
		stack[top++] = employee;
	}
	
	public Employee pop() {
//		if(isEmpty()) {
//			throw new EmptyStackException();
//		}
//		Employee employee = stack[--top];
//		stack[top]=null;
//		return employee;
		
		Employee employee = peek();
		stack[--top]=null;
		return employee;
		
	}
	
	public Employee peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int index = top-1;
		return stack[index];
	}

	public boolean isEmpty() {
		return top == 0;
	}
	
	public int size() {
		return top;
	}
	
	public void printStack() {
		
		for(int i =top-1;i>=0;i--) {
			System.out.println(stack[i]);
		}
	}
}
