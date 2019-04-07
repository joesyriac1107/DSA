package basics.algorithm.sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = { -22, 1, -15, 7, 20, 35, 55 };
		
		for(int lastSortedIndex=intArray.length-1;lastSortedIndex>0;lastSortedIndex--) {
			int maxIndex=0;
			for(int index=0;index<=lastSortedIndex;index++) {
				if(intArray[index]>intArray[maxIndex])
					maxIndex=index;
			}
			BubbleSort.swap(maxIndex, lastSortedIndex, intArray);
			
		}
		for(int i = 0;i<intArray.length;i++) {
			System.out.println(intArray[i]);

		}

	}

}
