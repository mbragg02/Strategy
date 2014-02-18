package tests;

import vehicles.IDontLiftOff;
import vehicles.ILiftOffH;
import vehicles.ILiftOffV;
import vehicles.LiftOff;

public class LiftOffFactory {

	public LiftOff createLiftOff(String string) {
		if(string.equals("Vertically")){ 
			return new ILiftOffV();
		}
		if(string.equals("Horizontally")){ 
			return new ILiftOffH();
		}
		if(string.equals("I don't LiftOff")){ 
			return new IDontLiftOff();
		}
		return null;
	}

}
