package CberTest.contexts;

import CberTest.contexts.User;
import CberTest.contexts.Users;

import java.util.ArrayList;
import java.util.List;

public class UsersImpl  implements Users {
    private List<User> users = new ArrayList<>();

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public void addUser(User user){
        users.add(user);
    }



}
