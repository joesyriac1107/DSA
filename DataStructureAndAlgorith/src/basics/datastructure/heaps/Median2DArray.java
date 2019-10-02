package basics.datastructure.heaps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Median2DArray {
	
public int evalRPN(ArrayList<String> A) {
        
        Stack<String> stack = new Stack<String>();
        Set<String> operands = new HashSet<String>();
        for(String a : A){
            if(operands.contains(a)){
                int result = operation(a,stack.pop(),stack.pop()); 
                stack.push(String.valueOf(result));
            }else{
                stack.push(a);
            }
        }
        
        return Integer.valueOf(stack.pop());
    }
    
    public int operation(String operand,String value1,String value2){
    
        switch(operand){
            case "+":
                return Integer.valueOf(value1)+Integer.valueOf(value2);
            case "-":
                return Integer.valueOf(value1)-Integer.valueOf(value2);
            case "/":
                return (Integer.valueOf(value1))/(Integer.valueOf(value2));
            case "*":
                return Integer.valueOf(value1)*Integer.valueOf(value2);
            default:
                return 0;
        }
    }

}
