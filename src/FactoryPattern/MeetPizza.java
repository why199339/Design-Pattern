package FactoryPattern;

public class MeetPizza extends Pizza {

	PizzaIngredientFactory pizzaIngredientFactory;
	
	public MeetPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
	}

}
