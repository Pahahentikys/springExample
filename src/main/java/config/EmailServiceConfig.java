package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import serv.EmailMsgService;
import servImpl.EmailMsgServiceImpl;
import servImpl.GmailEmailMsgServiceImpl;
import servImpl.YahooEmailMsgServiceImpl;
import servImpl.YandexEmailMsgServiceImpl;

/**
 * @author Pahahentikys on 07.02.2018
 */
@Configuration
public class EmailServiceConfig {

    @Bean
    EmailMsgService emailMsgService() {
        return new EmailMsgServiceImpl();
    }

    @Bean(name = "YahooEmailMsgService")
    EmailMsgService yahooEmailService() {
        return new YahooEmailMsgServiceImpl();
    }

    @Bean(name = "YandexEmailMsgService")
    EmailMsgService yandexEmailService() {
        return new YandexEmailMsgServiceImpl();
    }

    @Bean(name = "GmailEmailMsgService")
    EmailMsgService gmailEmailService() {
        return new GmailEmailMsgServiceImpl();
    }
}
