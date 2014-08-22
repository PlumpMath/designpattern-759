public class Person {
	private Phone homePhone;
	private Phone officePhone;
	private Car owns;
	
	public Person() {
		
	}
	
	public void setCar(Car car) {
		this.owns = car;
	}
	
	public Car getCar() {
		return this.owns;
	}
	
	public void sethomePhone(Phone phone) {
		this.homePhone = phone;
	}
	
	public void setOfficePhone(Phone phone) {
		this.officePhone = phone;
	}
	
	public Phone getHomePhone() {
		return homePhone;
	}
	
	public Phone getOfficePhone() {
		return officePhone;
	}
}
