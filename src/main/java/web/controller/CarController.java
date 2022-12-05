package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarDao carDao;

    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping
    public String getCars(Model model, @RequestParam(value = "amount", required = false, defaultValue = "5") int amount) {
        model.addAttribute("cars", carDao.getCars(amount));
        return "cars";
    }


}
