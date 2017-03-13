package TemplateMethodPattern;

public class TemplatMethodPattern {

	public static void main(String[] args) {

		Tea tea = new Tea();
		Coffie coffie = new Coffie();
		
		System.out.println("Making tea....");
		tea.prepareRecipe();
		System.out.println("Making coffie...");
		coffie.prepareRecipe();
	}

}
