package basics.algorithm.sort;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = { 20, 35, -15, 7, 55, 1, 22 };
		
		int start=0;
		int end=intArray.length;
		quickSort(intArray, start, end);
		
		BubbleSort.printArray(intArray);
		

	}
	
	public static void quickSort(int[] input,int start,int end) {
		if (end-start<2)
			return;
		
		int pivotIndex = partition(input,start,end);
		quickSort(input, start, pivotIndex);
		quickSort(input, pivotIndex+1, end);
	}
	
	public static int partition(int[] input,int i, int j) {
		//this is using start element as pivot
		int pivot = input[i];
		while(i<j) {
			
			//Empty Loop to decrement j
			while(i<j && input[--j]>=pivot) {
//				System.out.println("i: "+i);
//				System.out.println("j: "+j);
			};
			
			if(i<j) {
				input[i]=input[j];
			}
			
			//Empty Loop to increment i
			while(i<j && input[++i]<=pivot){
//				System.out.println("i: "+i);
//				System.out.println("j: "+j);
			};
			if(i<j) {
				input[j]=input[i];
			}
			
		}
		
		input[i]=pivot;
		return i;
		
	}

}
