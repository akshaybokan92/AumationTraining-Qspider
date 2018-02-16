package bikeexample;

public class TestBike {

	public static void main(String[] args) {
		Bike b = new Bike();
		Petrol p = new Petrol();
		b.fillFuel(p);
		b.start();
	}

}
