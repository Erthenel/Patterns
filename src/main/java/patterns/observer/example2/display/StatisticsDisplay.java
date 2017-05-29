package patterns.observer.example2.display;

import patterns.observer.example2.WeatherData;
import patterns.observer.example2.service.DisplayElement;

import java.util.Observable;
import java.util.Observer;


public class StatisticsDisplay implements DisplayElement, Observer {
    private float maxTemperature = 0;
    private float minTemperature = 2000;

    private float sum;
    private int numberOfMeasurements;

    private float humidity;

    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = "
                + sum / numberOfMeasurements + "/"
                + maxTemperature + "/"
                + minTemperature);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            float temperature = weatherData.getTemperature();

            sum += temperature;
            numberOfMeasurements++;

            if (temperature > maxTemperature) {
                maxTemperature = temperature;
            }

            if (temperature < minTemperature) {
                minTemperature = temperature;
            }

            this.humidity = weatherData.getHumidity();

            display();
        }
    }
}
