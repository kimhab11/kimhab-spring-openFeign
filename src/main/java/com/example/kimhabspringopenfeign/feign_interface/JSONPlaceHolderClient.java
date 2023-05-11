package com.example.kimhabspringopenfeign.feign_interface;

import com.example.kimhabspringopenfeign.ClientConfiguration;
import com.example.kimhabspringopenfeign.model.JSONPlaceHolderFallback;
import com.example.kimhabspringopenfeign.model.Post;
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
    List<Post> getPosts();

    @RequestMapping(method = RequestMethod.GET, value = "/posts/{postId}", produces = "application/json")
    Post getPostById(@PathVariable("postId") Long postId);
}
