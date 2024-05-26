package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int VALUE = -1;

    // Do numbers dodalem final
    private final int[] numbers = new int[SIZE]; // zmiana nazwy zmiennej na lowercase, private

    private int total = VALUE; // zmiana na private

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == VALUE;
    }

    public boolean isFull() {
        return total == numbers.length - 1;
    }


	protected int peekaboo() {
        if (callCheck())
            return VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return VALUE;
        return numbers[total--];
    }

}