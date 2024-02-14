package com.example.springlearnkindsonthegenius.jpaRepos;

import com.example.springlearnkindsonthegenius.Model.Post;
import com.example.springlearnkindsonthegenius.Model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, String> {

    //With this the crud methods are now available
    public List<Post> findByUserId(String userId);
}
