package patterns.observer.example2.display;

import patterns.observer.example2.WeatherData;
import patterns.observer.example2.service.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements DisplayElement, Observer {
    private float humidity;
    private int forecastType;
    private Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
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

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            if (this.humidity != 0) {
                if (Math.abs(humidity - weatherData.getHumidity()) <= 10) {
                    forecastType = 2;
                } else if (humidity > weatherData.getHumidity()) {
                    forecastType = 1;
                } else {
                    forecastType = 3;
                }
            }

            display();
        }
    }
}
