package balloonexample;

public class Ballon {

	void fillAir(Air a) {
		System.out.println("Filled with air");
	}

	void fillNitrogen(Nitrogen n) {
		System.out.println("Filled with Nitrogen");
	}

	public static void main(String[] args) {
		Ballon b = new Ballon();
		Air a = new Air();
		b.fillAir(a);

		Ballon b2 = new Ballon();
		Nitrogen n = null;
		b2.fillNitrogen(n);
		
		
		Ballon b3 = new Ballon();
		Water w = new Water();
		b3.fillWater(w);
		
		
	}

	private void fillWater(Water w) {
		System.out.println("Filled water");
		
	}
}
