package com.example.socialdb.jpaRepos;

import com.example.socialdb.Model.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository  extends CrudRepository<Location, String> {

    public List<Location> findByName(String name);
}
