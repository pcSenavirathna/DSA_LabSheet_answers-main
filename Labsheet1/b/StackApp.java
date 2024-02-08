package labsheet1_b;

public class StackApp {

	public static void main(String[] args) {
		
		//create a new instance of the StackX class
		StackX stack = new StackX(5);
		
		//insert characters to the stack using push() method
		stack.push(50);
		stack.push(42);
		stack.push(63);
		stack.push(99);
		stack.push(14);
		stack.push(454);
		
		//Remove the content of the stack and display them 
		while(!stack.isEmpty()) {
			double val = stack.pop();
			System.out.println(val);
		}
	}

}
