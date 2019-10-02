package challenges.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongetSumZero {

	public ArrayList<Integer> lszero(ArrayList<Integer> A) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();

		int sum=0;
		for(int i=0;i<A.size();i++){
			sum=sum+A.get(i);
			map.put(sum,i);
		}
		sum=0;
		int j=0;
		int start = -1;
		int end =-1;
		for(;j<A.size();j++){
			sum=sum+A.get(j);
			int tempStart=0;
			int tempEnd=0;
			if(sum ==0){

				if(start == -1) {
					start=0;
					end=map.get(sum);
				}else {
					tempStart=0;
					tempEnd=map.get(sum);
				}

			}else if(map.get(sum).equals(j)){
				continue;
			} else{
				tempStart=j+1;
				tempEnd=map.get(sum);

			}

			if(tempEnd-tempStart > end-start){
				end=tempEnd;
				start=tempStart;
			}
		} 


		return new ArrayList<Integer>(A.subList(start,end+1));
	}

}
