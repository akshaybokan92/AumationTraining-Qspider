package coffeemachineexample;

public class TestCoffeeMachine {

	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		Milk m = new Milk();
		Sugar s = new Sugar();
		CoffeePowder cp = new CoffeePowder();

		Coffee cappucino = cm.prepareCoffee(m, s, cp);

	}
}
