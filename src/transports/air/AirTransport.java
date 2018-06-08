package transports.air;

import transports.AbstractTransport;

public abstract class AirTransport extends AbstractTransport {
	protected double hightFly;
	
	public AirTransport(double speed, double cost, String name, double hightFly) {
		super(speed, cost, name);
		this.hightFly = hightFly;
	}

	public double getHightFly() {
		return hightFly;
	}

	public void setHightFly(double hightFly) {
		this.hightFly = hightFly;
	}
	
	public abstract double getCost();

}
