package patterns.observer.example1.display;

import patterns.observer.example1.service.DisplayElement;
import patterns.observer.example1.service.Observer;
import patterns.observer.example1.service.Subject;

public class ForecastDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;
    private int forecastType;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        if (this.humidity != 0) {
            if (Math.abs(humidity - this.humidity) <= 10) {
                forecastType = 2;
            } else if (humidity > this.humidity) {
                forecastType = 1;
            } else {
                forecastType = 3;
            }
        }

        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        switch (forecastType) {
            case 1:
                System.out.println("Forecast: Watch out for cooler, rainy weather.");
                break;
            case 2:
                System.out.println("Forecast: More of the same.");
                break;
            case 3:
                System.out.println("Forecast: Dry weather is coming.");
                break;
            default:
                System.out.println("Forecast: Improving weather on the way!");
        }
    }
}
