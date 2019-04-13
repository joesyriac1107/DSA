package basics.datastructures.queue;

import java.util.EmptyStackException;

import basics.datastructure.lists.Employee;

public class ArrayQueue {
	
	private Employee[] queue;
	private int last=0;
	private int front=0;
	
	public ArrayQueue () {
		queue = new Employee[10];
	}
	
	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}
	
	public void add(Employee employee) {
		if(size() == queue.length-1) {
			 Employee[] temp = new Employee[2*queue.length];
			 System.arraycopy(queue, 0, temp, 0, last);
			 queue=temp;
		}else if(last == 0 && last<front) {
			for(int i=front;i<queue.length;i++) {
				queue[last++]=queue[i];
			}
			front=0;
		}
		
		queue[last]=employee;
		if(last<queue.length-1)
			last++;
		else
			last=0;
			
		
	}
	
	public Employee remove() {
		Employee emp = peek();
		queue[front++]=null;
		return emp;
	}

	public Employee peek() {
		if(isEmpty())
			throw new EmptyStackException();
		return queue[front];
	}
	
	public int size() {
		return last - front;
	}

	public boolean isEmpty() {
		return last == front;
	}
	
	public void printQueue() {
		for(int i =front;i<last;i++) {
			System.out.println(queue[i]);
		}
	}
}
