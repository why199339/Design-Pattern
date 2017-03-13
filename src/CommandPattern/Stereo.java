package CommandPattern;

public class Stereo {

	private String name;
	private int volume;
	
	public Stereo(String name) {
		this.name = name;
	}
	
	public void on() {
		System.out.println(name + " Stereo is on");
	}
	
	public void off() {
		System.out.println(name + " Stereo is off");
	}
	
	public void setCd() {
		System.out.println(name + " Stereo is set for Cd imput");
	}
	
	public void setVolume(int volume) {
		System.out.println(name + " Stereo volume set to " + volume);
	}
}
