package transports.groun;

import transports.AbstractTransport;

public abstract class GroundTransport extends AbstractTransport{
	protected String typeRoad;
	
	public GroundTransport(double speed, double cost, String name, String typeRoad) {
		super(speed, cost, name);
		this.typeRoad = typeRoad;
	}

	public String getTypeRoad() {
		return typeRoad;
	}

	public void setTypeRoad(String typeRoad) {
		this.typeRoad = typeRoad;
	}

}
