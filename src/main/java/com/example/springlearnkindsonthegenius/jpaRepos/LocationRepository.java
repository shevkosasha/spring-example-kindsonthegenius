package com.example.springlearnkindsonthegenius.jpaRepos;

import com.example.springlearnkindsonthegenius.Model.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository  extends CrudRepository<Location, String> {

    //With this the crud methods are now available
    public List<Location> findByName(String name);
}
