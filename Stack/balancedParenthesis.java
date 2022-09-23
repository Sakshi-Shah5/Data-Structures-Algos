package leetcode_problems;

import java.util.Stack;

public class balancedParenthesis {

	 public static boolean isValid(String s) {
	        
	        if(s.length() % 2 != 0) return false;
	        
	        
	        Stack<Character> stack = new Stack<Character>();
	        for(int i = 0; i < s.length(); i++) {
	            char a = s.charAt(i);
	            if(a == '(' || a == '[' || a == '{') {
	                stack.push(a); 
	            }
	                
	        
	            else if(a == ')' && !stack.isEmpty() && stack.peek() == '(' ){
	                stack.pop();
	            }
	            else if(a == ']' && !stack.isEmpty() && stack.peek() == '[' ){
	                stack.pop();
	            }
	            else if(a == '}' && !stack.isEmpty() && stack.peek() == '{' ){
	                stack.pop();
	            }
	            else{
	                stack.push(a);
	            }
	         
	        }
	        return stack.isEmpty();
	    }
	 
	 
	 public static void main(String[] args) {
		 String s = "(([{}])";
		 if(isValid(s)) {
			 System.out.println("Balanced ");
		 }
		 else {
			 System.out.println("Not Balanced ");
		 }
	 }
	
}
