package com.example.kimhabspringopenfeign.feign_interface;

import com.example.kimhabspringopenfeign.config.ClientConfiguration;
import com.example.kimhabspringopenfeign.fallback.JSONPlaceHolderFallback;
import com.example.kimhabspringopenfeign.model.JSONPlaceHolderPostModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(
        value = "jplaceholder" ,
        url = "https://jsonplaceholder.typicode.com/",
        fallback = JSONPlaceHolderFallback.class,
        configuration = ClientConfiguration.class
)

public interface JSONPlaceHolderClient {
    @RequestMapping(method = RequestMethod.GET, value = "/posts")
    List<JSONPlaceHolderPostModel> getPosts();

    @RequestMapping(method = RequestMethod.GET, value = "/posts/{postId}", produces = "application/json")
    JSONPlaceHolderPostModel getPostById(@PathVariable("postId") Long postId);
}
