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
	 
	 public void pop()
	 {
	     if (head==null)
	     {
	         System.out.println("Stack is Empty");
	     }
	     else{
	         MyNode tempNode = head;
	         head = head.next;
	         System.out.println("Popped element is :"+tempNode.data);
	         }
	 }
	 public void peek(){
	     if(head==null){
	         System.out.println("Stack is having no values");
	     }
	     else
	     {
	         System.out.println("The top most Element is " + head.data);
	     }
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