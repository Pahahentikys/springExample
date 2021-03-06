package servImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import serv.EmailMsgService;


/**
 * @author Pahahentikys on 07.02.2018
 */
public class YahooEmailMsgServiceImpl implements EmailMsgService {

    private static Logger log = LogManager.getLogger(YahooEmailMsgServiceImpl.class.getName());

    @Override
    public void sendMessageOnEmail() {
        log.info("It's yahoo!");
    }
}