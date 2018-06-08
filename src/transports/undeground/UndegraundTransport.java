package transports.undeground;

import transports.AbstractTransport;

public abstract class UndegraundTransport extends AbstractTransport {
	protected double depthBelowGraund;

	public UndegraundTransport(double speed, double cost, String name, double depthBelowGraund) {
		super(speed, cost, name);
		this.depthBelowGraund = depthBelowGraund;
	}

	public double getDepthBelowGraund() {
		return depthBelowGraund;
	}

	public void setDepthBelowGraund(double depthBelowGraund) {
		this.depthBelowGraund = depthBelowGraund;
	}

}
