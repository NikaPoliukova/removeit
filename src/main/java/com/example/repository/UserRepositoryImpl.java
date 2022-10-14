package com.example.repository;

import com.example.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UserRepositoryImpl implements UserRepository {
    private final Connection connection;

    private static final String SHOW_All_USERS = "SELECT name,password FROM users";
    private final static String ADD_USER = "INSERT INTO users (name, password) VALUES (?,?)";
    private static final String GET_USER = "select name, password from users where name = ?";
    private static final String FIND_USER = "select * users WHERE name=? AND password=?";

    public UserRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    public List<User> findUsers() {
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(SHOW_All_USERS);
            final List<User> userList = new ArrayList<User>();
            while (rs.next()) {
                final User user = new User(
                        rs.getString("name"),
                        rs.getString("password"));
                userList.add(user);
            }
            return userList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addUser(String name, String password) {
        try {
            PreparedStatement statement = connection.prepareStatement(ADD_USER);
            statement.setString(1, name);
            statement.setString(2, password);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean getUser(String name, String password) {
        try (PreparedStatement statement = connection.prepareStatement(FIND_USER)) {
            statement.setString(1, name);
            statement.setString(2, password);

            try (ResultSet rs = statement.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException se) {
            se.printStackTrace();
            return false;
        }
    }
}


