package FactoryPattern;

public class WhyFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickDough();
	}

	@Override
	public Sauce createSauce() {
		return new TomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new SweetCheese();
	}

}
