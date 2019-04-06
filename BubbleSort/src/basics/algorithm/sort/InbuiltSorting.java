package basics.algorithm.sort;

import java.util.Arrays;

public class InbuiltSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 ,75,26,54};
		
		Arrays.parallelSort(intArray);
		
		BubbleSort.printArray(intArray);
	}

}
