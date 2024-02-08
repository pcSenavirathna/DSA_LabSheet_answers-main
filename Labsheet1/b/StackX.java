package labsheet1_b;

public class StackX {
	private int maxSize;
	private double[] stackArray;
	private int top;
	
	public StackX(int i) {
		maxSize = i;
		stackArray = new double[maxSize];
		top = -1;
	}
	
	public void push(int j) {
		if(top == maxSize-1) {
			System.out.println("Stack is full");
		}
		else {
			stackArray[++top] = j;
		}
	}
	
	public double pop() {
		if(top == -1) {
			return -99;
		}
		else {
			return stackArray[top--];
		}
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
}
