
public class RecursiveMathLib extends MathLib
	{
		
		@Override
		public int gcd(int x, int y) {
			if(y==0) {
				return x;
			}	
			if(x>=y && x!=0) {
				return gcd(y, x % y);
			}
			return 0;
		}//GCD
		
		
		@Override
		public int ack(int x, int y) {
			while(x!=0) {
				
			}
			return y+1;
			while(y!=0) {
				
			}
		}//Ackermann's Function
		
		
		@Override
		public int fib(int x) {
			if(x==0) {
				
				return 0;
						
			}
			if(x==1) {
				
				
				return 1;
			}
			if(x>1) {
				
				return(x-1 + x-2);
				
		}//Fibonacci
		
		
		@Override
		public int hanoi(int n) {
			while(n!=1) {
				if(n>1)
					n = 2 * hanoi(n-1)+1; 
			}
			return 1;
		}//Tower of Hanoi Problem
}
