package com.example.service;

import com.example.model.User;

import java.util.List;

public interface UserService {

  public List<User> findUsers();

  public void addUser(User user);

  public boolean getUser(String name, String password);

}
