package basics.algorithm.sort;

public class RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] radixArray = {2675,12,7892,6578,8875,9782,5642,2676,234};
		
		int radix=10;
		int width=4;
			radixSort(radixArray,radix,width);
			
			BubbleSort.printArray(radixArray);
		}

	public static void radixSort(int[] input, int radix,int width) {
		for(int position =0;position<width;position++) {
			radixSingelSort(input,radix,position);
		}
		
	}
	
	public static void radixSingelSort(int[] input, int radix, int position) {
		int[] countArray = new int[radix];
		int[] temp = new int[input.length];
		
		for(int i=0;i<input.length;i++) {
			countArray[getDigit(input[i],position,radix)]++;
		}
		
		for(int i=1;i<countArray.length;i++) {
			countArray[i]+=countArray[i-1];
		}
		
		for(int tempIndex=input.length-1;tempIndex>=0;tempIndex--) {
			temp[--countArray[getDigit(input[tempIndex], position, radix)]]=input[tempIndex];
		}
		
		for(int tempIndex=0; tempIndex<input.length;tempIndex++) {
			input[tempIndex] = temp[tempIndex];
		}
		
	}
	
	public static int getDigit(int value,int position,int radix) {
		return value/(int) Math.pow(radix, position) % radix;
		
	}

}
