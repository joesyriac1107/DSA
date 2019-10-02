package challenges.leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class Subset2 {

	public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {

		Collections.sort(A);
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> tempArray = new ArrayList<ArrayList<Integer>>();




		for(int i=A.size()-1;i>=0;i--){

			if(result.size()>0){
				for(int k =0 ;k<result.size();k++){
					if(result.get(k).get(0).equals(A.get(i)))
						break;

					tempArray.add(result.get(k));
				}
			}

			int resultSize=result.size();
			for(int j=0;j<resultSize;j++){
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(A.get(i));
				temp.addAll(result.get(j));

				tempArray.add(temp);
			}

			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(A.get(i));

			tempArray.add(temp);

			result=tempArray;
			tempArray = new ArrayList<ArrayList<Integer>>();
		}

		result.add(new ArrayList<Integer>());
		int start=0;
		int end=result.size()-1;
		while(start<end){

			ArrayList<Integer> temp=result.get(start);
			result.set(start,result.get(end));
			result.set(end,temp);
			start++;
			end--;
		}

		return result;
	}

}
