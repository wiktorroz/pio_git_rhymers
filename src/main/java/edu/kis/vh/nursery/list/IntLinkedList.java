package edu.kis.vh.nursery.list;

public final class IntLinkedList {

	Node last;
	int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public final boolean isEmpty() {
		return last == null;
	}

	public final boolean isFull() {
		return false;
	}

	public final int top() {
		if (isEmpty())
			return -1;
		return last.value;
	}

	public final int pop() {
		if (isEmpty())
			return -1;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
