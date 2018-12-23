package org.mounting.studentrent.controller;

import org.mounting.studentrent.domain.LocationIQDataDto;
import org.mounting.studentrent.service.LocationIqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class LocationController {

    @Autowired
    LocationIqService locationIqService;

    @GetMapping(value = "/getCoordinates/{location}")
    public List<LocationIQDataDto> getCoordinates(@PathVariable String location) {
        return locationIqService.getCoordinatesByPlace(location);
    }
}
