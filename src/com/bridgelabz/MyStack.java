package com.bridgelabz;

public class MyStack {
	 MyNode head;
	 
	 public void push(int data)
	 {
	     MyNode newNode = new MyNode();
	     newNode.data=data;
	     newNode.next= head;
	     head=newNode;
	 }

	 public void print(){
	     MyNode tempNode;
	     tempNode=head;
	     System.out.println("The elements in the list are :");
	     while (tempNode.next!=null)
	     {
	         System.out.println(tempNode.data);
	         tempNode=tempNode.next;
	     }
	     System.out.println(tempNode.data);
	 }
}
