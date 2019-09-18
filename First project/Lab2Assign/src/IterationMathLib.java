public class IterationMathLib {
	//GCD
	@Override 
	public int gcd(int x, int y){
		int temp;
		while(y!=0) {
			if(x>=y && x!=0) {
				temp = x;
				x=y;
				y=temp % x;
			}
		}
		return x;
	}
	
	//Ackermann's Function
	@Override
	public int ack(int x, int y) {
		while(x!=0) {
			
		}
		return y+1;
		while(y!=0) {
			
		}
	}
	//Fibonacci
	@Override
	public int fib(int x) {

		while(x!=0) {
			
			if(x==1) {
				
				return 1;
			}
			else if(x>1) {
				
				return x-1 + x-2;
			}
			return 0;
		}
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	//Tower of Hanoi Problem
	@Override
	public int hanoi(int n) {
		while(n!=1) {
			if(n>1)
				n=2 * hanoi(n-1)+1; 
		}
		return 1;
	}
}
