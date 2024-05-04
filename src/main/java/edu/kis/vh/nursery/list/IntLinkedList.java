package edu.kis.vh.nursery.list;

public final class IntLinkedList {

	private Node last;
	private int i;

	

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

}	
