package transports.groun.entity;

import transports.groun.GroundTransport;

public class SunnyBus extends GroundTransport {
	private int numberSolarBattery;

	public SunnyBus(double speed, double cost, String name, String typeRoad, int numberSolarBattery) {
		super(speed, cost, name, typeRoad);
		this.numberSolarBattery = numberSolarBattery;
	}

	public int getNumberSolarBattery() {
		return numberSolarBattery;
	}

	public void setNumberSolarBattery(int numberSolarBattery) {
		this.numberSolarBattery = numberSolarBattery;
	}

	@Override
	public double getCost() {
		return cost * 0.1 * numberSolarBattery;
	}

	@Override
	public String toString() {
		return "SunnyBus [numberSolarBattery=" + numberSolarBattery + ", typeRoad=" + typeRoad + ", speed=" + speed
				+ ", cost=" + getCost() + ", name=" + name + "]";
	}

}
