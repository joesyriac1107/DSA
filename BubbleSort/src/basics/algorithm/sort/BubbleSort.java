package basics.algorithm.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		for(int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
			for(int index =0;index<lastUnsortedIndex;index++) {
				swap(index,index+1,intArray);
			}

	
		}
		
		printArray(intArray);
		
	}
	

	public static void printArray(int[] intArray) {
		for(int i = 0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		
	}
	
	public static void swap(int index1, int index2,int[] intArray) {
		
		int c;
		if(intArray[index1] == intArray[index2])
			return;
		else if(intArray[index1]>intArray[index2]) {
			c=intArray[index1];
			intArray[index1]=intArray[index2];
			intArray[index2]=c;
		}

	}

}
