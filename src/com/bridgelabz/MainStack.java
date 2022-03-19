package com.bridgelabz;

public class MainStack {
		public static void main(String[] args){
	        MyStack myStack = new MyStack();
	        myStack.push(70);
	        myStack.push(30);
	        myStack.push(56);
	        myStack.print();
	        MyStack myStack1 = new MyStack();
	        myStack1.push(70);
	        myStack1.push(30);
	        myStack1.push(56);
	        myStack1.pop();
	        myStack1.print();
	        myStack1.peek();
	    }
}
