package challenges.leetcode;

import java.util.HashMap;
import java.util.List;

public class LongestAP {
	
public int solve(final List<Integer> A) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int max=1;
        for(int i=1;i<A.size();i++){
            boolean diffBoolean = false;
            
            for(int j=0;j<i;j++){
                
                int diff=A.get(i)-A.get(j);
                if(diff==0 && diffBoolean){
                    continue;
                }
                if(map.get(diff) != null){
                    int temp=map.get(diff);
                    map.put(diff,temp+1);
                }else{
                    map.put(diff,2);
                } 
                 if(map.get(diff)>max)
                    max=map.get(diff);
                    
                if(diff == 0)
                    diffBoolean=true;
            }
            
            
        }
        
        return max;
        
    }

}
