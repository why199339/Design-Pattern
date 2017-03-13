package FactoryPattern;

public class FactoryPattern {

	public static void main(String[] args) {
		
		WhyPizzaStore whyStore = new WhyPizzaStore();
		LssPizzaStore lssStore = new LssPizzaStore();

		Pizza pizza = whyStore.orderPizza("meet");
		System.out.println("why ordered a " + pizza.getName());
		System.out.println("-----------------------------------");
		pizza = lssStore.orderPizza("cheese");
		System.out.println("lss ordered a " + pizza.getName());
	}

}

