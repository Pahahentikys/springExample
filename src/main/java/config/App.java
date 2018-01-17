package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import serv.UserService;
import servImpl.UserServiceImpl;

@ComponentScan(basePackages = "config")
public class App {

    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }

    @Bean
    public UserService userService1(){
        return new UserServiceImpl();
    }
}
