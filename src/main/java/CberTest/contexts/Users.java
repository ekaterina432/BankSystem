package CberTest.contexts;

import CberTest.contexts.User;

import java.util.List;

public interface Users {
    List<User> getAllUsers();
    void addUser (User user);
}
