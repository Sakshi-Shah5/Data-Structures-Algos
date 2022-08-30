//leetcode 26

public class RemoveDuplicates {

public static int remDuplicates(int[] nums) {
        
        int n = nums.length;
        
        //base case:
        if(n < 2)
            return n;
        
        //define pointers 
        int left = 0;
        int right = 1;
        
        //remove duplicates in place
        while(right < n){
            if(nums[left] == nums[right]){
                right++ ;
            }
            
            else if(nums[left] != nums[right]){
                left ++;
                nums[left] = nums[right];
            }
        }
        
        //return sizeof the sub-array
        return left + 1;
        
        
    }

	public static void main(String[] args) {
		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		
		System.out.print(remDuplicates(nums));
		
	}

}





    

