public class ConvertibleCar extends Car implements ICar {
	private boolean isRaised = true;
	

	public ConvertibleCar(String model, IEngine engine, IIgnition ignitionSystem) {
		super(model, engine, ignitionSystem);
	}
	
	public boolean getIsRaised() {
		return !this.isRaised;
	}
	
	public boolean getIsLowered() {
		return this.isRaised;
	}
}
