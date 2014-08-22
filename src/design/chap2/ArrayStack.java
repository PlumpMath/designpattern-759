package design.chap2;

import java.util.ArrayList;

public class ArrayStack {
	public int stackSize;
	public ArrayList<Integer> items;
	
	public ArrayStack(int stackSize) {
		items = new ArrayList<Integer>(stackSize);
		this.stackSize = stackSize;
	}
	
	public boolean isEmpty() {
		return items.isEmpty();
	}
	
	public boolean isFull() {
		return (items.size() >= this.stackSize);
	}
	
	public void push(int item) {
		if(isFull()) {
			System.out.println("Inserting fail!");
		} else {
			items.add(new Integer(item));
			System.out.println("Inserted Item : " +item);
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail!!");
			return -1;
		} else {
			return items.remove(items.size() - 1);
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Peeking fail!!");
			return -1;
		} else {
			return items.get(items.size() - 1);
		}
	}
}
