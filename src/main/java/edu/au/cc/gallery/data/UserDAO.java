package edu.au.cc.gallery.data;

import java.util.List;

public interface UserDAO {
    List<User> getUsers() throws Exception;

    User getUserByUsername(String username) throws Exception;

    void addUser(User u) throws Exception;

    void updateUser(User u) throws Exception;

    void deleteUser(String username) throws Exception;
}

