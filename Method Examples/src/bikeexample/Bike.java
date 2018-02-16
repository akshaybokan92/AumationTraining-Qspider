package bikeexample;

public class Bike {


	String color = "Black";
	double price = 30000;
	int noOfWheels =2 ;
	boolean isWorking = true;

	public void fillFuel(Petrol p) {
		System.out.println("Bike Filled with Petrol");
	}

	public void start() {
		System.out.println("Bike Start");
		
	}

}
