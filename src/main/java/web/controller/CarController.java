package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    @Autowired
    private CarService carService;
    @GetMapping("/cars")
    public String printCars(Model model, @RequestParam(value = "count", required = false) Integer count) {

        if (count != null) {
            model.addAttribute("carlist", carService.getCar(count));
        } else {
            model.addAttribute("carlist", carService.getCar(5));
        }
        return "cars";
    }
}
