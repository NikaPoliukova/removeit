package com.example.service;

import com.example.model.User;
import com.example.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> findUsers() {
    return userRepository.findUsers();
  }

  public void addUser(User user) {
    userRepository.addUser(user.getUserName(), user.getPassword());
  }

  public boolean getUser(String name, String password) {
    return userRepository.getUser(name, password);
  }

}
