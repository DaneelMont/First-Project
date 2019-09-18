
public class Driver {

	public static void main(String[] args) {
		public static void main(String[] args) {
			IterationMathLib iterationLibrary = 
					new IterationMathLib();
			RecursiveMathLib recursionLibrary=
					new RecursiveMathLib();
			
			System.out.println("--- Iteration ---");
			runTestCode(iterationLibrary);
			System.out.println("--- Recursion ---");
			runTestCode(recursionLibrary);
		}
		public static void runTestCode(MathLib Library) {
			System.out.println("GCD(4,2) = "+Library.gcd(4, 2));
			System.out.println("ack(1,1) = "+Library.ack(1,1));
			System.out.println("fib(6) = "+Library.fib(6));
			System.out.println("hanoi(3) = "+Library.hanoi(3));
		}
	}

}
