package factories;

import vehicles.Flying;
import vehicles.LiftOff;

public class HarrierFactory implements AirPlaneFactory {

	/* (non-Javadoc)
	 * @see tests.AirPlaneFactory#createFlying()
	 */
	@Override
	public Flying createFlying() {
		FlyingFactory flyingFactory = new FlyingFactory(); 
		return flyingFactory.createFlying("Fighter Jet");
		
	}

	/* (non-Javadoc)
	 * @see tests.AirPlaneFactory#createLiftOff()
	 */
	@Override
	public LiftOff createLiftOff() {
		LiftOffFactory liftOffFactory = new LiftOffFactory();
		return liftOffFactory.createLiftOff("Vertically");
	}

}
