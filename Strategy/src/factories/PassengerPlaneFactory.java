package factories;

import vehicles.Flying;
import vehicles.LiftOff;

public class PassengerPlaneFactory implements AirPlaneFactory {

	@Override
	public Flying createFlying() {
		FlyingFactory flyingFactory = new FlyingFactory(); 
		return flyingFactory.createFlying("Passenger airplane");
	}

	@Override
	public LiftOff createLiftOff() {
		LiftOffFactory liftOffFactory = new LiftOffFactory();
		return liftOffFactory.createLiftOff("Horizontally");
	}

}
