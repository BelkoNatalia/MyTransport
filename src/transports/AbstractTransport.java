package transports;

public abstract class AbstractTransport {
	protected double speed;
	protected double cost;
	protected String name;

	public AbstractTransport(double speed, double cost, String name) {
		this.speed = speed;
		this.cost = cost;
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public abstract double getCost();

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
