package transports.air.entity;

import transports.air.AirTransport;

public class FlyingTaxi extends AirTransport {
	private int levelSits;

	public FlyingTaxi(double speed, double cost, String name, double hightFly, int levelSits) {
		super(speed, cost, name, hightFly);
		this.levelSits = levelSits;
	}

	public int getLevelSits() {
		return levelSits;
	}

	public void setLevelSits(int levelSits) {
		this.levelSits = levelSits;
	}

	@Override
	public double getCost() {
		return cost * levelSits;
	}

	@Override
	public String toString() {
		return "FlyingTaxi [levelSits=" + levelSits + ", hightFly=" + hightFly + ", speed=" + speed + ", cost="
				+ getCost() + ", name=" + name + "]";
	}

}
