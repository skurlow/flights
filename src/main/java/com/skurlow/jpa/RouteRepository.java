package com.skurlow.jpa;

import com.skurlow.entity.Route;
import com.skurlow.entity.RouteKey;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Arrays;
import java.util.List;

/**
 * Interface RouteRepository.
 */
public interface RouteRepository extends CrudRepository<Route, RouteKey> {

    List<Route> findByRouteKeySourceAirportCode(String sourceAirportCode);

    List<Route> findByRouteKeyDestinationAirportCode(String destinationAirportCode);

    @Query("select r from routes r where r.routeKey.sourceAirportCode = :srcAirport and r.routeKey.destinationAirportCode = :destAirport and r.airline.active = 'Y' order by r.stops")
    List<Route> findBetweenAirports(@Param("srcAirport") String srcAirport, @Param("destAirport") String destAirport);
}
