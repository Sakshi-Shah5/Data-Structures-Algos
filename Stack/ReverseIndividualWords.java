import java.util.Stack;

public class ReverseIndividualWords {
	
	
	public static void reverse(String str) {
		
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) != ' ') {
				st.push(str.charAt(i));
			}
			else {
				while(!st.isEmpty()) {
					System.out.print(st.pop());
				}
				System.out.print(" ");
			}
		}
		
		while(!st.isEmpty()) {
			System.out.print(st.pop());
		}
		
	}

	public static void main(String args[]) {
		String str = "hi welcome sakshi";
		
		reverse(str);
		
	}
}
