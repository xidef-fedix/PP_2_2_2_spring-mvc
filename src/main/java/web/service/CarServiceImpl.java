package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    public List<Car> getCar(int size) {
        List<Car> carList = new ArrayList<>();
        List<Car> carList2 = new ArrayList<>();
        carList.add(new Car("Lada Kalina", 1.8, "Mokriy asfalt"));
        carList.add(new Car("Tesla Model S", 0.0, "White"));
        carList.add(new Car("Mazda RX8", 3.2, "Red"));
        carList.add(new Car("Opel Astra", 1.6, "Purple"));
        carList.add(new Car("Mersedes Benz", 5.0, "Black"));
        if (size < 5) {
            for (int i = 0; i < size; i++) {
                carList2.add(carList.get(i));
            }
            return carList2;
        } else {
            return carList;
        }
    }
}
