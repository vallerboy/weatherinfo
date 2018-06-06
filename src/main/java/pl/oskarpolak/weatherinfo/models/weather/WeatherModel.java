package pl.oskarpolak.weatherinfo.models.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherModel {
    @JsonProperty("main")
    private TempStats globalStats;
    @JsonProperty("clouds")
    private CloudStats cloudStats;

    private int visibility;
}
