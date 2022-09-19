import java.util.HashMap;
import java.util.Map;

//leetcode problem 1859 : sorting the sentence

//reference : https://www.youtube.com/watch?v=CHwgo6aZ5Wk
//converting char to int : https://programming.guide/java/converting-char-to-int.html

//whenever you have problems where you need to deal with individual words in a string, use space character or use split based on space  


//use of split, map.Entry<>, map.entrySet() :



public class SentenceSorting {
    public String sortSentence(String s) {
        
        //split each word based on space
        String words[] = s.split(" ");
        //The string split() method breaks a given string around matches of the given regular expression. 
        //After splitting against the given regular expression, this method returns a string array
        
        HashMap<Integer,String> map = new HashMap<>();
        
        for(String word : words){
            int lastIndex = word.length() - 1;
            
            //get the word and index separately
            int index = word.charAt(lastIndex) - '0';
            String actualWord = word.substring(0,lastIndex);
            
            map.put(index,actualWord);
        
        }
            
            //build the actual string 
            StringBuilder output = new StringBuilder();
            //if we want to access key or value from hashmap, we can use Map.Entry(), 
            //it has methods like getKey(), getValue()
            //the entrySet() method returns a set view of all the entries from the hashmap
            //note: The set view means all entries of the hashmap are viewed as a set. 
            //Entries are not converted to a set
            
            //https://www.programiz.com/java-programming/library/hashmap/entryset
            
            
            
            for(Map.Entry<Integer,String> map2 : map.entrySet()){
                output.append(map2.getValue());
                output.append(" ");
                  }
        
        return output.toString().trim();
    }
}
