package method;

public class Converter {

	public int add(int a, int b) {

		int res = a + b;
		System.out.println(res);
		return res;

	}


	public double convertToINR(double uSD) {
		double rate = 63.72;
		double rupees= rate * uSD;
		return rupees;

	}
	
	
	
	public double convertToFohrenhiet(double celcuis) {
		double fah = celcuis*1.8+32;
		System.out.println(fah);
		return fah;
	
		
	}

	public static void main(String[] args) {
		Converter a = new  Converter();
		double value =	a.convertToINR(22);
		System.out.println("The value in INR is "+ value);
		
		a.convertToFohrenhiet(29);

	}
}
