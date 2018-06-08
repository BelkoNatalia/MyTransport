package transportManagementSystem;

import transports.AbstractTransport;

public class Manager {
	private AbstractTransport[] myTransport;

	public Manager(AbstractTransport[] myTransport) {
		super();
		this.myTransport = myTransport;
	}

	public AbstractTransport[] sortByCost() {
		for (int i = myTransport.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {

				if (myTransport[j].getCost() > myTransport[j + 1].getCost()) {
					AbstractTransport tmpTransport = myTransport[j];
					myTransport[j] = myTransport[j + 1];
					myTransport[j + 1] = tmpTransport;
				}
			}

		}
		return myTransport;
	}
}
