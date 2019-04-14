package basics.datastructure.hashtable;

import basics.datastructure.lists.Employee;

public class SimpleHashTable {
	
	private Employee[] hashTable;
	
	private SimpleHashTable() {
		hashTable = new Employee[10];
	}

	private int hashKey(String key) {
		return key.length() % hashTable.length;
	}
	
	public void put(String key,Employee employee) {
		int hashkey = hashKey(key);
		
		if(hashTable[hashkey] != null)
			System.out.println("Sorry, there is an employee already in postion "+hashkey);
		else {
			hashTable[hashkey]=employee;
		}
	}
	
	public Employee get(String key) {
		if(hashTable[hashKey(key)] != null) {
			return hashTable[hashKey(key)];
		}
		else {
			System.out.println("No Employee found for the key: "+key+" in hashTable");
			return null;
		}
			
	}
	
	public void printHashTable() {
		for(int i=0;i<hashTable.length;i++) {
			if(hashTable[i] != null)
				System.out.println(hashTable[i]);
		}
	}
}
