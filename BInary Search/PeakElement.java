//leetcode 162

//note: it's not a sorted array, that's the trick of the question. The technique is same (divide and conquer approach) but it’s not exactly binary search.


//algo :
//first, find mid element and compare it to the next element 
//if that element is less than it's next element, then we know that it's definitely not the peak element as it's less than it's next element, so the peak element could be the one on it's right, therefore low = mid+1
//if that element is greater than the next element, it is possible that element itself could be the peak element OR it might be in the left space

//refer: https://www.youtube.com/watch?v=U9iw_aTuGV0&list=PL1MJrDFRFiKb-0XR5DIdbz5CaQH6FjWvo&index=4


class PeakElement{
    public static int findPeakElement(int[] nums){
        
        int low = 0;
        int high = nums.length-1;
        
        while(low < high){  //note: it's not low<=high
            int mid = low + (high-low)/2;
            
            if(nums[mid] < nums[mid+1]){
                low = mid+1;
            }
            else {
                high = mid; 
       //here,not using high = mid-1 because if the case is [1,2,3,1,4], the peak element would be mid itself i.e 3 and if we write high = mid-1, 3 would be excluded from the search space
            }
        }
        
        return low; //or return high
        //if you look the condition for the while loop, the only time when the while loop breaks is when "L" == "R" i.e when we found our peak element
    }
    
    public static void main(String[] args){
    	int nums[] = {1,2,1,3,5,6,4};
    	
    	System.out.print(findPeakElement(nums));
    }
}
