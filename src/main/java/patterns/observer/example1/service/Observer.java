package patterns.observer.example1.service;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
