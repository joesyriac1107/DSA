package challenges.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class CoinChange {
	public int coinchange2(ArrayList<Integer> A, int B) {

		 Collections.sort(A);
	        int[][] arr = new int[A.size()+1][B+1];
	        arr[0][0]=1;
	        for(int i=1;i<(A.size()+1);i++)
	            arr[i][0]=1;
	            
	        for(int i=1;i<(A.size()+1);i++){
	            int coinAdded=A.get(i-1);
	            for(int j=1;j<(B+1);j++){
	                int temp=0;
	                if((j- coinAdded)>=0)
	                    temp=arr[i][j - coinAdded];
	                arr[i][j]=arr[i-1][j]+temp;
	            }
	        }
	        
	        return arr[A.size()][B];
	    }
	
	
	


}
