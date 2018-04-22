package com.skurlow.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * Class RouteKey.
 */
@Embeddable
public class RouteKey implements Serializable {

    @Column(name = "airline")
    private String airlineCode;
    @Column(name = "srcairport")
    private String sourceAirportCode;
    @Column(name = "destairport")
    private String destinationAirportCode;

    public String getAirlineCode() {
        return airlineCode;
    }

    public String getSourceAirportCode() {
        return sourceAirportCode;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RouteId{");
        sb.append("airlineCode='").append(airlineCode).append('\'');
        sb.append(", sourceAirportCode='").append(sourceAirportCode).append('\'');
        sb.append(", destinationAirportCode='").append(destinationAirportCode).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RouteKey routeKey = (RouteKey) o;
        return Objects.equals(airlineCode, routeKey.airlineCode) &&
                Objects.equals(sourceAirportCode, routeKey.sourceAirportCode) &&
                Objects.equals(destinationAirportCode, routeKey.destinationAirportCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(airlineCode, sourceAirportCode, destinationAirportCode);
    }
}
