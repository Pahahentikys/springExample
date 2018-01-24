package servImpl;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import serv.EmailMsgService;

public class EmailMsgServiceImpl implements EmailMsgService {

     private static Logger log = LogManager.getLogger(EmailMsgServiceImpl.class.getName());

    @Override
    public void sendMsgWithEmail() {
      log.info("Message on email will sended!");
    }
}
