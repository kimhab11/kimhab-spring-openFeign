package com.example.kimhabspringopenfeign.config;

import com.example.kimhabspringopenfeign.customeError.CustomErrorDecoder;
import feign.RequestInterceptor;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.ErrorDecoder;
import org.springframework.beans.factory.annotation.Value;
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
/*    @Bean
    public RequestInterceptor requestInterceptor(){
        return reqTemplate ->{
            reqTemplate.header("name","value");
        };
    }*/

    // error handling
    @Bean
    public ErrorDecoder customErrorDecoder() {
        return new CustomErrorDecoder();
    }

    // basic auth
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(
            @Value("${my-app.user}") String username,
            @Value("${my-app.pass}") String password){
        return new BasicAuthRequestInterceptor(username,password);
    }
}
