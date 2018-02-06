package servImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import serv.EmailMsgService;

/**
 * @author Pahahentikys on 07.02.2018
 */
public class GmailEmailMsgServiceImpl implements EmailMsgService {

    private static Logger log = LogManager.getLogger(GmailEmailMsgServiceImpl.class.getName());

    @Override
    public void sendMsgWithEmail() {
        log.info("It's gmail!");
    }
}
