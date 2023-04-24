package com.omar.template.controller;

import com.omar.template.config.ApiConfig;
import com.omar.template.model.WeatherResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/weather")
@Slf4j
public class WeatherController {
    @Autowired
    ApiConfig apiConfig;

    private final String apiKey = "68b17849faa64b0ca7f111549232204";

    private final String url = "http://api.weatherapi.com/v1/current.json?key=" + apiKey;

    @PostMapping
    public ResponseEntity<?> getWeather(@RequestParam(name = "Location") String location){
        String finalUrl = url + "&q=" + location;

        HttpHeaders headers = new HttpHeaders();
        headers.set("Api-Key", apiKey);
        HttpEntity<?> entity = new HttpEntity<>(headers);

        ResponseEntity<WeatherResponse> response = apiConfig.restTemplate().exchange(
                finalUrl,
                HttpMethod.GET,
                entity,
                WeatherResponse.class
        );

        WeatherResponse weatherResponse = response.getBody();

        return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
    }

}
