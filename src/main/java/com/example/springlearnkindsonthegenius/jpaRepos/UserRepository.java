package com.example.springlearnkindsonthegenius.jpaRepos;

import com.example.springlearnkindsonthegenius.Model.Student;
import com.example.springlearnkindsonthegenius.Model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String> {
//    Iterable<Object> findByLocationId(String id);
    public List<User> findByLocationId(String locationId);
    //With this the crud methods are now available

}
