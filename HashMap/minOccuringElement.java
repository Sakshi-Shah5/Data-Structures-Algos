//Least frequent element in an array

import java.util.*;

public class Main
{
    public static int minOccuringElement(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        
 
        
        for(int i=0; i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        
       int res = -1;
       int min = arr.length;
            for(Map.Entry<Integer,Integer> map2 : map.entrySet()){
                if(map2.getValue() <= min){
                   min = map2.getValue() ;
                   res = map2.getKey();
                }
            }
            
            return res;
        }
        
     	public static void main(String[] args) {
		int[] arr = {1,1,1,2,3,3,4,4,4};
		System.out.print(minOccuringElement(arr));
	}
        
    }


