package edu.kis.vh.nursery.list;

public final class IntLinkedList {

	private Node last;
	private int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	private final boolean isEmpty() {
		return last == null;
	}

	public final boolean isFull() {
		return false;
	}

	public final int top() {
		if (isEmpty())
			return -1;
		return last.getValue();
	}

	public final int pop() {
		if (isEmpty())
			return -1;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	int getI() {
		return i;
	}

	void setI(int i) {
		this.i = i;
	}

	private Node getLast() {
		return last;
	}

	private void setLast(Node last) {
		this.last = last;
	}

}	
