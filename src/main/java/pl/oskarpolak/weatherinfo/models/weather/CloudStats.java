package pl.oskarpolak.weatherinfo.models.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CloudStats {
    @JsonProperty("all")
    private int clouds;
}
