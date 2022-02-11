package carinterface;

public class SimpleCar {
	private CarDriver driver;
	private int velocity;
	
	public SimpleCar() {
		
	}
	
	public SimpleCar(CarDriver driver, int velocity) {
		this.setDriver(driver);
		this.setVelocity(velocity);
	}
	
	void accerlerate() {
		this.setVelocity(this.getVelocity() + 10);
	}
	
	public void brake() {
		this.setVelocity(this.getVelocity() - 10);
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public CarDriver getDriver() {
		return driver;
	}

	public void setDriver(CarDriver driver) {
		this.driver = driver;
	}
	
}
