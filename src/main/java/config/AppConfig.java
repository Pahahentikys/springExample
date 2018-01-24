package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import serv.UserService;
import servImpl.UserServiceImpl;

@ComponentScan(basePackages = "config")
@Import(value = {ServiceConfig.class})
public class AppConfig {

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
