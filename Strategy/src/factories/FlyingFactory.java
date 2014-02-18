package factories;

import vehicles.Flying;
import vehicles.IDontFly;
import vehicles.IFlyLikeFJ;
import vehicles.IFlyLikePP;

public class FlyingFactory {

	public Flying createFlying(String string) {
		if(string.equals("Fighter Jet")){ 
			return new IFlyLikeFJ();
		}
		if(string.equals("Passenger airplane")){ 
			return new IFlyLikePP();
		}
		if(string.equals("I don't fly")){ 
			return new IDontFly();
		}
		return null;
	}

}
