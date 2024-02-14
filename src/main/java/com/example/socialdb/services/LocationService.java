package com.example.socialdb.services;

import com.example.socialdb.Model.Location;
import com.example.socialdb.jpaRepos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    public LocationRepository locationRepository;

    public List<Location> getAllLocations() {
        return (List<Location>) locationRepository.findAll();
    }

    public void addLocation(Location location) {
        locationRepository.save(location);
    }

    public Optional<Location> getLocation(String id) {
        return locationRepository.findById(id);
    }

    public void updateLocation(String id, Location location) {
        locationRepository.save(location);
    }

    public void deleteLocation(String id) {
        locationRepository.deleteById(id);
    }

    public List<Location> getLocationsByName(String name) {
        List<Location> locations  = new ArrayList<>();
        locationRepository.findByName(name)
                .forEach(locations::add);
        return locations;
    }
}
