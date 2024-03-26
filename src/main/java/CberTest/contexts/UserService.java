package CberTest.contexts;

import CberTest.contexts.User;
import CberTest.contexts.Users;

import java.util.List;

public class UserService {
    private Users users;

    public UserService(Users users){this.users = users;}

    public void addUser(User user){
        users.addUser(user);
    }

    public List<User> getAllUsers(){
        return users.getAllUsers();
    }


}
