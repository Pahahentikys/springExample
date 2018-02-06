package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import serv.EmailMsgService;
import serv.ServiceManager;
import servImpl.*;

@Configuration
public class BaseServiceConfig {

    @Bean
    ServiceManager serviceManager(){
        return new ServiceManagerImpl();
    }
}
