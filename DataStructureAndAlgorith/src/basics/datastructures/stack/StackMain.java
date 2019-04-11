package basics.datastructures.stack;

import basics.datastructure.lists.Employee;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee doeJohn = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee joeSyriac = new Employee("Joe", "Syriac", 1190);

		ArrayStack stack = new ArrayStack();
		
		stack.push(janeJones);
		stack.push(doeJohn);
		stack.push(marySmith);
		stack.push(mikeWilson);
		stack.pop();
		
//		stack.printStack();
//		
//		System.out.println(stack.peek());
//		System.out.println(stack.pop());
		stack.printStack();
		System.out.println(stack.size());
	}

}
