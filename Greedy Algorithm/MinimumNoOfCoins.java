import java.util.ArrayList;
import java.util.Arrays;

//ps : Given a value of V Rs and an infinite supply of each of 
//the denominations {1, 2, 5, 10, 20, 50, 100, 500, 1000} valued coins/notes, 
//The task is to find the minimum number of coins and/or notes needed to make the change


public class MinimumNoOfCoins {

	static void findMin(int coins[],int V) {
		
		Arrays.sort(coins); 
		
		ArrayList<Integer> list = new ArrayList<>();
		
//after sorting, start from max element(i.e last element) as we need min number of coins 
//if we start taking max elements first, we'll need less coins that way
		
		
		
		for(int i=coins.length-1 ; i>=0 ; i--){
			
			while(V >= coins[i]) {
				V = V - coins[i];
				list.add(coins[i]);
			}
		}
		
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i) + " ");			
		}
		
		//to get number/count of coins :
		//System.out.print(list.size());
			
	}
	
	public static void main(String args[]) {
		int coins[] = {10,5,20,25};
		int V = 75;
		
	    findMin(coins,V);
		
	}
		
		
	
}

//A Greedy algorithm is one of the problem-solving methods which takes optimal solution in each step.
//The Greedy algorithm attempts to take the best in each step and it doesn't care about the overall result.
//Greedy Approach - "Living in the present. Don't overthink about the future".
