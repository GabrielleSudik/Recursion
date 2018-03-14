//recursion is when you make a method call itself
//aka a subroutine calls a subroutine

//stack = area of memory of method calls and local variables
//heap = area of memory for created objects (much bigger than stack)

public class Application {

	public static void main(String[] args) {
		
		int value = 4;
		calculate(value);
		
		int fact = 6;
		factorial(fact);
		System.out.println(factorial(fact));
		//those last two lines did the same thing
		//but the latter prints the result
	}
	
	private static void calculate(int value){
		//recursion doesn't HAVE to be static
		//but here it does cuz we're in the main class
		//and we're not making an object
		
		System.out.println(value);
		
		//it's easy to make a recursive method create an infinite loop
		//produces a stack overflow error (ie, too many items on the stack!)
		//so be careful how it's used. the following creates an infinite loop:
		//calculate(value);
		
		//here's something that works because it will stop at 1:
		if (value == 1){
			return;
		}
		calculate(value-1);
	}

	private static int factorial(int fact){
		//factorials are also common in recursion:
		if (fact == 1){
			return 1;
		}
		return factorial(fact - 1) * fact;
		
		//you need that if fact == 1 part
		//so the factorial part doesn't drop to 0 then get stuck in a loop of multiplying by 0
	}
}

//advice: make sure the method stops somewhere
//it's best for smaller calculations too

//every other example I've seen are about factorials
//but the Tower of Hanoi puzzle can be done with recursive methods too. coo.