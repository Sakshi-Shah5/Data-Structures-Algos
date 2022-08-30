package leetcode_problems;

public class leetcode167 {

	
public static boolean twoSum(int[] numbers, int target) {
	

        
        int left = 0;
        int right = numbers.length - 1;
        
        while(left < right){
            int sum = numbers[left] + numbers[right];
            
            if(sum == target){
                return true;
            }
            
            else if(sum > target){
                right --;
            }
            else{
                left ++;
            }
        }
        return false;
    }


	public static void main(String[] args) {
		int[] numbers = {2,7,11,15};
		int target = 99;
		


			if(twoSum(numbers,target)) {
				System.out.print("Array has 2 elements with the given sum");
			}
			else {
				System.out.print("no two elements found");
			}
	
		
		
	}
}
