package edu.kis.vh.nursery;

public final class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

	public final int report_Rejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
