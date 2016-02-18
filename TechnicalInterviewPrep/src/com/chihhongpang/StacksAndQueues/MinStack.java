package com.chihhongpang.StacksAndQueues;

public class MinStack{

	private StackNode top;
	private StackNode min;
	
	private class StackNode {
		private int data;
		private StackNode next;
		private StackNode belowMin;
		public StackNode(int data) {
			this.data = data;
			if (min == null) {
				belowMin = this;
			} else {
				if (data < min.data) {
					belowMin = this;
				} else {
					belowMin = min;
				}
			}
		}
	}
	
	public void push (int data) {
		StackNode newNode = new StackNode(data);
		if (min == null || top == null) {
			top = newNode;
			min = newNode;
		} else {
			if (data < min.data) {
				min = newNode;
			}
			newNode.next = top;
			top = newNode;
		}
	}
	
	public int pop() {
		if (top == null) {
			System.out.println("Nothing to pop in the stack");
		}
		if (top.equals(min)) {
			if (top.next != null) {
				min = top.next.belowMin;
			} else {
				min = null;
			}
		}
		int topValue = top.data;
		top = top.next;
		return topValue;
	}
	
	public int min() {
		if (min == null) {
			return 0;
		}
		return min.data;
	}
	
	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(4);
		System.out.println("min is: " + minStack.min());
		minStack.push(3);
		System.out.println("min is: " + minStack.min());
		minStack.push(2);
		System.out.println("min is: " + minStack.min());
		System.out.println(minStack.pop());
		System.out.println("min is: " + minStack.min());
		System.out.println(minStack.pop());
		minStack.push(5);
		System.out.println("min is: " + minStack.min());
		System.out.println(minStack.pop());
		

	}

}
