package challenges.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {


	public boolean isValid(String s) {

		Stack<Character> stack = new Stack<Character>();

		Map<Character, Character> characterMap = new HashMap<Character, Character>();

		characterMap.put(')', '(');
		characterMap.put('}', '{');
		characterMap.put(']', '[');


		for(int i=0;i<s.length();i++) {
			if(characterMap.containsKey(s.charAt(i))) {
				if(stack.isEmpty())
					return false;
				if(stack.pop() != characterMap.get(s.charAt(i)))
					return false;

			}else
				stack.push(s.charAt(i));



		}

		if(stack.isEmpty())
			return true;
		else
			return false;

	}

	public int longestValidParentheses(String s) {
		Stack<Integer> stack = new Stack<Integer>();


		int startIndex=0;
		int endIndex=0;
		int prevMaxLength=0;
		int currentMaxLength=0;
		int maxLength=0;

		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i) == '(') { 
				if(stack.isEmpty()) {
					prevMaxLength=0;
					currentMaxLength=0;
					continue;
					
				}
					
				else {
					endIndex=stack.pop();
 					startIndex=i;
					if(endIndex-startIndex+1 > currentMaxLength)
						currentMaxLength=endIndex-startIndex+1;
					if(prevMaxLength+currentMaxLength > maxLength)
						maxLength=prevMaxLength+currentMaxLength;
				}
			}else {
				if(stack.isEmpty()) {
					prevMaxLength=currentMaxLength;
					currentMaxLength=0;
				}
				stack.push(i);

			}

		}

		return maxLength;
	}

}


