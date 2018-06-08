package transports.air.entity;

import transports.air.AirTransport;

public class Trolley extends AirTransport {
	private int numberRopes;

	public Trolley(double speed, double cost, String name, double hightFly, int numberRopes) {
		super(speed, cost, name, hightFly);
		this.numberRopes = numberRopes;
	}

	public int getNumberRopes() {
		return numberRopes;
	}

	public void setNumberRopes(int numberRopes) {
		this.numberRopes = numberRopes;
	}

	@Override
	public double getCost() {
		return cost * numberRopes / 2;
	}

	@Override
	public String toString() {
		return "Trolley [numberRopes=" + numberRopes + ", hightFly=" + hightFly + ", speed=" + speed + ", cost="
				+ getCost() + ", name=" + name + "]";
	}

}
