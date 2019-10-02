package challenges.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class NQueen {

	public ArrayList<ArrayList<String>> solveNQueens(int a) {

		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		ArrayList<Integer> columns = new ArrayList<Integer>();
		columns.add(0);
		
		columns.su
		
		HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
		map.pu

		return result;
	}
	


	

	public void addToResult(ArrayList<Integer> columns,ArrayList<ArrayList<String>> result) {

		for(int a : columns) {
			StringBuilder sbr = new StringBuilder();
			for(int i=0;i<a;i++) {
				sbr.append(".");
			}
			sbr.append("Q");
			for(int i=a+1;i<columns.size();i++) {
				sbr.append(".");
			}
		}

	}
}
