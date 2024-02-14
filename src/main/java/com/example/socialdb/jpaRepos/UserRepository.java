package com.example.socialdb.jpaRepos;

import com.example.socialdb.Model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String> {
    public List<User> findByLocationId(String locationId);
}
