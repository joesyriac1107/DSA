package basics.datastructure.hashtable;

import basics.datastructure.lists.Employee;

public class MainHastable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee joeSyriac = new Employee("Joe", "Syriac", 1190);
		
		ChainedHashTable ht = new ChainedHashTable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);

        ht.printHashTable();

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
        System.out.println("Retrieve key Smith: " + ht.get("Smith"));

        ht.remove("Wilson");
        ht.remove("Jones");
        ht.printHashTable();

        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
	}

}
