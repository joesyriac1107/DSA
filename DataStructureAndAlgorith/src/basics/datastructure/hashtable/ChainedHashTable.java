package basics.datastructure.hashtable;

import java.util.LinkedList;
import java.util.ListIterator;

import basics.datastructure.lists.Employee;

public class ChainedHashTable {

	private LinkedList<StoredEmployee>[] hashTable;

	public ChainedHashTable() {
		hashTable= new LinkedList[10];
		for(int i=0;i<hashTable.length;i++) {
			hashTable[i]=new LinkedList<StoredEmployee>();
		}

	}

	public void put(String key, Employee employee) {
		int hashkey = hashKey(key);
		hashTable[hashkey].add(new StoredEmployee(key, employee));
	}

	public Employee get(String key){
		int hashkey = hashKey(key);
		ListIterator<StoredEmployee> it = hashTable[hashkey].listIterator();
		StoredEmployee employee =null;
		while(it.hasNext()) {
			employee=it.next();
			if(employee.getKey().equals(key))
				return employee.getEmployee();
		}

		return null;
	}

	public Employee remove(String key) {
		int hashkey = hashKey(key);
		ListIterator<StoredEmployee> iterator = hashTable[hashkey].listIterator();
		StoredEmployee employee =null;
		int index =0;
		while(iterator.hasNext()) {
			employee=iterator.next();
			if(employee.getKey().equals(key)) {
				return hashTable[hashkey].remove(index).getEmployee();
			}
			index++;

		}

		return null;
	}

	private int hashKey(String key) {
		return key.length()%hashTable.length;
	}

	public void printHashTable() {
		for(int i=0;i<hashTable.length;i++) {
			if(hashTable[i].isEmpty()) {
				System.out.println("Position " + i + ": empty");
			} else {
				System.out.print("Position "+i + ": ");
				ListIterator<StoredEmployee> iterator = hashTable[i].listIterator();
				StoredEmployee employee =null;
				while(iterator.hasNext()) {
					employee=iterator.next();
					System.out.print(employee.getEmployee());
					System.out.print(" -> ");
				}
				System.out.println("null");
			}

		}
	}

}
