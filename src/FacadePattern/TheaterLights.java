package FacadePattern;

public class TheaterLights {

	public void on() {
		System.out.println("light is on");
	}
	
	public void dim(int num) {
		System.out.println("light is dim to: " + num);
	}
}
