package ObserverPattern;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


interface DisplayElement_JDK {
	public void display();
}

class WeatherData_JDK extends Observable {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	
}

class CurrentConditionsDisplay_JDK implements Observer, DisplayElement_JDK {

	private float temperature;
	private float humidity;
	Observable observable;
	
	public CurrentConditionsDisplay_JDK(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData_JDK) {
			WeatherData_JDK weatherData = (WeatherData_JDK) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
		}
	}
	
}

public class ObserverPattern_JDK {

	public static void main(String[] args) {
		
		WeatherData_JDK weatherData = new WeatherData_JDK();
		CurrentConditionsDisplay_JDK currentDisplay = new CurrentConditionsDisplay_JDK(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 90, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		
	}

}
