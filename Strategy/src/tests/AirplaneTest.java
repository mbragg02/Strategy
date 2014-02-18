/**
 * 
 */
package tests;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import vehicles.Airplane;
import vehicles.Flying;
import vehicles.LiftOff;

/**
 * @author oded
 *
 */
public class AirplaneTest {

	private static FlyingFactory flyingFactory;
	private static LiftOffFactory liftOffFactory;
	
	@BeforeClass
	public static void onlyOnce(){ 
		flyingFactory = new FlyingFactory();
		liftOffFactory = new LiftOffFactory();
		
	}

	

	@Test
	public void test1() {
				
		String expectedOutput = "Like a fighter jet";
		String stringReturned = null;
		
		Flying fly = flyingFactory.createFlying("Fighter Jet");
		LiftOff liftOff = liftOffFactory.createLiftOff("Vertically");

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	
	@Test
	public void test2() {
				
		String expectedOutput = "I don't Fly";
		String stringReturned = null;
		
		Flying fly = flyingFactory.createFlying("I don't fly");
		LiftOff liftOff = liftOffFactory.createLiftOff("Vertically");

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test3() {
				
		String expectedOutput = "Like a passenger airplane";
		String stringReturned = null;
		
		Flying fly = flyingFactory.createFlying("Passenger airplane");
		LiftOff liftOff = liftOffFactory.createLiftOff("Vertically");

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	
	@Test
	public void test4() {
				
		String expectedOutput = "Vertically";
		String stringReturned = null;

		Flying fly = flyingFactory.createFlying("Fighter Jet");
		LiftOff liftOff = liftOffFactory.createLiftOff("Vertically");

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test5() {
				
		String expectedOutput = "I don't LiftOff";
		String stringReturned = null;

		Flying fly = flyingFactory.createFlying("Fighter Jet");
		LiftOff liftOff = liftOffFactory.createLiftOff("I don't LiftOff");

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	@Test
	public void test6() {
				
		String expectedOutput = "Horizontally";
		String stringReturned = null;

		Flying fly = flyingFactory.createFlying("Fighter Jet");
		LiftOff liftOff = liftOffFactory.createLiftOff("Horizontally");

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}


}
