package patterns.observer.example1.display;

import patterns.observer.example1.service.DisplayElement;
import patterns.observer.example1.service.Observer;
import patterns.observer.example1.service.Subject;

public class StatisticsDisplay implements DisplayElement, Observer {
    private float maxTemperature = 0;
    private float minTemperature = 2000;

    private float sum;
    private int numberOfMeasurements;

    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        sum += temperature;
        numberOfMeasurements++;

        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }

        if (temperature < minTemperature) {
            minTemperature = temperature;
        }

        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = "
                + sum / numberOfMeasurements + "/"
                + maxTemperature + "/"
                + minTemperature);
    }
}
