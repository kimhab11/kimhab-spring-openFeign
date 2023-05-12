package com.example.kimhabspringopenfeign.customeError;

import com.example.kimhabspringopenfeign.customeError.exeption.BadRequestException;
import com.sun.jdi.InternalException;
import feign.FeignException;
import feign.Response;
import feign.codec.ErrorDecoder;

import java.io.FileNotFoundException;

public class CustomErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {
        switch (response.status()){
            case 400:
                return new FileNotFoundException();
            case 404:
                return new BadRequestException("Error");
            case 500:
                return new RuntimeException("###");
            default:
                return new Exception("@@");
        }
    }
}
