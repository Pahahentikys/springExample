package servImpl;

import dom.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import serv.UserService;

public class UserServiceImpl implements UserService {

    private static Logger log = LogManager.getLogger(UserServiceImpl.class.getName());

    @Override
    public void saveUser(User user) {
        log.info("This user: " + user + " will be saved");
    }
}
