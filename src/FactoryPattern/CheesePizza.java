package FactoryPattern;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory pizzaIngredientFactory;
	
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = pizzaIngredientFactory.createDough();
		cheese = pizzaIngredientFactory.createCheese();
	}
	

}
