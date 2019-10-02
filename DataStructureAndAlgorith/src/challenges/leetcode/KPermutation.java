package challenges.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class KPermutation {
public String getPermutation(int A, int B) { 
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int i=1;i<=A;i++)
            arr.add(i);
            
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        result.add(new ArrayList<Integer>());
        result.get(0).add(arr.get(0));
        
        for(int i=1;i<arr.size();i++){
            int size = result.size();
            for(int j =0;j<size;j++){
                result.get(j).add(arr.get(i));
                permute(result,result.get(j));
               
            }
            
        }
        
        Collections.sort(result,new ArrayComparator());
        
        StringBuilder sbr = new StringBuilder();
        for(Integer val : result.get(B-1))
            sbr.append(val);
        
        return sbr.toString();
    }
    
            public void permute( ArrayList<ArrayList<Integer>> result, ArrayList<Integer> array){
                for(int i=0;i<array.size()-1;i++){
                    result.add(swap(new ArrayList<Integer>(array),i,array.size()-1));
                }
            
    
    
        }
        
        public ArrayList<Integer> swap(ArrayList<Integer> array,int start,int end){
            int temp=array.get(start);
            array.set(start,array.get(end));
            array.set(end,temp);
            
            return array;
        }
        
        class ArrayComparator implements Comparator<ArrayList<Integer>>{ 
        
            public int compare(ArrayList<Integer> s1, ArrayList<Integer> s2) {
                
                for(int i=0;i<s1.size();i++){
                if (s1.get(i) > s2.get(i)) 
                    return 1; 
                else if (s1.get(i) < s2.get(i)) 
                    return -1; 
                    
                }
                  return 0; 
            } 
            
        }
        

}
