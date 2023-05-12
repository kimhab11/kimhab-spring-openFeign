package com.example.kimhabspringopenfeign.customeError.exeption;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message){
        super(message);
    }
}
