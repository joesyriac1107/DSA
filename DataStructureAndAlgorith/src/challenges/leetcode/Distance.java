package challenges.leetcode;

public class Distance {
public int minDistance(String A, String B) {
        
        int[][] arr = new int[A.length()+1][B.length()+1];
        arr[0][0]=0;
        for(int i =1;i<=A.length();i++)
            arr[i][0]=arr[i-1][0]+1;
         for(int i =1;i<=B.length();i++)
            arr[0][i]=arr[0][i-1]+1;
    
        for(int i=1;i<A.length();i++){
            for(int j=1;j<A.length();j++){
                if(A.charAt(i-1)==B.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1];
                }else{
                    arr[i][j]=min(arr[i-1][j],arr[i-1][j-1],arr[i][j-1]) +1;
                }
            }
        }
        
        return arr[A.length()][B.length()];
        
        
    }
    
    public int min (int a, int b,int c){
        int temp=Math.min(a,b);
        return Math.min(temp,c);
    }

}
