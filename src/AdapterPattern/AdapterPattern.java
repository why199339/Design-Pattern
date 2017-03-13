package AdapterPattern;

public class AdapterPattern {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		testDuck(turkeyAdapter);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
