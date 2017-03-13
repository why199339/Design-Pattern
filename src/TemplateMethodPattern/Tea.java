package TemplateMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Lemon");
	}

	@Override
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
	private String getUserInput() {
		String answer = null;
		System.out.println("Would you like lemon?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(answer == null) {
			return "no";
		}
		return answer;
		
	}
}
