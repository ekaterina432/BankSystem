package CberTest;

import CberTest.contexts.ConfigUsers;
import CberTest.contexts.User;
import CberTest.contexts.UserService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class BankSystemApplication {

	public static void main(String[] args) {
		//context
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigUsers.class);
		UserService userService = context.getBean(UserService.class);
		userService.addUser(new User("Екатерина"));
		userService.addUser(new User("Виталий"));

		List<User> users =  userService.getAllUsers();
		for(User user: users){
			System.out.println(user);
		}
	}


}
