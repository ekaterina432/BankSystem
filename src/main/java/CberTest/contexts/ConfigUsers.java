package CberTest.contexts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigUsers {
    @Bean
    public UserService userService(Users users){
        return new UserService(users);
    }

    @Bean
    public Users users(){
        return new UsersImpl();
    }


}
