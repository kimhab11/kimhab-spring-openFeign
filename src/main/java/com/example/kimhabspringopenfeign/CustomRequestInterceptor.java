package com.example.kimhabspringopenfeign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.apache.http.entity.ContentType;

public class CustomRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
//        requestTemplate.header("user", username);
//        requestTemplate.header("password", password);
//        requestTemplate.header("Authorization", "Bearer " + getToken());
        requestTemplate.header("Accept" , ContentType.APPLICATION_JSON.getMimeType());
    }
}
