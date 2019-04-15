package challenges.leetcode;

public class LongestPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(longestPallindrome("aaabaaaa"));

	}

	public static boolean isPallindrome(String text) {
		int start =0;
		int end = text.length()-1;
		while(start<end) {
			if(text.charAt(start++)!=text.charAt(end--))
				return false;
		}

		return true;
	}

	public static String longestPallindrome(String text) {
		if(text.length()==0)
			return "";
		int maxPallindromeLength = Integer.MIN_VALUE;
		String maxPallindrome="" + text.charAt(0);
		for(int start=0;start<text.length();start++) {
			int j= text.length();
			while(j>start) {
				while(text.charAt(--j) != text.charAt(start));

				if(isPallindrome(text.substring(start,j+1)) && text.substring(start,j+1).length()>maxPallindromeLength) {
					maxPallindromeLength=text.substring(start,j+1).length();
					maxPallindrome=text.substring(start,j+1);

				}
			}

		}

		return maxPallindrome;
	}
}
