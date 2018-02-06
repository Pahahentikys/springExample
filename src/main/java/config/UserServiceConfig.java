package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import serv.UserService;
import servImpl.UserServiceImpl;

/**
 * @author Pahahentikys on 07.02.2018
 */
@Configuration
public class UserServiceConfig {

//    @Autowired
//    private ServiceConfig serviceConfig;
//
//    @Autowired
//    private DataBaseConfig dataBaseConfig;

    @Bean
    public UserService userService(){

//        serviceConfig.emailMsgService();
//
//        dataBaseConfig.dataBaseSource();

        return new UserServiceImpl();
    }

    @Bean
    public UserService userService1(){

        return new UserServiceImpl();
    }
}
