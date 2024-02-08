package Lab_Sheet1;

public class stackX {
	private int maxSize;
	private double[] stackArray;
	private int top;

	public stackX(int s) {
		maxSize = s;
		stackArray = new double[maxSize];
		top = -1;
	}

	public void push(int i) {
		if (top == maxSize - 1) {
			System.out.println("Stack is full");

		} else {
			stackArray[++top] = i;
		}
	}
	
	public double pop() {
		if(top==-1) {
			return -99;
		}
		else {
			return stackArray[top--];
		}
	}
	
	public double peek() {
		if(top==-1) {
			return -99;
		}
		else {
			return stackArray[top];
		}
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isFull() {
		return (top == maxSize-1);
	}
	
	
}
