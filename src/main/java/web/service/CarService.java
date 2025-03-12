package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", "Camry"));
        cars.add(new Car(2, "Honda", "Civic"));
        cars.add(new Car(3, "Ford", "Mustang"));
        cars.add(new Car(4, "BMW", "X5"));
        cars.add(new Car(5, "Audi", "A4"));
    }

    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}