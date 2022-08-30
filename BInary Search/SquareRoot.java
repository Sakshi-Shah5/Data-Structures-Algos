//find square root of x  //leet 69
//(You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5)

public class SquareRoot {
	
	static int squareRoot(int x) {
		
		//square root of x lies between 1 and x/2
		int low = 1;
		int high = x/2;
		int ans=0;
		
		while(low <= high) {
			int mid = low + (high-low)/2;
			int square = mid * mid;
			if(square > x) {
				high = mid-1;
			}
			else if(square < x) {
				ans = mid;
				low = mid+1;
			}
			else {
				return mid;
			}
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		int x = 120;
		System.out.print(squareRoot(x));
	}

}
