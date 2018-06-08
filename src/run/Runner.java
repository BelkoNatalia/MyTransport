package run;

import transportManagementSystem.Manager;
import transports.AbstractTransport;
import transports.air.entity.FlyingTaxi;
import transports.air.entity.Trolley;
import transports.groun.entity.SunnyBus;
import transports.undeground.entity.Undeground;

public class Runner {

	public static void main(String[] args) {
		FlyingTaxi flyTaxi1 = new FlyingTaxi(100, 5, "Планер", 20, 1);
		FlyingTaxi flyTaxi2 = new FlyingTaxi(90, 4, "Планер-2", 30, 2);
		Trolley trolley1 = new Trolley(20, 1, "Тележка скоростная", 40, 2);
		SunnyBus sunnBus1 = new SunnyBus(80, 10, "Автобус скоростной", "автодорога", 5);
		Undeground undegr1 = new Undeground(200, 1, "Метро", 20, 5);

		AbstractTransport[] myTransport = { flyTaxi1, flyTaxi2, trolley1, sunnBus1, undegr1 };

		Manager m1 = new Manager(myTransport);

		AbstractTransport[] mySortTransportCost = m1.sortByCost();

		for (int i = 0; i < mySortTransportCost.length; i++) {
			System.out.println(mySortTransportCost[i]);
		}
	}
}
