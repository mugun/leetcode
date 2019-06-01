package Stack;
import java.util.*;
//https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/
public class evalRPN {
    public int evalRPNf(String[] tokens) {
    	int res=0;
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<tokens.length;i++) {
        	if(!tokens[i].equals("+")&&!tokens[i].equals("*")&&!tokens[i].equals("-")&&!tokens[i].equals("/")) {
        		stack.push(Integer.parseInt(tokens[i]));
        	}else {
        		int num1=stack.pop();
        		int num2=stack.pop();
        		int sum;
        		if(tokens[i].equals("+")){
        			sum=num1+num2;
        		}else if(tokens[i].equals("-"))
        			sum=num2-num1;
        		else if(tokens[i].equals("*"))
        			sum=num2*num1;
        		else
        			sum=num2/num1;
        		stack.push(sum);
        	}
        }
        res=stack.pop();
        return res;
    }
}
