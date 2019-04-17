package basics.algorithm.search;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] intArray = { 20,-15,23,30,32,-1,5 };
		
		System.out.println(linearSearch(intArray, 230));

	}

	public static int linearSearch(int[] input, int value) {

		for(int i=0;i<input.length;i++ ){
			if(input[i] == value)
				return i;
		}

		return -1;
	}
}
