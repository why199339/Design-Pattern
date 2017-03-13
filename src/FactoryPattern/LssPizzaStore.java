package FactoryPattern;

public class LssPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new LssFactory();
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("Lss Cheese Pizza");
		}
			
		return pizza;
	}

}
