package com.example.springlearnkindsonthegenius.services;

import com.example.springlearnkindsonthegenius.Model.Location;
import com.example.springlearnkindsonthegenius.Model.Student;
import com.example.springlearnkindsonthegenius.jpaRepos.LocationRepository;
import com.example.springlearnkindsonthegenius.jpaRepos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

//    !-----new-----
    @Autowired
    public LocationRepository locationRepository;
    //our methods goes here

    public List<Location> getAllLocations() {
//        List<Location> locations = new ArrayList<>();
//        locationRepository.findAll().forEach(locations::add);

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
//    !-----old-----
//    Location location1 = new Location("l1", "Lagos");
//    Location location2 = new Location("l2", "Asaba");
//    Location location3 = new Location("l3", "Budapest");
//
////    List<Location> locations = Arrays.asList(location1, location2, location3);
//    List<Location> locations = new ArrayList<>(Arrays.asList(location1, location2, location3));
//
//    public List<Location> getAllLocations() {
//        return locations;
//    }
//
//    public Location getLocation(String id) {
//        Location location = locations.stream()
//                .filter(t -> id.equals(t.getId()))
//                .findFirst()
//                .orElse(null);
//        return location;
//    }
//
//    public List<Location> addLocation(Location location) {
//        locations.add(location);
//        return locations;
//    }
//
//    public void deleteLocation(String id) {
//        locations.removeIf(t -> t.getId().equals(id));
//    }
//
//    public void updateLocation(String id, Location location) {
//        for(int i = 0; i < locations.size(); i++) {
//            Location l = locations.get(i);
//            if (l.getId().equals(id)) {
//                locations.set(i, location);
//            }
//        }
//    }
}
