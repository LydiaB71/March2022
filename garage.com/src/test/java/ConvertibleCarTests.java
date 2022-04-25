import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConvertibleCarTests {
	private ConvertibleCar Car;

	@BeforeClass
	public void setup() {
		String model = "Miata";
		IEngine engine = new SmallEngine();
		IIgnition ignitionSystem = new ElectronicIgnition();

		this.Car = new ConvertibleCar(model, engine, ignitionSystem);
	}

	@Test
	public void canBuildConvertibleCar() {
		ConvertibleCar car = this.Car;

		String actualModel = car.getModel();

		assertEquals(actualModel, Car.getModel() , "");
	}

	@Test
	public void canStartConvertibleCar() {
		ConvertibleCar car = this.Car;
		
		boolean isStarted = car.getIsStarted();

		assertTrue(isStarted, "");
	}

	@Test
	public void canLowerTop() {
		ConvertibleCar car = this.Car;
		
		boolean isRaised = car.getIsLowered();
		
		assertTrue(isRaised,"Car top is not already raised");
	}

	@Test
	public void canRaiseTop() {
	ConvertibleCar car = this.Car;
		
		boolean isRaised = car.getIsRaised();
		
		assertFalse(isRaised,"Car top is raised already");
	}
}
