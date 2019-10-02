package basics.algorithm.search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { -20,-15,-2,1,23,30,32,37 };
		
		System.out.println(binarySerarch(intArray, 14));
	}

	public static int binarySerarch(int[] input,int value) {
		
		return recursiveCall(input,value,0,input.length-1);
	}
	
	public static int recursiveCall(int[] input,int value,int left,int right) {
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
}
