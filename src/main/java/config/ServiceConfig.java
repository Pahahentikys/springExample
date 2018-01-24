package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import serv.EmailMsgService;
import servImpl.EmailMsgServiceImpl;

@Configuration
public class ServiceConfig {

    @Bean
    EmailMsgService emailMsgService(){
        return new EmailMsgServiceImpl();
    }
}
