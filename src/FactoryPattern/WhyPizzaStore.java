package FactoryPattern;

public class WhyPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new WhyFactory();
		
		if(type.equals("meet")) {
			pizza = new MeetPizza(pizzaIngredientFactory);
			pizza.setName("Why Meet Pizza");
		}
			
		return pizza;
	}

}
