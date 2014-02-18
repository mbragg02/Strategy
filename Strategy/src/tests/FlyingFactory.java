package tests;

import vehicles.Flying;
import vehicles.IFlyLikeFJ;

public class FlyingFactory {

	public Flying createFlying(String string) {
		if(string.equals("Fighter Jet")){ 
			return new IFlyLikeFJ();
		}
		return null;
	}

}
