package basics.algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = {  2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 2, 2, 2, 0, 0, 1, 0, 2, 1, 1, 2, 1, 2, 2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2, 1, 1, 1, 2, 0, 1, 0, 2, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1, 2, 2, 2, 1, 2, 2, 0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2};
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 2, 2, 2, 0, 0, 1, 0, 2, 1, 1, 2, 1, 2, 2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2, 1, 1, 1, 2, 0, 1, 0, 2, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1, 2, 2, 2, 1, 2, 2, 0, 1, 0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2));
//		mergeSort(arr, 0, arr.size());
//		
//		for(Integer a: arr) {
//			System.out.println(a);
//		}
		
		 int index=0;
	        
	        int[] countArray = {0,0,0};
	        
	        for(Integer element : arr) {
	            countArray[element]=countArray[element]+1;
	        }
	        
	        for(int i=0;i<countArray.length;i++){
	            for(int j=-0;j<countArray[i];j++){
	            	arr.set(index++,i);
	        }
	    }
	     
	} 
	
//	public static void mergeSort(int[] intArray,int start, int stop) {
//		if(stop-start < 2) {
//			return;
//		}
//		int mid = (start+stop)/2;
//		mergeSort(intArray, start, mid);
//		mergeSort(intArray, mid, stop);
//		merge(intArray,start,mid,stop);
//		
//	}
//	
//	public static void merge(int[] intArray,int start,int mid,int stop) {
//		if(intArray[mid-1]<intArray[mid]) {
//			return;
//		}
//		
//		int i=start;
//		int j=mid;
//		int tempIndex=0;
//		int[] tempArray = new int[stop-start];
//		
//		while(i<mid && j<stop) {
//			tempArray[tempIndex++] = intArray[i]<=intArray[j] ? intArray[i++] : intArray[j++];
//		}
//		
////		if(i==mid) {
////			while(j<stop) {
////				tempArray[tempIndex++]=intArray[j++];
////			}
////		} else {
//			while(i<mid) {
//				tempArray[tempIndex++]=intArray[i++];
//			}
//		
//		
//		
//		i=start;
//		tempIndex=0;
//		
//		while(i<j) {
//			intArray[i++]=tempArray[tempIndex++];
//		}
//	}
	
	public static void mergeSort(List<Integer> intArray ,int start, int stop) {
        if(stop-start < 2) {
            return;
        }
        int mid = (start+stop)/2;
        mergeSort(intArray, start, mid);
        mergeSort(intArray, mid, stop);
        merge(intArray,start,mid,stop);
        
    }
    
    public static void merge(List<Integer> intArray,int start,int mid,int stop) {
        if(intArray.get(mid-1)<intArray.get(mid)) {
            return;
        }
        
        int i=start;
        int j=mid;
        int tempIndex=0;
        ArrayList<Integer> tempArray = new ArrayList<Integer>();
        
        while(i<mid && j<stop) {
           if(intArray.get(i)<=intArray.get(j))
            tempArray.add(intArray.get(i++));
            else
            tempArray.add(intArray.get(j++));
           
           tempIndex++;
        }
        
        if(i==mid) {
            while(j<stop) {
                tempArray.add(intArray.get(j++));
                tempIndex++;
            }
        } else {
            while(i<mid) {
                tempArray.add(intArray.get(i++));
                tempIndex++;
            }
        }
        
        
        i=start;
        tempIndex=0;
        
        while(i<j) {
            intArray.set(i++,tempArray.get(tempIndex++));
        }
    }

}
