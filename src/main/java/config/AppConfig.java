package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan(basePackages = "config")
@Import(value = {BaseServiceConfig.class, EmailServiceConfig.class, UserServiceConfig.class})
public class AppConfig {

}
