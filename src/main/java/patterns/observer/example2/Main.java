package patterns.observer.example2;

import patterns.observer.example2.display.CurrentConditionsDisplay;
import patterns.observer.example2.display.ForecastDisplay;
import patterns.observer.example2.display.StatisticsDisplay;
import patterns.observer.example2.display.ThirdPartyDisplay;

/*
* The Observer Pattern defines a one-to-many
* dependency between objects so that when one
* object changes state, all of its dependents are
* notified and updated automatically.
*
*  This example is based on built in java Observer class.
 */

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData);

        ForecastDisplay forecastDisplay =
                new ForecastDisplay(weatherData);

        ThirdPartyDisplay thirdPartyDisplay =
                new ThirdPartyDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();

        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();

        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println();
    }
}
