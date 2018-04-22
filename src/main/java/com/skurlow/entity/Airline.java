package com.skurlow.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Class Airline.
 */
@Entity(name = "airlines")
public class Airline {

    @Id
    @Column(name = "airlineid")
    private Integer airlineId;
    private String name;
    private String alias;
    private String iata;
    private String icao;
    private String callsign;
    private String country;
    private String active;

    public Integer getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(Integer airlineId) {
        this.airlineId = airlineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Airline{");
        sb.append("airlineId=").append(airlineId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", alias='").append(alias).append('\'');
        sb.append(", iata='").append(iata).append('\'');
        sb.append(", icao='").append(icao).append('\'');
        sb.append(", callsign='").append(callsign).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", active='").append(active).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
