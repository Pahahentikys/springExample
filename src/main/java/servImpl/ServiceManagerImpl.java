package servImpl;

import dom.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import serv.EmailMsgService;
import serv.ServiceManager;

/**
 * @author Pahahentikys on 07.02.2018
 */
public class ServiceManagerImpl implements ServiceManager {

    @Autowired
    @Qualifier("YandexEmailMsgService")
//    @Qualifier("YahooEmailMsgService")
    private EmailMsgService emailMsgService;

    @Override
    public void sendMessage(User user) {
        emailMsgService.sendMessageOnEmail();
    }
}
