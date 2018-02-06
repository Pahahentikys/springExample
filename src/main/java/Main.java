import config.AppConfig;
import dom.DataBaseSource;
import dom.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import serv.EmailMsgService;
import serv.ServiceManager;
import serv.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static Logger log = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

//        UserService userService = applicationContext.getBean(UserService.class);

//        UserService userService = (UserService) applicationContext.getBean("userService");

        UserService userService = (UserService) applicationContext.getBean("userService1");

//        EmailMsgService emailMsgService = applicationContext.getBean(EmailMsgService.class);

        DataBaseSource dataBaseSource = applicationContext.getBean(DataBaseSource.class);

        List<User> userList = new ArrayList<>();

        User user = new User(1, "Nick", "Markov");
        User user1 = new User(2, "Petr", "Fedorov");
        User user2 = new User(3, "Pavel", "Krasilnikov");

        userList.add(user);
        userList.add(user1);
        userList.add(user2);

        System.out.println(
                userList.stream()
                        .filter(u -> u.getFirstName() == "Petr")
                        .collect(Collectors.toList())
        );

        userService.saveUser(user);

//        emailMsgService.sendMessageOnEmail();

        log.info(dataBaseSource.getDriverName() + ", " +
                dataBaseSource.getName() + ", " +
                dataBaseSource.getPass() + ", " +
                dataBaseSource.getUrl()
        );

        ServiceManager serviceManager = applicationContext.getBean(ServiceManager.class);
        serviceManager.sendMessage(user);

        ((ConfigurableApplicationContext) applicationContext).close();

    }
}
