package challenges.leetcode;

public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int index;
		int[] indexes;
		double median1=0;
		double median2=0;
		double median;
		
		if(m==0)
			return medianSingleArray(nums2);
		if(n==0)
			return medianSingleArray(nums1);
		
		if(m ==1 && n==1) {
			median1 = nums1[0];
			median2 = nums2[0];
			median = (median1 + median2)/2;
			return median;
		}

		if(nums1[m/2]>nums2[n/2]) {
			index = recursiveCall(nums2, nums1[m/2], n/2, n-1);
			if(nums2[index]>nums1[m/2]) {
				index--;
			}

			indexes = gettingToMedian(nums1, nums2, m/2, index);
		}else {
			index = recursiveCall(nums1, nums2[n/2], m/2, m-1);
			if(nums1[index]>nums2[n/2]) {
				index--;
			}

			indexes = gettingToMedian(nums1, nums2, index, n/2);
		}

		if(indexes[0]<0) {
			if((m+n)%2==0) {
				median1=nums2[indexes[1]];
				median2=nums2[indexes[1]-1];
				median= (median1+median2)/2;
				
			}else {
				median = nums2[indexes[1]];
			}
			
		}else if(indexes[1]<0) {
			if((m+n)%2==0) {
				median1=nums1[indexes[0]];
				median2=nums1[indexes[0]-1];
				median= (median1+median2)/2;
				
			}else {
				median = nums1[indexes[0]];
			}
			
		}else {
			
			if((m+n)%2 == 0) {
				if(nums1[indexes[0]]>nums2[indexes[1]]) {
					median1=nums1[indexes[0]];
					if(indexes[0]-1>=0 && nums1[indexes[0]-1]>nums2[indexes[1]]) {
						median2 =nums1[indexes[0]-1];
					}
					else {
						median2 =nums2[indexes[1]];
					}
				}else {
					median1=nums2[indexes[1]];
					if(indexes[1]-1<0 || nums1[indexes[0]]>nums2[indexes[1]-1]) {
						median2 =nums1[indexes[0]];
					}
					else {
						median2 =nums2[indexes[1]-1];
					}
				}

			}else {
				if(nums1[indexes[0]]>nums2[indexes[1]]) {
					return (double)nums1[indexes[0]];
				} else
					return (double)nums2[indexes[1]];
			}
			
			median=(median1+median2)/2;
			
		}
		
		
		return median;
	}



	public int binarySerarch(int[] input,int value) {

		return recursiveCall(input,value,0,input.length-1);
	}

	public int recursiveCall(int[] input,int value,int left,int right) {
		int answer =left;
		int mid = (left+right)/2;

		if(input[mid]==value)
			answer =mid;
		if(input[mid] > value && mid>left)
			answer=recursiveCall(input, value, left, mid-1);
		if(input[mid] < value && mid<right)
			answer=recursiveCall(input, value, mid+1, right);

		return answer;
	}

	public int[] gettingToMedian(int[] primary, int[] secondary, int primaryIndex, int secondaryIndex) {
		int toReduce = (primaryIndex +secondaryIndex +2) - ((primary.length+secondary.length)/2 +1);

		for(;toReduce>0;toReduce--) {
			if(secondaryIndex <0 || (primaryIndex >=0 && primary[primaryIndex]>secondary[secondaryIndex]))
				primaryIndex--;
			else
				secondaryIndex--;
		}
		return new int[]{primaryIndex,secondaryIndex};
	}
	
	public double medianSingleArray(int[] array) {
		double median;
		double median1=0;
		double median2=0;
		
		if(array.length%2 ==0) {
			median1=array[array.length/2];
			median2=array[array.length/2 -1];
			median=(median1+median2)/2;
			
		}else {
			median = array[array.length/2];
		}
		
		
		return median;
	}
}
