package challenges.leetcode;

import java.util.Arrays;

public class MergeSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp = {1,0};
		mergeSort(temp, 0, temp.length);
		
		printArray(temp);

	}
	
	public static void mergeSort(int[] input,int start, int end) {
		if(end-start <2)
			return;
		int mid = (start+end)/2;
			mergeSort(input, start, mid);
			mergeSort(input, mid, end);		
		merge(input,start,mid,end);
	}
	
	public static void merge(int[] input,int start,int mid, int end) {
		if(input[mid-1]<input[mid])
			return;
		int i=start;
		int j=mid;
		int k =0;
		int[] temp = new int[end-start];
			while(i<mid && j<end) {
				if(input[i]<input[j])
					temp[k++]=input[i++];
				else
					temp[k++] = input[j++];
			}
		while(i<mid) {
			temp[k++]=input[i++];
		}
		
		k=0;
		i=start;
		while(i<j) {
			input[i++]=temp[k++];
		}
		
	}
	
	public static void printArray(int[] input) {
		for(int a : input)
			System.out.print(a+",");
	}

}
