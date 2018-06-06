package pl.oskarpolak.weatherinfo.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.oskarpolak.weatherinfo.models.weather.WeatherModel;

@Service
public class WeatherService {

     @Value("${openweathermap.api_key}") //Odwołanie do pliku application.prop
     private String apiKey;
     private RestTemplate restTemplate;

    public WeatherService() {
        restTemplate = new RestTemplate();
    }

    public WeatherModel makeCall(String city){
        return restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey, WeatherModel.class);
    }
}
