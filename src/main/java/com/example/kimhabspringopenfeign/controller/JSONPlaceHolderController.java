package com.example.kimhabspringopenfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JSONPlaceHolderController{
    private final JSONPlaceHolderClient jsonPlaceHolderClient;

    public JSONPlaceHolderController(JSONPlaceHolderClient jsonPlaceHolderClient) {
        this.jsonPlaceHolderClient = jsonPlaceHolderClient;
    }

    @GetMapping()
    public List<Post> getPosts() {
        return jsonPlaceHolderClient.getPosts();
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable("id") long id) {
        return jsonPlaceHolderClient.getPostById(id);
    }

}
