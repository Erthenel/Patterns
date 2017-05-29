package patterns.observer.example2.display;

import patterns.observer.example2.WeatherData;
import patterns.observer.example2.service.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ThirdPartyDisplay implements DisplayElement, Observer {
    private float pressure;

    private Observable observable;

    public ThirdPartyDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.pressure = weatherData.getPressure();

            display();
        }
    }

    @Override
    public void display() {
        System.out.println("ThirdParty pressure: " + pressure);
    }
}
