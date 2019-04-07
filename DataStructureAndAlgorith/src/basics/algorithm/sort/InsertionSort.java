package basics.algorithm.sort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = { -22, 1, -15, 7, 20, 35, 55 };
		
		for(int firstUnsortedIndex=1;firstUnsortedIndex<intArray.length;firstUnsortedIndex++) {
			
			int newElement = intArray[firstUnsortedIndex];
			
			int i=firstUnsortedIndex;
			
			while (i>0 && intArray[i-1]>newElement) {
				intArray[i]=intArray[i-1];
				i--;
				
			}
			
			intArray[i]=newElement;
		}
		
		BubbleSort.printArray(intArray);
		
	}
	
	


}
