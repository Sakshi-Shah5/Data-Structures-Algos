import java.util.HashMap;


//leetcode 387
public class FirstUniqueChar {
	
	public static char firstUniqChar(String str){
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			 if(!map.containsKey(ch)){
				 map.put(ch, 1);
			 }
			 else {
				 map.put(ch, map.get(ch) + 1);
			 }
		  }
		
		  for(int i=0; i<str.length(); i++) {
			  char ch = str.charAt(i);
			  
			  if(map.get(ch) == 1) {
				  return ch;
			  }
			  
			  
		  }
		  
		  
		  return 0; 
		}
	
	public static void main(String[] args) {
		String str = "sakshi";
		System.out.print(firstUniqChar(str));
		
	}

}
