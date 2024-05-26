package edu.kis.vh.nursery;

public final class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public final int report_Rejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
