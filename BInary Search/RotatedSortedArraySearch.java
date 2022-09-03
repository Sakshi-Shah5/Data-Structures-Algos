//leetcode 33 : Search in Rotated Sorted Array

public class RotatedSortedArraySearch {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low <= high){
            int mid = low + (high-low)/ 2;
            
            if (nums[mid] == target)
                return mid;
        
            if (nums[low] <= nums[mid]){
                 if (target < nums[mid] && target >= nums[low]) 
                    high = mid - 1;
                 else
                    low = mid + 1;
            } 
        
            if (nums[mid] <= nums[high]){
                if (target > nums[mid] && target <= nums[high])
                    low = mid + 1;
                 else
                    high = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String args[]) {
    	int[] nums = {4,5,6,7,0,1,2}; 
    	int target = 0;
    	
    	System.out.print(search(nums,target));
    	
    	
    }
}
