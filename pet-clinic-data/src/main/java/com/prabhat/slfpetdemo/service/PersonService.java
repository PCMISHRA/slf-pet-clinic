package com.prabhat.slfpetdemo.service;

public interface PersonService<T> {
    T getByFirstName(String firstName);
}
