package com.example.kimhabspringopenfeign.fallback;

import com.example.kimhabspringopenfeign.feign_interface.JSONPlaceHolderClient;
import com.example.kimhabspringopenfeign.model.JSONPlaceHolderPostModel;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class JSONPlaceHolderFallback implements JSONPlaceHolderClient {
    @Override
    public List<JSONPlaceHolderPostModel> getPosts() {
        return Collections.emptyList();
    }

    @Override
    public JSONPlaceHolderPostModel getPostById(Long postId) {
        return null;
    }
}
