package com.example.socialdb.controllers;

import com.example.socialdb.Model.Post;
import com.example.socialdb.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/posts")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @RequestMapping(value = "/posts/{id}")
    public Post getPost(@PathVariable String id) {
        return postService.getPost( id).get();
    }

    @RequestMapping(value = "/posts", method = RequestMethod.POST)
    public void addPost(@RequestBody Post post) {
        postService.addPost(post);
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
    public void deletePost(@PathVariable String id) {
        postService.deletePost(id);
    }

    @RequestMapping(value="/posts/{id}", method = RequestMethod.PUT)
    public void updatePost(@PathVariable String id, @RequestBody Post post) {
        postService.updatePost(id, post);
    }
}
