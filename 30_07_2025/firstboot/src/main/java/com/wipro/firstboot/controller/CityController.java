package com.wipro.firstboot.controller;
import com.wipro.firstboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping("/cities")
    public String showCities(Model model) {
        List<String> cities = cityService.getCityList();
        model.addAttribute("cityList", cities);
        return "cities"; // Will look for src/main/resources/templates/cities.html
    }
}