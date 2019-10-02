package challenges.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import basics.datastructure.heaps.Median2DArray;

public class Application {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		int arrLength = Integer.valueOf(sc.nextLine());
//
//		String secondLine = sc.nextLine();
//		String[] input = secondLine.split(" ");
//
//		ArrayList<Integer> ingredientArray = new ArrayList<Integer>();
//		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//		for(int i=0;i<arrLength;i++ ){
//			ingredientArray.add(Integer.valueOf(input[i]));
//			map.put(Integer.valueOf(input[i]),i+1);
//		}
//
//		Collections.sort(ingredientArray);
//
//		int testcases = Integer.valueOf(sc.nextLine());
//
//		for(int i=0;i<testcases;i++){
//
//			String lryString= sc.nextLine();
//			String[] lryInput = secondLine.split(" ");
//			ArrayList<Integer> lryArray = new ArrayList<Integer>();
//
//			for(int j =0;j<3;j++){
//				lryArray.add(Integer.valueOf(lryInput[j]));
//
//			}
//
//
//			int sum =0;
//			for(Integer a : ingredientArray){
//				if(map.get(a)>=(lryArray.get(0)) && map.get(a)<=(lryArray.get(1))){
//					sum = sum + a;
//					if(sum>=lryArray.get(2))
//						break;
//				}
//
//			}
//
//			if(sum>=lryArray.get(2))
//				System.out.println(sum);
//			else
//				System.out.println(-1);
//
//
		
		
//		Integer[] arr = {18, 24, 23, 10, 16, 19, 2, 9, 5, 12, 17, 3, 28, 29, 4, 13, 15, 8};
//		
//		ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));
//		CoinChange cc = new CoinChange();
//		cc.coinchange2(arrList, 458);
		
		Distance ds = new Distance();
		ds.minDistance("a", "b");
	}
}
