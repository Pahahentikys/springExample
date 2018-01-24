package servImpl;

import dom.DataBaseSource;
import dom.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import serv.EmailMsgService;
import serv.UserService;

public class UserServiceImpl implements UserService {

    private static Logger log = LogManager.getLogger(UserServiceImpl.class.getName());

    @Autowired
    private DataBaseSource dataBaseSource;

    @Autowired
    private EmailMsgService emailMsgService;

    @Override
    public void saveUser(User user) {
        log.info("This user: " + user + " will be saved, it's DB: " + dataBaseSource.getUrl());


    }
}
