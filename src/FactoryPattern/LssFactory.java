package FactoryPattern;

public class LssFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinDough();
	}

	@Override
	public Sauce createSauce() {
		return new PotatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new SourCheese();
	}

}
