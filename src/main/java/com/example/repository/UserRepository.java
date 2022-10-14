package com.example.repository;

import com.example.model.User;

import java.util.List;

public interface UserRepository {

    List<User> findUsers();

    boolean getUser(String name, String password);

    void addUser(String name, String password);


}