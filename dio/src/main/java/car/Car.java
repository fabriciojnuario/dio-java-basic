package car;

public class Car extends Vehicle{
	
	public void powerOn() {
		checkFuel();
		checkCambio();
		System.out.println("Power On");
	}
	
	private void checkFuel() {
		System.out.println("Fuel Ok!");
	}
	private void checkCambio() {
		System.out.println("Cambio Ok!");
	}
}
