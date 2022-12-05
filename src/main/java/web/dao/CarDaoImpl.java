package web.dao;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarDaoImpl implements CarDao {
    private static List<Car> list = new ArrayList<>();
    static {
        list.add(new Car("BMW","3",250));
        list.add(new Car("AUDI","A5",210));
        list.add(new Car("TESLA","7",290));
        list.add(new Car("PORSHE","2",320));
        list.add(new Car("LADA","9",140));
    }
    @Override
    public List<Car> getCars(int amount) {
        return getListCars(amount);
    }

    private List<Car> getListCars(int amount) {
        return list.stream().limit(amount).collect(Collectors.toList());
    }
}
