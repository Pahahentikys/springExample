package config;

import dom.DataBaseSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBaseConfig {

    @Bean
    public DataBaseSource dataBaseSource() {
        DataBaseSource dataBaseSource = new DataBaseSource();
        dataBaseSource.setDriverName("DriverName");
        dataBaseSource.setName("DataBaseName");
        dataBaseSource.setPass("DataBasePass");
        dataBaseSource.setUrl("DataBaseUrl");
        return dataBaseSource;
    }

}
