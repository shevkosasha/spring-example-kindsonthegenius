package com.example.socialdb.controllers;

import com.example.socialdb.Model.Location;
import com.example.socialdb.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LocationController {
    @Autowired
    private LocationService locationService;

    @RequestMapping(value = "/locations")
    public String getAllLocations(Model model){
        model.addAttribute("locationsList", locationService.getAllLocations());
        return "locations";
    }
//    @RequestMapping(value = "/locations")
//    public List<Location> getAllLocations() {
//        return locationService.getAllLocations();
//    }

    @RequestMapping(value = "/locations/{id}")
    public Location getLocation(@PathVariable String id) {
        return locationService.getLocation(id).get();
    }

    @RequestMapping(method=RequestMethod.POST, value="/locations")
    public void addLocation(@RequestBody Location location) {
        locationService.addLocation(location);
//        return lo
    }

    @RequestMapping(value = "/location/{id}", method = RequestMethod.DELETE)
    public void deleteLocation(@PathVariable String id) {
        locationService.deleteLocation(id);
    }

    @RequestMapping(value = "/locations/{id}", method = RequestMethod.PUT)
    public void updateLocation(@RequestBody Location location, @PathVariable String id) {
        locationService.updateLocation(id, location);
    }

    @RequestMapping(value = "/locations/name/{name}")
    public List<Location> getLocationByName(@PathVariable String name) {
        return locationService.getLocationsByName(name);
    }
}
