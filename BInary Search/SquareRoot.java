//find square root of x  //leet 69
//(You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5)

public class SquareRoot {
	
	static int squareRoot(int x) {
		
		//base case 
      		 if(x == 1)
          	  return 1;
		
		//square root of x lies between 1 and x/2
		int low = 1;
		int high = x/2;
		int square;
		
		while(low <= high) {
			int mid = low + (high-low)/2;
			square = mid * mid;
			if(square > x) {
				high = mid-1;
			}
			else if(square < x) {
				low = mid+1;
			}
			else {    
//if square == x and as square is mid*mid, 
				//therefore mid will be the sq.root of x
				return mid;
			}
		}
		return high; //if not a perfect square
		
	}
	
	public static void main(String[] args) {
		int x = 8;
		System.out.print(squareRoot(x));
	}

}
