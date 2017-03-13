package FacadePattern;

public class Amplifier {

	Tuner tuner;
	DvdPlayer dvdplayer;
	CdPlayer cdplayer;
	
	public void on() {
		System.out.println("Amplifier is on");
	}
	
	public void setDvdplayer(DvdPlayer dvdplayer) {
		System.out.println("Dvdplayer is set. ");
	}
	
	public void setVolume(int volume) {
		System.out.println("set volume: " + volume);
	}
	
	public void off() {
		System.out.println("Amplifier is off");
	}
}
