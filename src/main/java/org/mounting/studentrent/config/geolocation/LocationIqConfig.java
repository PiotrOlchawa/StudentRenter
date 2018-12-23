package org.mounting.studentrent.config.geolocation;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class LocationIqConfig {

    @Value("${LocationIqToken}")
    private String token;
    @Value("${LocationIqEndpoint}")
    private String endpoint;
}
