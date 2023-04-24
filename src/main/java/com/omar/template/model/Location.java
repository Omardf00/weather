package com.omar.template.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Location {

    private String name;

    private String region;

    private String country;

    private Float lat;

    @JsonProperty("tz_id")
    private String tzId;

    @JsonProperty("localtime_epoch")
    private int localtimeEpoch;

    @JsonProperty("localtime")
    private String localTime;

}
