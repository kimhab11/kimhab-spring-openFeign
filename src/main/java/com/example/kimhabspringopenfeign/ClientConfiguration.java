package com.example.kimhabspringopenfeign;

import feign.okhttp.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfiguration {

    // change default to OkHttpClient client
/*    @Bean
    public OkHttpClient client() {
        return new OkHttpClient();
    }*/

    // set Interceptor
    @Bean
    public CustomRequestInterceptor customRequestInterceptor() {
        return new CustomRequestInterceptor();
    }
}
