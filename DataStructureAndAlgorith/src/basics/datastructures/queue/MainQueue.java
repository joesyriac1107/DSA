package basics.datastructures.queue;

import basics.datastructure.lists.Employee;

public class MainQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee doeJohn = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee joeSyriac = new Employee("Joe", "Syriac", 1190);

		ArrayQueue queue = new ArrayQueue();
		queue.add(joeSyriac);
		queue.add(janeJones);
		queue.add(marySmith);
		queue.add(doeJohn);
	
		queue.printQueue();
		System.out.println(queue.size());
		queue.remove();
		queue.printQueue();
		System.out.println(queue.size());
		queue.add(mikeWilson);
		queue.printQueue();
		System.out.println(queue.size());
		System.out.println(queue.peek());
		queue.printQueue();
		System.out.println(queue.size());
	
	}

}
