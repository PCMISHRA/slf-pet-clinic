package com.prabhat.slfpetdemo.service;

import java.util.Set;

public interface CrudService <T,R> {
    T findById(Long R);
    T save(T t);
    Set<T> findAll();
}
