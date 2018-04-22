package com.skurlow.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Class Airport.
 */
@Entity(name = "airports")
public class Airport {

    @Id
    @Column(name = "airportid")
    private int airportId;
    private String name;
    private String city;
    private String country;
    private String iata;
    private String icao;
    private double latitude;
    private double longitude;
    private int altitude;
    private int timezone;
    private String dst;
    private String tzdbtimezone;
    private String type;
    private String source;

    public int getAirportId() {
        return airportId;
    }

    public void setAirportId(int airportId) {
        this.airportId = airportId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public String getTzdbtimezone() {
        return tzdbtimezone;
    }

    public void setTzdbtimezone(String tzdbtimezone) {
        this.tzdbtimezone = tzdbtimezone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Airport{");
        sb.append("airportId=").append(airportId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", iata='").append(iata).append('\'');
        sb.append(", icao='").append(icao).append('\'');
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", altitude=").append(altitude);
        sb.append(", timezone=").append(timezone);
        sb.append(", dst='").append(dst).append('\'');
        sb.append(", tzdbtimezone='").append(tzdbtimezone).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", source='").append(source).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
