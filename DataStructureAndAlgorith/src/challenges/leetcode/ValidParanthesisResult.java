package challenges.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ValidParanthesisResult {
	
	 public static int count=0;
	 public static int diff=0;
	    public ArrayList<String> generateParenthesis(int A) {
	        
	        ArrayList<String> result = new ArrayList<String>();
	        ArrayList<Integer> combine = new ArrayList<Integer>();
	        
	        Map<Integer,Character> map = new HashMap<Integer,Character>();
	        map.put(1,'(');
	        map.put(0,')');
	        toCombine(result,combine,A,map);
	        
	        return result;
	        
	    }
	    
	    public void toCombine( ArrayList<String> result, ArrayList<Integer> combine,int input, Map<Integer,Character> map){
	        if(combine.size() == (2*input)){
	            StringBuilder sbr = new StringBuilder();
	            for(Integer c : combine)
	                sbr.append(map.get(c));
	                
	            result.add(sbr.toString());
	            
	            return;
	        }
	        
	        for(int i=0;i<2;i++){
	            if(i==0 && diff ==0){
	                continue;
	            }else if(i==1 && count == input){
	                continue;
	            }else{
	                combine.add(i);
	                count =count +i;
	                if(i==0)
	                	diff=diff-1;
	                else
	                	diff=diff+1;
	                toCombine(result,combine,input,map);
	                int j=combine.remove(combine.size()-1);
	                if(i==0)
	                	diff=diff+1;
	                else
	                	diff=diff-1;
	                
	                count = count -j;
	                
	            }
	            
	        }
	    }

}
