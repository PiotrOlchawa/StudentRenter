package org.mounting.studentrent.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationIQDataDto {

    @JsonProperty("place_id")
    private String place_id;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("lon")
    private String lon;
    @JsonProperty("display_name")
    private String display_name;
/*  @JsonProperty("license")
    private String licence;
    @JsonProperty("osm_type")
    private String osm_type;
    @JsonProperty("osm_id")
    private String osm_id;
    @JsonProperty("bounding_box")
    private Long boundingbox[] = new Long[4];
    @JsonProperty("class")
    private String classs;
    @JsonProperty("type")
    private String type;
    @JsonProperty("importance")
    private String importance;*/
}
