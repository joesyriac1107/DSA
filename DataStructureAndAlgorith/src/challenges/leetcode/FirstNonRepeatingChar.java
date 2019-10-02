package challenges.leetcode;

import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 sol = new Solution1();
		System.out.println(sol.lengthOfLongestSubstring("abcabcdbb"));
		
	}
	

}


class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end;
        int startMax= Integer.MIN_VALUE;
        int endMax =Integer.MIN_VALUE;
        Set<Character> set = new HashSet<Character>();
        
        for(end=0;end<s.length();end++ ){
            if(set.contains(s.charAt(end))) {
            	if((end-start-1) > (endMax-startMax)) {
            		endMax=end-1;
            		startMax=start;	
            	}
            	while(s.charAt(start)!=s.charAt(end)) {
            		set.remove(s.charAt(start++));
            	}
            	set.remove(s.charAt(start++));
            }
            set.add(s.charAt(end));
        }
        
        if((end-start-1) > (endMax-startMax)) {
    		endMax=end-1;
    		startMax=start;
    	}
        
        System.out.println(endMax);
        System.out.println(startMax);
        return endMax-startMax+1;
        
    }
}