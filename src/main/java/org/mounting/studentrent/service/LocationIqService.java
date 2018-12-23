package org.mounting.studentrent.service;

import org.mounting.studentrent.config.geolocation.LocationIqConfig;
import org.mounting.studentrent.domain.LocationIQDataDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class LocationIqService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LocationIqService.class);

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LocationIqConfig locationIqConfig;

    public List<LocationIQDataDto> getCoordinatesByPlace(String userReadableCoordinates) {

        URI url = UriComponentsBuilder.fromHttpUrl(locationIqConfig.getEndpoint())
                .queryParam("key",locationIqConfig.getToken())
                .queryParam("q",userReadableCoordinates)
                .queryParam("format","json")
                .build().encode().toUri();
        LOGGER.info("URL: " + url);

        LocationIQDataDto[] locationIQDataDto = restTemplate.getForObject(url,LocationIQDataDto[].class);
        return Arrays.asList( Optional.ofNullable(locationIQDataDto).orElse(new LocationIQDataDto[0]));
    }

}
