package pl.oskarpolak.weatherinfo.models.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TempStats {
    @JsonProperty("temp")
    private float temperature;
    @JsonProperty("pressure")
    private int pressure;
}
