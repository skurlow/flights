package com.skurlow.controller;

import com.skurlow.jpa.RouteRepository;
import com.skurlow.resource.RouteResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Class RoutesController.
 */
@RestController
@RequestMapping("/routes")
public class RoutesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RoutesController.class);

    @Autowired
    private RouteRepository routeRepository;

    @GetMapping(path = "/out/{airport}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<RouteResource> flightsOut(@PathVariable String airport) {
        List<RouteResource> routes = new ArrayList<>();
        routeRepository.findByRouteKeySourceAirportCode(airport).stream().forEach(route -> {
            RouteResource routeResource = new RouteResource(route);
            routes.add(routeResource);
        });
        return routes;
    }

    @GetMapping(path = "/in/{airport}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<RouteResource> flightsIn(@PathVariable String airport) {
        List<RouteResource> routes = new ArrayList<>();
        routeRepository.findByRouteKeyDestinationAirportCode(airport).stream().forEach(route -> {
            RouteResource routeResource = new RouteResource(route);
            routes.add(routeResource);
        });
        return routes;
    }

    @GetMapping(path = "/between/{sourceAirport}/{destinationAirport}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<RouteResource> routesBetween(@PathVariable String sourceAirport, @PathVariable String destinationAirport) {
        List<RouteResource> routes = new ArrayList<>();
        routeRepository.findBetweenAirports(sourceAirport, destinationAirport).stream().forEach(route -> {
            RouteResource routeResource = new RouteResource(route);
            routes.add(routeResource);
        });
        return routes;
    }
}
