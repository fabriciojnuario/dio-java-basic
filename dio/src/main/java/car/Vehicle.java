package car;

public abstract class Vehicle {
	private String chassi = "45698356";

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public abstract void powerOn();

}
