package basics.algorithm.sort;

public class InsertionSortRecusive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { -22, 1, -15, 7, 20, 35, 55 };


		insertSort(intArray, 1);

		BubbleSort.printArray(intArray);

	}

	public static void insertSort(int[] input,int firstUnsortedIndex) {
		int newElement = input[firstUnsortedIndex];
		int i=firstUnsortedIndex;

		while (i>0 && input[i-1]>newElement) {
			input[i]=input[i-1];
			i--;

		}
		input[i]=newElement;
		if(++firstUnsortedIndex==input.length)
			return;
		insertSort(input, firstUnsortedIndex);
	}
}
