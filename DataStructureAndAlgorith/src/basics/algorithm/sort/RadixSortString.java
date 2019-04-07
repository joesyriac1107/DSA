package basics.algorithm.sort;

public class RadixSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringArray = {"bcdef","dbaqc","abcde","omadd","bbbbb"};
		int width =5;
		int radix =26;
		
		radixSort(stringArray,width,radix);
		
		BubbleSort.printArrayString(stringArray);
		
	}
	
	public static void radixSort(String[] input, int width, int radix) {
		for(int position =width-1;position>=0;position--) {
			radixSingleSort(input,position,radix);
		}
	}
	
	public static void radixSingleSort(String[] input, int position, int radix) {
		
		String[] temp = new String[input.length];
		int[] countArray = new int[radix];
		int asciiA = (int) 'a';
		
		for(String value:input) {
			countArray[((int) value.charAt(position))-asciiA]++;
			
		}
		
		for(int i=1;i<radix;i++) {
			countArray[i] += countArray[i-1];
		}
		
		for(int tempIndex=input.length-1;tempIndex>=0;tempIndex--) {
			temp[--countArray[((int) input[tempIndex].charAt(position)) - asciiA]]=input[tempIndex];
		}
		
		for(int tempIndex=0; tempIndex < input.length;tempIndex++) {
			input[tempIndex] = temp[tempIndex];
		}
	}

}
