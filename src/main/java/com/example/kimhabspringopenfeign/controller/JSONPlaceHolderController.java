package com.example.kimhabspringopenfeign.controller;

import com.example.kimhabspringopenfeign.feign_interface.JSONPlaceHolderClient;
import com.example.kimhabspringopenfeign.model.JSONPlaceHolderPostModel;
import org.springframework.http.MediaType;
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

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<JSONPlaceHolderPostModel> getPosts() {
        return jsonPlaceHolderClient.getPosts();
    }

    @GetMapping("/{id}")
    public JSONPlaceHolderPostModel getPostById(@PathVariable("id") long id) {
        return jsonPlaceHolderClient.getPostById(id);
    }

}
