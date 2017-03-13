package CommandPattern;

public class CeilingFan {

	private String name;
	
	public CeilingFan(String name) {
		this.name = name;
	}
	
	public void on() {
		System.out.println(name + " CeilingFan is on");
	}
	
	public void off() {
		System.out.println(name + " CeilingFan is off");
	}
	
}
