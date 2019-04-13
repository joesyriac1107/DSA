package basics.datastructures.stack;

import java.util.Stack;

public class StacksChallengeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string1 ="Ihello";
		System.out.println(isPallindrome(string1));
		int a = (int) 'A';

	}

	public static boolean isPallindrome(String text) {
		int a = (int) 'a';
		int A = (int) 'A';
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<text.length();i++) {
			int textAsci = (int) text.charAt(i);
			if((a<=textAsci && textAsci<=a+25) || (A<=textAsci && textAsci<=A+25))
				stack.push(text.charAt(i));

		}

		for(int i=0; i<text.length();i++) {
			int textAsci = (int) text.charAt(i);
			if((a<=textAsci && textAsci<=a+25) || (A<=textAsci && textAsci<=A+25)) {
				if(!(Character.toLowerCase(stack.pop()) == (Character.toLowerCase(text.charAt(i)))))
					break;

			}

		}

		if(stack.isEmpty())
			return true;
		else
			return false;
	}
}
