package car;

public class Racetrack {

	public static void main(String[] args) {
		Car car = new Car();
		Moto moto = new Moto();
		car.powerOn();
		System.out.println(car.getChassi()+"\n");
		System.out.println(moto.getChassi());
		moto.powerOn();
	}

}
