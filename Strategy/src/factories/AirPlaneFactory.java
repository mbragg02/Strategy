package factories;

import vehicles.Flying;
import vehicles.LiftOff;

public interface AirPlaneFactory {

	public abstract Flying createFlying();

	public abstract LiftOff createLiftOff();

}