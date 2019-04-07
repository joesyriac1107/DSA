package basics.algorithm.sort;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		mergeSort(intArray, 0, intArray.length);
		
		BubbleSort.printArray(intArray);
	}
	
	public static void mergeSort(int[] intArray,int start, int stop) {
		if(stop-start < 2) {
			return;
		}
		int mid = (start+stop)/2;
		mergeSort(intArray, start, mid);
		mergeSort(intArray, mid, stop);
		merge(intArray,start,mid,stop);
		
	}
	
	public static void merge(int[] intArray,int start,int mid,int stop) {
		if(intArray[mid-1]<intArray[mid]) {
			return;
		}
		
		int i=start;
		int j=mid;
		int tempIndex=0;
		int[] tempArray = new int[stop-start];
		
		while(i<mid && j<stop) {
			tempArray[tempIndex++] = intArray[i]<=intArray[j] ? intArray[i++] : intArray[j++];
		}
		
//		if(i==mid) {
//			while(j<stop) {
//				tempArray[tempIndex++]=intArray[j++];
//			}
//		} else {
			while(i<mid) {
				tempArray[tempIndex++]=intArray[i++];
			}
		
		
		
		i=start;
		tempIndex=0;
		
		while(i<j) {
			intArray[i++]=tempArray[tempIndex++];
		}
	}

}
