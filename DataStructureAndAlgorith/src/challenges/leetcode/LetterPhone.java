package challenges.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LetterPhone {
	 public ArrayList<String> letterCombinations(String A) {
	        Pair[] pairArr = new Pair[A.length()];
	        
	        Map<Character,ArrayList<Character>> map = setMap();
	        ArrayList<String> result = new ArrayList<String>();
	        
	        for(int i=0;i<A.length();i++){
	            pairArr[i]= new Pair(map.get(A.charAt(i)),0);
	        }
	        
	        while(true){
	            StringBuilder sbr = new StringBuilder();
	            for(Pair pair: pairArr)
	                sbr.append(pair.arr.get(pair.index));
	            
	            result.add(sbr.toString());
	            int incrementIndex = pairArr.length-1;
	            while(increment(pairArr[incrementIndex])){
	                incrementIndex--;
	                
	                if(incrementIndex<0)
	                	break;
	            }
	            
	            if(incrementIndex<0)
	                break;
	            
	        }
	        
	        return result;
	        
	        
	    }
	    
	    public Map<Character,ArrayList<Character>>setMap(){
	        
	        Map<Character,ArrayList<Character>> map = new HashMap<Character,ArrayList<Character>>();
	        Character[] arr0 = {'0'};
	        Character[] arr1 = {'1'};
	        Character[] arr2 = {'a','b','c'};
	        Character[] arr3 = {'d','e','f'};
	        Character[] arr4 = {'g','h','i'};
	        Character[] arr5 = {'j','k','l'};
	        Character[] arr6 = {'m','n','o'};
	        Character[] arr7 = {'p','q','r','s'};
	        Character[] arr8 = {'t','u','v'};
	        Character[] arr9 = {'w','x','y','z'};
	        ArrayList<Character> list0= new ArrayList<Character>(Arrays.asList(arr0));
	        ArrayList<Character> list1= new ArrayList<Character>(Arrays.asList(arr1));
	        ArrayList<Character> list2= new ArrayList<Character>(Arrays.asList(arr2));
	        ArrayList<Character> list3= new ArrayList<Character>(Arrays.asList(arr3));
	        ArrayList<Character> list4= new ArrayList<Character>(Arrays.asList(arr4));
	        ArrayList<Character> list5= new ArrayList<Character>(Arrays.asList(arr5));
	        ArrayList<Character> list6= new ArrayList<Character>(Arrays.asList(arr6));
	        ArrayList<Character> list7= new ArrayList<Character>(Arrays.asList(arr7));
	        ArrayList<Character> list8= new ArrayList<Character>(Arrays.asList(arr8));
	        ArrayList<Character> list9= new ArrayList<Character>(Arrays.asList(arr9));
	        
	        map.put('2',list2);
	        map.put('3',list3);
	        map.put('4',list4);
	        map.put('5',list5);
	        map.put('6',list6);
	        map.put('7',list7);
	        map.put('8',list8);
	        map.put('9',list9);
	        map.put('1',list1);
	        map.put('0',list0);
	        
	        return map;
	        
	    }
	    
	    public boolean increment(Pair pair){
	        if(pair.index +1 <pair.arr.size()){
	            pair.index =pair.index+1;
	            return false;
	        }else{
	            pair.index=0;
	            return true;
	        }
	    }
	    
	    public class Pair{
	        ArrayList<Character> arr;
	        int index;
	        
	        public Pair(ArrayList<Character> arr,int index){
	            this.arr=arr;
	            this.index=index;
	        }

			@Override
			public String toString() {
				return "Pair [arr=" + arr + ", index=" + index + "]";
			}
	        
	        
	        
	    }

}
