package factories;

import vehicles.Flying;
import vehicles.LiftOff;

public class ModelAirPlaneFactory implements AirPlaneFactory {

	@Override
	public Flying createFlying() {
		FlyingFactory flyingFactory = new FlyingFactory(); 
		return flyingFactory.createFlying("I don't fly");
	}

	@Override
	public LiftOff createLiftOff() {
		LiftOffFactory liftOffFactory = new LiftOffFactory();
		return liftOffFactory.createLiftOff("I don't LiftOff");
	}

}
