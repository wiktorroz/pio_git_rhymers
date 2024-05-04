package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int[] numbers = new int[12]; // zmiana nazwy zmiennej na lowercase, private

    private int total = -1; // zmiana na private

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == numbers.length - 1;
    }


	protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}