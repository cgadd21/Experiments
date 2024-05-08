package com.springboot.springboot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.springboot.springboot.models.Observation;

@RestController
@RequestMapping("/observation")
public class ObservationController {

    @Value("${WEATHER_API}")
    private String apiUrl;

    public static class ObservationList {
        private Observation[] observations;

        public Observation[] getObservations() {
            return observations;
        }

        public void setObservations(Observation[] observations) {
            this.observations = observations;
        }
    }

    @GetMapping
    public Observation[] getObservations() {

        RestTemplate restTemplate = new RestTemplate();
        ObservationList observationList = restTemplate.getForObject(apiUrl, ObservationList.class);

        return observationList != null ? observationList.getObservations() : new Observation[0];
    }
}
