package pl.oskarpolak.weatherinfo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.oskarpolak.weatherinfo.models.WeatherService;

@Controller
public class MainController {

    private WeatherService weatherService;

    @Autowired
    public MainController(WeatherService weatherService){
        this.weatherService = weatherService;
    }

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return String.valueOf(weatherService.makeCall("Kraków").getGlobalStats().getTemperature());
    }
}
