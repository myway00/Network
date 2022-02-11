package carinterface;

public class CarDriver {
	private String name;
	private int license;
	
	public CarDriver() {
	}
	
	public CarDriver(String name, int license) {
		this.name = name;
		this.license = license;
	}
	
	//getter, setter 추가해줘야지 저 private 변수들이 다른 애들한테도 쓰이기 가능
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public int getLicense() {
		return license;
	}
	
	public void setLicense(int license) {
		this.license = license;
	}
	
	
	@Override
	public String toString() {
		return "CarDriver{" +
				"name='" + name + '\'' +
					", license" + license + '}' ;
	}
	
}