package FacadePattern;

public class DvdPlayer {

	public void on() {
		System.out.println("dvd is on");
	}
	
	public void play(String movie) {
		System.out.println("play movie :" + movie);
	}
	
	public void stop() {
		System.out.println("dvd is stop");
	}
	
	public void eject() {
		System.out.println("dvd is eject");
	}
	
	public void off() {
		System.out.println("dvd is off");
	}
}
