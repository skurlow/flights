package com.skurlow.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Class Route.
 */
@Entity(name = "routes")
public class Route {

    @EmbeddedId
    private RouteKey routeKey;
    @ManyToOne
    @JoinColumn(name = "airlineid")
    private Airline airline;
    @ManyToOne
    @JoinColumn(name = "srcairportid")
    private Airport sourceAirport;
    @ManyToOne
    @JoinColumn(name = "destairportid")
    private Airport destinationAirport;
    private String codeshare;
    private int stops;
    private String equipment;

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Airport getSourceAirport() {
        return sourceAirport;
    }

    public void setSourceAirport(Airport sourceAirport) {
        this.sourceAirport = sourceAirport;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(Airport destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getCodeshare() {
        return codeshare;
    }

    public void setCodeshare(String codeshare) {
        this.codeshare = codeshare;
    }

    public int getStops() {
        return stops;
    }

    public void setStops(int stops) {
        this.stops = stops;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Route{");
        sb.append("routeKey=").append(routeKey);
        sb.append(", airline=").append(airline);
        sb.append(", sourceAirport=").append(sourceAirport);
        sb.append(", destinationAirport=").append(destinationAirport);
        sb.append(", codeshare='").append(codeshare).append('\'');
        sb.append(", stops=").append(stops);
        sb.append(", equipment='").append(equipment).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
