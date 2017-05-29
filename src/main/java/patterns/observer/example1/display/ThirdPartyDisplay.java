package patterns.observer.example1.display;

import patterns.observer.example1.service.DisplayElement;
import patterns.observer.example1.service.Observer;
import patterns.observer.example1.service.Subject;

public class ThirdPartyDisplay implements DisplayElement, Observer {
    private Subject weatherData;
    private float pressure;

    public ThirdPartyDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("ThirdParty pressure: " + pressure);
    }
}
