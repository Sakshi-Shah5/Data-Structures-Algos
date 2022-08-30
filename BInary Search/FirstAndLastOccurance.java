
public class FirstAndLastOccurance {
	
	public static int first(int arr[],int x) {
		int low = 0;
		int high = arr.length-1;
		
		int first = -1;
		
		while(low <= high) {
			int mid = low + ((high-low)/2);
			
			if(x < arr[mid]) {
				high = mid - 1;
			}
			else if(x > arr[mid]) {
				low = mid + 1;
			}
			else {
			   first = mid;
			   high = mid - 1;
			}
		}
		
		return first;
	}
	
	public static int last(int arr[],int x) {
		int low = 0;
		int high = arr.length-1;
		int last = -1;
		
		while(low <= high) {
			int mid = low + ((high-low)/2);
			
			if(x < arr[mid]) {
				high = mid-1;
			}
			else if(x > arr[mid]) {
				low = mid + 1;
			}
			else {
				last = mid;
				low = mid + 1;
			}
		}
		
        return last;		
	}
	
	public static void main(String args[]) {
		int[] arr = {1, 1, 1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
		int x = 2;
		
		System.out.println("Element to be searched: " + x);
		System.out.println("First Occurrence index = " + first(arr,x));
		System.out.println("Last Occurrence index= " + last(arr,x));
	}

}
