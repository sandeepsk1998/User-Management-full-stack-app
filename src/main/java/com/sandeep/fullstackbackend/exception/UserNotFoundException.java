package com.sandeep.fullstackbackend.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id) {
        super("Could not find user with Id " + id);
    }

}
