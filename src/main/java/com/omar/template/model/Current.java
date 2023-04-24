package com.omar.template.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Current {

    @JsonProperty("last_updated_epoch")
    private int lastUpdatedEpoch;

    @JsonProperty("last_updated")
    private String lastUpdated;

    @JsonProperty("temp_c")
    private Float tempC;

    @JsonProperty("temp_f")
    private Float tempF;

    @JsonProperty("is_day")
    private Boolean isDay;

    private Condition condition;

    @JsonProperty("wind_mph")
    private Float windMph;

    @JsonProperty("wind_kph")
    private Float windKph;

    @JsonProperty("wind_degree")
    private int windDegree;

    @JsonProperty("wind_dir")
    private String windDir;

    @JsonProperty("pressure_mb")
    private Float pressureMb;

    @JsonProperty("pressure_in")
    private Float pressureIn;

    @JsonProperty("precip_mm")
    private Float precipMm;

    @JsonProperty("precip_in")
    private Float precipIn;

    private int humidity;

    private int cloud;

    @JsonProperty("feelslike_c")
    private Float feelslikeC;

    @JsonProperty("feelslike_f")
    private Float feelslikeF;

    @JsonProperty("vis_km")
    private Float visKm;

    @JsonProperty("vis_miles")
    private Float visMiles;

    private Float uv;

    @JsonProperty("gust_mph")
    private Float gustMph;

    @JsonProperty("gust_kph")
    private Float gustKph;

}
