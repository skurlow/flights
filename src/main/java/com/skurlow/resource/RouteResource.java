package com.skurlow.resource;

import com.skurlow.entity.Route;

/**
 * Class RouteResource.
 */
public class RouteResource {
    private String airline;
    private String fromAirport;
    private String fromCity;
    private String fromCountry;
    private String toAirport;
    private String toCity;
    private String toCountry;
    private int stops;

    public RouteResource(Route route) {
        this.airline = route.getAirline().getName();
        this.fromAirport = route.getSourceAirport().getName();
        this.fromCity = route.getSourceAirport().getCity();
        this.fromCountry = route.getSourceAirport().getCountry();
        this.toAirport = route.getDestinationAirport().getName();
        this.toCity = route.getDestinationAirport().getCity();
        this.toCountry = route.getDestinationAirport().getCountry();
        this.stops = route.getStops();
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public String getToAirport() {
        return toAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public String getToCountry() {
        return toCountry;
    }

    public void setToCountry(String toCountry) {
        this.toCountry = toCountry;
    }

    public int getStops() {
        return stops;
    }

    public void setStops(int stops) {
        this.stops = stops;
    }
}
