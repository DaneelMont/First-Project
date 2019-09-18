public class Driver {

public static void main(String[] args) {
// TODO Auto-generated method stub
IterationMathlib interationLibrary = new IterationMathlib();
RecursiveMathlib recursionLibrary = new RecursiveMathlib();
System.out.println("----Iteration------");
runTestCode(interationLibrary);
System.out.println("-----Recursion------");
runTestCode(recursionLibrary);

}

public static void runTestCode(Mathlib library) {
System.out.println("GCD = " +library.gcd(4, 2));
System.out.println("Fib = " +library.fib(2));
System.out.println("Hanoi = " +library.hanoi(2));
}
}